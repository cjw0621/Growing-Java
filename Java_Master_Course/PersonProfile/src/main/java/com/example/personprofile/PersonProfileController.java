package com.example.personprofile;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.lang.module.ModuleDescriptor;

public class PersonProfileController {
    @FXML
    private Label profileText;

    @FXML
    protected void onHelloButtonClick() {
        profileText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onLoginButtonClick() {
        System.console();

    }
}