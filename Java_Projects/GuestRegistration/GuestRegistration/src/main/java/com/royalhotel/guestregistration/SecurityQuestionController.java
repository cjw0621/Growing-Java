package com.royalhotel.guestregistration;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class SecurityQuestionController {

    @FXML
    private MenuButton secQues1Id;
    @FXML
    private MenuItem menuItem11;
    @FXML
    private MenuItem menuItem12;
    @FXML
    private MenuItem menuItem13;
    @FXML
    private MenuButton secQues2Id;
    @FXML
    private MenuItem menuItem21;
    @FXML
    private MenuItem menuItem22;
    @FXML
    private MenuItem menuItem23;
    @FXML
    private MenuButton secQues3Id;
    @FXML
    private MenuItem menuItem31;
    @FXML
    private MenuItem menuItem32;
    @FXML
    private MenuItem menuItem33;
    @FXML
    private Button acceptButton;
    @FXML
    private TextField secQuest1TextBox;
    @FXML
    private TextField secQuest2TextBox;
    @FXML
    private TextField secQuest3TextBox;
    @FXML
    private Label errorLabel;

    @FXML
    public void onMenuItem11Click(ActionEvent actionEvent) {
        secQues1Id.setText(menuItem11.getText());
    }
    @FXML
    public void onMenuItem12Click(ActionEvent actionEvent) {
        secQues1Id.setText(menuItem12.getText());
    }
    @FXML
    public void onMenuItem13Click(ActionEvent actionEvent) {
        secQues1Id.setText(menuItem13.getText());
    }
    @FXML
    public void onMenuItem21Click(ActionEvent actionEvent) {
        secQues2Id.setText(menuItem21.getText());
    }
    @FXML
    public void onMenuItem22Click(ActionEvent actionEvent) {
        secQues2Id.setText(menuItem22.getText());
    }
    @FXML
    public void onMenuItem23Click(ActionEvent actionEvent) {
        secQues2Id.setText(menuItem23.getText());
    }
    @FXML
    public void onMenuItem31Click(ActionEvent actionEvent) {
        secQues3Id.setText(menuItem31.getText());
    }
    @FXML
    public void onMenuItem32Click(ActionEvent actionEvent) {
        secQues3Id.setText(menuItem32.getText());
    }
    @FXML
    public void onMenuItem33Click(ActionEvent actionEvent) {
        secQues3Id.setText(menuItem33.getText());
    }
    @FXML
    public void onAcceptButtonClick(ActionEvent actionEvent) throws SQLException, IOException {

        errorLabel.setText("");

        SqlHandler.setSecQuestQuery(SqlHandler.chkUsername(), secQues1Id.getText(), secQues2Id.getText(),
                secQues3Id.getText(), secQuest1TextBox.getText(), secQuest2TextBox.getText(),secQuest3TextBox.getText());

        if (SqlHandler.chkForSecAns()) {

            errorLabel.setText("Security questions were not completed.");

        } else {

            Stage thisStage = (Stage) acceptButton.getScene().getWindow();
            thisStage.close();

            Stage stage = new Stage();
            Pane root = FXMLLoader.load(Objects.requireNonNull(CreateNewUserController.class.getResource("GuestRegistrationLogin.fxml")));
            stage.setScene(new Scene(root, 700, 576));
            stage.setResizable(false);
            stage.setTitle("Registration");
            stage.show();
        }
    }
}
