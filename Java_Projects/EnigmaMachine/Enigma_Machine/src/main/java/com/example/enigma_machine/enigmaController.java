package com.example.enigma_machine;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class enigmaController implements Initializable {

   @FXML private ComboBox<Integer> digit1;
   @FXML private ComboBox<Integer> digit2;
   @FXML private ComboBox<Integer> digit3;
   @FXML private ComboBox<Integer> digit4;
   @FXML private ComboBox<Integer> digit5;
   @FXML private Label digit1Label;
   @FXML private Label digit2Label;
   @FXML private Label digit3Label;
   @FXML private Label digit4Label;
   @FXML private Label digit5Label;


   public void comboBoxUpdated(){
   }
   public void initialize(URL url, ResourceBundle rb) {

         digit1Label.setText("");
         digit2Label.setText("");
         digit3Label.setText("");
         digit4Label.setText("");
         digit5Label.setText("");

         digit1.getItems().addAll(0,1,2,3,4,5,6,7,8,9);
         digit2.getItems().addAll(0,1,2,3,4,5,6,7,8,9);
         digit3.getItems().addAll(0,1,2,3,4,5,6,7,8,9);
         digit4.getItems().addAll(0,1,2,3,4,5,6,7,8,9);
         digit5.getItems().addAll(0,1,2,3,4,5,6,7,8,9);


   }



}
