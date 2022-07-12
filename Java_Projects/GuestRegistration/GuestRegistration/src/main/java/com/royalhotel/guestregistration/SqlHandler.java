package com.royalhotel.guestregistration;

import java.sql.*;
import java.util.*;

public class SqlHandler {

    public static boolean getUsernameQuery(String username) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?profileSQL=true",
                    "root", "");

            PreparedStatement st = connection.prepareStatement("Select username from employee_login where username=?");

            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            System.out.println("Query executed");
            return rs.next();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

            return true;
        }
    }

    public static String recoverUsernameQuery(String email) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?profileSQL=true",
                    "root", "");

            PreparedStatement st = connection.prepareStatement("Select username from employee_login where email=?;");

            st.setString(1, email);
            ResultSet rs = st.executeQuery();
            System.out.println("Query executed");

            if(rs.next()) {

                return rs.getString("username");
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

        } return "Username not found";
    }


    public static boolean getLoginQuery(String username, String password) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?profileSQL=true",
                    "root", "");

            PreparedStatement st = connection.prepareStatement("Select username, password from employee_login where " +
                    "username=? and password=?");

            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();

            return rs.next();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

            return false;
        }
    }


    public static void setNewUserQuery(String username, String password, String email) {

        //adds new user profile data to database

        int id = 1;
        while (!SqlHandler.getLoginQuery(username, password) && (!username.isBlank() && !password.isBlank())) {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" +
                        "login?profileSQL=true", "root", "");

                PreparedStatement st = connection.prepareStatement("insert into employee_login (id, username, " +
                        "password, email) values (?, ?, ?, ?)");

                st.setInt(1, id);
                st.setString(2, username);
                st.setString(3, password);
                st.setString(4,email);
                st.execute();

                connection.close();
                break;
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();

            }
            id += 1;
        }
    }


    public static void setSecQuestQuery(String username, String q1, String q2, String q3, String a1, String a2, String a3) {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?profileSQL=true",
                    "root", "");

            PreparedStatement st = connection.prepareStatement("update employee_login set security_question_1=?, " +
                    "security_question_2=?, security_question_3=?, security_question_answer_1=?, " +
                    "security_question_answer_2=?, security_question_answer_3=? where username=?");

            if (q1.equals("Security Question 1") || q2.equals("Security Question 2") || q3.equals("Security Question 3") || a1.isBlank() || a2.isBlank() || a3.isBlank()) {

                //checks if any of the security questions are default and sets all sec questions and answers to null if true.

                st.setString(1, null);
                st.setString(2, null);
                st.setString(3, null);
                st.setString(4, null);
                st.setString(5, null);
                st.setString(6, null);

            } else {

                //Sets the users security question and answers and adds them to their profile data.

                st.setString(1, q1);
                st.setString(2, q2);
                st.setString(3, q3);
                st.setString(4, a1.toLowerCase());
                st.setString(5, a2.toLowerCase());
                st.setString(6, a3.toLowerCase());
            }
            st.setString(7, username);
            st.execute();

            connection.close();

        } catch (SQLException sqlException) {

            sqlException.printStackTrace();
        }
    }

    public static String chkUsername() throws SQLException {

        //Selects the last userprofile (this method is mainly used for checks internally)

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?profileSQL=true","root", "");

        PreparedStatement st = connection.prepareStatement("SELECT username FROM employee_login WHERE id=(SELECT MAX(id) FROM employee_login)");

        try {
            ResultSet rs = st.executeQuery();

            if (rs.next()) {

                return rs.getString(1);

            } else {
                return "Something bad happened";
            }

        } catch (SQLException e) {
            return "Username not found.";
        }
    }



    public static HashMap<String, String> getSecAnsQuery(String username) throws SQLException {

        //Retrieves the users security questions and answers and adds them to a hashmap.

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?profileSQL=true",
                "root", "");

        PreparedStatement st = connection.prepareStatement("SELECT * FROM employee_login");

        try {

            ResultSet rs = st.executeQuery();

            HashMap<String, String> userSecQues = new HashMap<>();

            //Query's the datatable
            while (rs.next()) {

                if (rs.getString(2).equals(username)) {

                    //set variables to security questions .getString query as well as answers
                    String secQues1 = rs.getString(4);
                    String secQues2 = rs.getString(5);
                    String secQues3 = rs.getString(6);
                    String secQuesAns1 = rs.getString(7);
                    String secQuesAns2 = rs.getString(8);
                    String secQuesAns3 = rs.getString(9);

                    //added users' data to hashmap
                    userSecQues.put(secQues1, secQuesAns1);
                    userSecQues.put(secQues2, secQuesAns2);
                    userSecQues.put(secQues3, secQuesAns3);

                }
            }

            return userSecQues;

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

            return null;
        }
    }

    public static boolean chkForSecAns() {

        //Retrieves and checks if security questions are null

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?profileSQL=true",
                    "root", "");

            PreparedStatement st = connection.prepareStatement("SELECT * FROM employee_login WHERE id=(SELECT MAX(id) FROM employee_login)");

            try {
                ResultSet rs = st.executeQuery();

                if (rs.next()) {

                    String secQues1 = rs.getString(4);

                    return (secQues1 == null);

                } else {

                    return false;
                }

            } catch (SQLException e) {

                throw new SQLException(e);
            }

        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
    }

    public static String getPassword(String username) throws SQLException {

        //This method is used to get the users password for password recovery

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?profileSQL=true", "root", "");
        PreparedStatement st = connection.prepareStatement("SELECT * FROM employee_login WHERE username=?");

        st.setString(1, username);

        ResultSet rs = st.executeQuery();

        if(rs.next()){
            return rs.getString(3);
        } else {
            return "Unable to find username. Try signing up again.";
        }

    }

}
