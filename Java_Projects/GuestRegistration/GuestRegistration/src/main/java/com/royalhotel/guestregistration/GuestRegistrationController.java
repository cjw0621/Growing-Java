package com.royalhotel.guestregistration;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class GuestRegistrationController {
    @FXML
    private Hyperlink forgotUser;
    @FXML
    private Hyperlink forgotPass;
    @FXML
    private Label forgetUserandPassText;
    @FXML
    private Label clickLinkText;
    @FXML
    private Label incorrectText;
    @FXML
    private Button signInButton;
    @FXML
    private Button signUpButton;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordPasswordField;

    int count = 0;
    @FXML
    public void onSignInButtonClick(ActionEvent actionEvent) throws IOException {

        String username = usernameTextField.getText();
        String password = passwordPasswordField.getText();

        if (SqlHandler.getLoginQuery(username, password)) {

            usernameTextField.setText("");
            passwordPasswordField.setText("");

            //Closes current stage
            Stage stage = (Stage) signInButton.getScene().getWindow();
            stage.close();

            //Opens main application stage
            Stage stage1 = new Stage();
            Pane root = FXMLLoader.load(Objects.requireNonNull(GuestRegistrationMainController.class.getResource("GuestRegistrationMain.fxml")));
            stage1.setScene(new Scene(root,770,811));
            stage1.setResizable(false);

            stage1.setTitle("Guest Registration Application");
            stage1.show();

        } else {
            forgetUserandPassText.setText("");
            incorrectText.setText("Incorrect username and password");
            count++;

        }

        if (count == 6) {
            incorrectText.setText("");
            forgetUserandPassText.setText("Don't have a username or password?");
            clickLinkText.setText("Sign up below");
        }
    }

    @FXML
    public void onSignUpButtonClick(ActionEvent actionEvent) {
        try {
            Stage thisStage = (Stage) signUpButton.getScene().getWindow();
            thisStage.close();

            Stage stage = new Stage();
            Pane root = FXMLLoader.load(Objects.requireNonNull(CreateNewUserController.class.getResource("CreateNewUser.fxml")));
            stage.setScene(new Scene(root,700,576));
            stage.setResizable(false);
            stage.setTitle("Registration");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onForgotUserClick(ActionEvent actionEvent) throws IOException {
        Stage thisStage = (Stage) forgotUser.getScene().getWindow();
        thisStage.close();

        Stage stage = new Stage();
        Pane root = FXMLLoader.load(Objects.requireNonNull(ForgotPasswordController.class.getResource("ForgotUsername.fxml")));
        stage.setScene(new Scene(root, 700, 576));
        stage.setResizable(false);
        stage.setTitle("Forgot Username");
        stage.show();
    }

    public void onForgotPassClick(ActionEvent actionEvent) throws IOException {
        Stage thisStage = (Stage) forgotPass.getScene().getWindow();
        thisStage.close();

        Stage stage = new Stage();
        Pane root = FXMLLoader.load(Objects.requireNonNull(ForgotPasswordController.class.getResource("ForgotPassword.fxml")));
        stage.setScene(new Scene(root, 700, 576));
        stage.setResizable(false);
        stage.setTitle("Forgot Password");
        stage.show();
    }
}