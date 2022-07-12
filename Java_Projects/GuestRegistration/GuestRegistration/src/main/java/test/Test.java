package test;

import com.royalhotel.guestregistration.SqlHandler;
import java.util.*;
import java.sql.SQLException;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) throws SQLException {

//        HashMap <String, String>  userSecQues;
//
//        System.out.println(SqlHandler.getSecAnsQuery("admin"));
//
//        userSecQues = SqlHandler.getSecAnsQuery("cjw0621");
//
//        ArrayList <String> userSecQuesArray = new ArrayList<>();
//        ArrayList <String> userSecAnsArray = new ArrayList<>();
//
//        assert userSecQues != null;
//
//        //foreach iterator through user hashmap
//        for(Map.Entry <String, String> keyValuePair : userSecQues.entrySet()){
//
//            String key =  keyValuePair.getKey();
//            String value =  keyValuePair.getValue();
//            userSecQuesArray.add(key);
//            userSecAnsArray.add(value);
//
//        }
//
//        System.out.println(userSecQuesArray.get(0));
//        System.out.println(userSecAnsArray.get(0));

//        System.out.println(SqlHandler.getPassword("cjw0621"));

       String email= SqlHandler.recoverUsernameQuery("b@gmail.com");
        System.out.println(email);


    }
}
