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

public class ForgotPasswordController {
    @FXML
   private Button getUsername;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField secAns1;
    @FXML
    private PasswordField secAns2;
    @FXML
    private PasswordField secAns3;
    @FXML
    private Button passRecovery;
    @FXML
    private Button backButton;
    @FXML
    protected Label secQues1;
    @FXML
    protected Label secQues2;
    @FXML
    protected Label secQues3;
    @FXML
    private Label receivePassText;


    @FXML
    public void onPassRecovButton(ActionEvent actionEvent) throws SQLException {

        receivePassText.setText("");

        if(SqlHandler.getUsernameQuery(usernameField.getText())) {
            HashMap<String, String> secQuesAns = SqlHandler.getSecAnsQuery(usernameField.getText());
            ArrayList<String> secAnsList = new ArrayList<>();

            assert secQuesAns != null;
            for (Map.Entry<String, String> keyValuePair : secQuesAns.entrySet()) {
                secAnsList.add(keyValuePair.getValue());
            }

            if ((secAns1.getText().toLowerCase().equals(secAnsList.get(0))) && (secAns2.getText().toLowerCase().equals(secAnsList.get(1))) && secAns3.getText().toLowerCase().equals(secAnsList.get(2))) {
                receivePassText.setText(SqlHandler.getPassword(usernameField.getText()));
            } else {
                receivePassText.setText("Username or security answers were incorrect.");
            }
        } else {
            receivePassText.setText("Username was not found. Try signing up.");
        }
    }

    @FXML
    public void onGetSecQues(ActionEvent actionEvent) throws SQLException {

        receivePassText.setText("");

        if(SqlHandler.getUsernameQuery(usernameField.getText())) {

            HashMap<String, String> secQuesAns = SqlHandler.getSecAnsQuery(usernameField.getText());
            ArrayList<String> secQuesList = new ArrayList<>();

            assert secQuesAns != null;
            for (Map.Entry<String, String> keyValuePair : secQuesAns.entrySet()) {
                secQuesList.add(keyValuePair.getKey());
            }

            secQues1.setText(secQuesList.get(0));
            secQues2.setText(secQuesList.get(1));
            secQues3.setText(secQuesList.get(2));

        } else if (usernameField.getText().isBlank()){

            receivePassText.setText("Please enter your username.");

        } else {
            receivePassText.setText("Username was not found. Try signing up.");
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
    public void onGetUsername(ActionEvent actionEvent) throws IOException {
        Stage thisStage = (Stage) getUsername.getScene().getWindow();
        thisStage.close();

        Stage stage = new Stage();
        Pane root = FXMLLoader.load(Objects.requireNonNull(ForgotUsernameController.class.getResource("ForgotUsername.fxml")));
        stage.setScene(new Scene(root, 700,576));
        stage.setResizable(false);
        stage.setTitle("Forgot Username");
        stage.show();
    }
}
