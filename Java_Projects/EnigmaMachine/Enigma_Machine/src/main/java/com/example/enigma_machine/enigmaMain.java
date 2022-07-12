package com.example.enigma_machine;

import javafx.scene.control.TextArea;

public class enigmaMain extends enigmaController {

    public String encryption(TextArea m, TextArea e) {

        enigmaController EC = new enigmaController();

        e.setText(m.getText() + " Family guy is hilarious" + EC.digit1ID.getText());


        return e.getText();

    }

    public String decryption(TextArea m, TextArea e) {

        e.setText(m.getText());

        return e.getText();
    }

}
