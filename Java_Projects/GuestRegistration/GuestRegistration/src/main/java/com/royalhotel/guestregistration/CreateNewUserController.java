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
import javafx.stage.StageStyle;
import java.io.IOException;
import java.util.Objects;

public class CreateNewUserController {
    @FXML
    private TextField emailTextField;
    @FXML
    private Label passwordMatchText;
    @FXML
    private PasswordField verifyPasswordField;
    @FXML
    private Label errorLabel;
    @FXML
    private Label successLabel;
    @FXML
    private Button backButton;
    @FXML
    private TextField createUsernameField;
    @FXML
    private Button createUserButton;
    @FXML
    private PasswordField createPasswordField;




    @FXML
    public void onCreateUserButton(ActionEvent actionEvent) throws IOException {
        successLabel.setText("");
        passwordMatchText.setText("");
        errorLabel.setText("");

        if (!createUsernameField.getText().isBlank() && !createPasswordField.getText().isBlank() && !verifyPasswordField.getText().isBlank()) {

            if (!SqlHandler.getUsernameQuery(createUsernameField.getText())) {

                if (createPasswordField.getText().equals(verifyPasswordField.getText())) {

                    if (SqlHandler.getLoginQuery(createUsernameField.getText(), createPasswordField.getText())) {

                        errorLabel.setText("Username already exists");

                    } else {

                        SqlHandler.setNewUserQuery(createUsernameField.getText(), createPasswordField.getText(), emailTextField.getText());
                        successLabel.setText("Login created");
                        createPasswordField.setText("");
                        verifyPasswordField.setText("");

                        Stage thisStage = (Stage) createUserButton.getScene().getWindow();
                        thisStage.close();

                        Stage stage = new Stage();
                        Pane root = FXMLLoader.load(Objects.requireNonNull(CreateNewUserController.class.getResource("SecurityQuestion.fxml")));
                        stage.setScene(new Scene(root, 700,576));
                        stage.setResizable(false);
                        stage.initStyle(StageStyle.UNDECORATED);
                        stage.setTitle("Security Question");
                        stage.showAndWait();

                    }

                } else {

                    passwordMatchText.setText("Password doesn't match");

                }

            } else {

                passwordMatchText.setText("Username already exists");

            }

        } else if (createUsernameField.getText().isBlank() && createPasswordField.getText().isBlank() ||
                !createUsernameField.getText().isBlank() && createPasswordField.getText().isBlank() ||
                createUsernameField.getText().isBlank() && !createPasswordField.getText().isBlank()) {

            errorLabel.setText("Please create a username and password");

        }
    }


    @FXML
    public void onBackButton(ActionEvent actionEvent) throws IOException {

        Stage thisStage = (Stage) backButton.getScene().getWindow();
        thisStage.close();

        Stage stage = new Stage();
        Pane root = FXMLLoader.load(Objects.requireNonNull(CreateNewUserController.class.getResource("GuestRegistrationLogin.fxml")));
        stage.setScene(new Scene(root,700,576));
        stage.setResizable(false);
        stage.setTitle("Registration");
        stage.show();

    }
}
