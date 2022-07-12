package com.example.enigma_machine;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class EnigmaMachine extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EnigmaMachine.class.getResource("enigma.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 721, 547);
        stage.setResizable(false);
        stage.setTitle("Enigma Machine");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}