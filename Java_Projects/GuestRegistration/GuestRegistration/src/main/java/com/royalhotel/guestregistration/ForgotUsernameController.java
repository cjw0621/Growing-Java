package com.royalhotel.guestregistration;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ForgotUsernameController {
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField secAns1;
    @FXML
    private PasswordField secAns2;
    @FXML
    private PasswordField secAns3;
    @FXML
    private Button usernameRecovery;
    @FXML
    private Button backButton;
    @FXML
    protected Label secQues1;
    @FXML
    protected Label secQues2;
    @FXML
    protected Label secQues3;
    @FXML
    private Label receiveUsernameText;

    @FXML
    public void onUsernameRecovButton(ActionEvent actionEvent) throws SQLException {
        receiveUsernameText.setText("");

        if(SqlHandler.getUsernameQuery(SqlHandler.recoverUsernameQuery(emailField.getText()))) {
            HashMap<String, String> secQuesAns = SqlHandler.getSecAnsQuery(SqlHandler.recoverUsernameQuery(emailField.getText()));
            ArrayList<String> secAnsList = new ArrayList<>();

            assert secQuesAns != null;
            for (Map.Entry<String, String> keyValuePair : secQuesAns.entrySet()) {
                secAnsList.add(keyValuePair.getValue());
            }

            if ((secAns1.getText().toLowerCase().equals(secAnsList.get(0))) && (secAns2.getText().toLowerCase().equals(secAnsList.get(1))) && secAns3.getText().toLowerCase().equals(secAnsList.get(2))) {
                receiveUsernameText.setText(SqlHandler.recoverUsernameQuery(emailField.getText()));
            } else {
                receiveUsernameText.setText("Username or security answers were incorrect.");
            }
        } else {
            receiveUsernameText.setText("Username was not found. Try signing up.");
        }

    }

    @FXML
    public void onBackButton(ActionEvent actionEvent) throws IOException {
        Stage thisStage = (Stage) backButton.getScene().getWindow();
        thisStage.close();

        Stage stage = new Stage();
        Pane root = FXMLLoader.load(Objects.requireNonNull(GuestRegistrationController.class.getResource("GuestRegistrationLogin.fxml")));
        stage.setScene(new Scene(root, 700, 576));
        stage.setResizable(false);
        stage.setTitle("Registration");
        stage.show();

    }

    @FXML
    public void onGetSecQues(ActionEvent actionEvent) throws SQLException {

        receiveUsernameText.setText("");

        if (!SqlHandler.recoverUsernameQuery(emailField.getText()).equals("Username not found")) {

            if(SqlHandler.getUsernameQuery(SqlHandler.recoverUsernameQuery(emailField.getText()))) {

                HashMap<String, String> secQuesAns = SqlHandler.getSecAnsQuery(SqlHandler.recoverUsernameQuery(emailField.getText()));
                ArrayList<String> secQuesList = new ArrayList<>();

                assert secQuesAns != null;
                for (Map.Entry<String, String> keyValuePair : secQuesAns.entrySet()) {
                    secQuesList.add(keyValuePair.getKey());
                }

                secQues1.setText(secQuesList.get(0));
                secQues2.setText(secQuesList.get(1));
                secQues3.setText(secQuesList.get(2));

            } else if (emailField.getText().isBlank()){

                receiveUsernameText.setText("Please enter your email.");

            } else {
                receiveUsernameText.setText("Email was not found. Try signing up.");
            }

        } else {

            receiveUsernameText.setText("No username associated with this email");
        }
    }


}
