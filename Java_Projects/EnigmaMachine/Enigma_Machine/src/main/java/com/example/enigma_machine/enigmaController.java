package com.example.enigma_machine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class enigmaController extends enigmaMain {

    @FXML
    private RadioButton encryptID;
    @FXML
    private RadioButton decryptID;
    @FXML
    private Button enterID;
    @FXML
    private TextArea messBoxID;
    @FXML
    private TextArea encryptMessageBox;
    @FXML
    private MenuItem code01T;
    @FXML
    private MenuItem code11T;
    @FXML
    private MenuItem code21T;
    @FXML
    private MenuItem code31T;
    @FXML
    private MenuItem code41T;
    @FXML
    private MenuItem code51T;
    @FXML
    private MenuItem code61T;
    @FXML
    private MenuItem code71T;
    @FXML
    private MenuItem code81T;
    @FXML
    private MenuItem code91T;
    @FXML
    private MenuItem code02T;
    @FXML
    private MenuItem code12T;
    @FXML
    private MenuItem code22T;
    @FXML
    private MenuItem code32T;
    @FXML
    private MenuItem code42T;
    @FXML
    private MenuItem code52T;
    @FXML
    private MenuItem code62T;
    @FXML
    private MenuItem code72T;
    @FXML
    private MenuItem code82T;
    @FXML
    private MenuItem code92T;
    @FXML
    private MenuItem code03T;
    @FXML
    private MenuItem code13T;
    @FXML
    private MenuItem code23T;
    @FXML
    private MenuItem code33T;
    @FXML
    private MenuItem code43T;
    @FXML
    private MenuItem code53T;
    @FXML
    private MenuItem code63T;
    @FXML
    private MenuItem code73T;
    @FXML
    private MenuItem code83T;
    @FXML
    private MenuItem code93T;
    @FXML
    private MenuItem code04T;
    @FXML
    private MenuItem code14T;
    @FXML
    private MenuItem code24T;
    @FXML
    private MenuItem code34T;
    @FXML
    private MenuItem code44T;
    @FXML
    private MenuItem code54T;
    @FXML
    private MenuItem code64T;
    @FXML
    private MenuItem code74T;
    @FXML
    private MenuItem code84T;
    @FXML
    private MenuItem code94T;
    @FXML
    private MenuItem code05T;
    @FXML
    private MenuItem code15T;
    @FXML
    private MenuItem code25T;
    @FXML
    private MenuItem code35T;
    @FXML
    private MenuItem code45T;
    @FXML
    private MenuItem code55T;
    @FXML
    private MenuItem code65T;
    @FXML
    private MenuItem code75T;
    @FXML
    private MenuItem code85T;
    @FXML
    private MenuItem code95T;
    @FXML
    private RadioButton radioAID;
    @FXML
    private RadioButton radioBID;
    @FXML
    private RadioButton radioCID;
    @FXML
    private MenuButton digit1ID;
    @FXML
    private MenuButton digit2ID;
    @FXML
    private MenuButton digit3ID;
    @FXML
    private MenuButton digit4ID;
    @FXML
    private MenuButton digit5ID;

    public void enterButton(ActionEvent actionEvent) {
        if(messBoxID.getText().isBlank()) {
            encryptMessageBox.setText("testing");
        }
        else {
            if(encryptID.selectedProperty().get()){
                encryptMessageBox.setText(enigmaMain.encryption(messBoxID.getText()));
            } else if(decryptID.selectedProperty().get()){
                encryptMessageBox.setText(enigmaMain.decryption(messBoxID.getText()));
            }
        }

    }

    public void digit1(ActionEvent actionEvent) {
    }

    public void digit2(ActionEvent actionEvent) {
    }

    public void digit3(ActionEvent actionEvent) {
    }

    public void digit4(ActionEvent actionEvent) {
    }

    public void digit5(ActionEvent actionEvent) {
    }

    public void radioA(ActionEvent actionEvent) {
        //ensures that only 1 radio button is selected when radio button A is selected.

        if(radioAID.selectedProperty().get()){
            radioBID.selectedProperty().set(false);
            radioCID.selectedProperty().set(false);
        }
    }

    public void radioB(ActionEvent actionEvent) {
        //ensures that only 1 radio button is selected when radio button B is selected.

        if(radioBID.selectedProperty().get()){
            radioAID.selectedProperty().set(false);
            radioCID.selectedProperty().set(false);
        }
    }

    public void radioC(ActionEvent actionEvent) {
        //ensures that only 1 radio button is selected when radio button C is selected.

        if(radioCID.selectedProperty().get()){
            radioAID.selectedProperty().set(false);
            radioBID.selectedProperty().set(false);
        }
    }

    public void radioEncrypt(ActionEvent actionEvent) {
        if(encryptID.selectedProperty().get()){
            decryptID.selectedProperty().set(false);
        }
    }

    public void radioDecrypt(ActionEvent actionEvent) {
        if(decryptID.selectedProperty().get()){
            decryptID.selectedProperty().set(false);
        }
    }

    public void code01(ActionEvent actionEvent) {
        digit1ID.setText(code01T.getText());
    }

    public void code11(ActionEvent actionEvent) {
        digit1ID.setText(code11T.getText());
    }

    public void code21(ActionEvent actionEvent) {
        digit1ID.setText(code21T.getText());
    }

    public void code31(ActionEvent actionEvent) {
        digit1ID.setText(code31T.getText());
    }

    public void code41(ActionEvent actionEvent) {
        digit1ID.setText(code41T.getText());
    }

    public void code51(ActionEvent actionEvent) {
        digit1ID.setText(code51T.getText());
    }

    public void code61(ActionEvent actionEvent) {
        digit1ID.setText(code61T.getText());

    }

    public void code71(ActionEvent actionEvent) {
        digit1ID.setText(code71T.getText());

    }

    public void code81(ActionEvent actionEvent) {
        digit1ID.setText(code81T.getText());

    }

    public void code91(ActionEvent actionEvent) {
        digit1ID.setText(code91T.getText());

    }

    public void code02(ActionEvent actionEvent) {
        digit2ID.setText(code02T.getText());

    }

    public void code12(ActionEvent actionEvent) {
        digit2ID.setText(code12T.getText());

    }

    public void code22(ActionEvent actionEvent) {
        digit2ID.setText(code22T.getText());

    }

    public void code32(ActionEvent actionEvent) {
        digit2ID.setText(code32T.getText());

    }

    public void code42(ActionEvent actionEvent) {
        digit2ID.setText(code42T.getText());

    }

    public void code52(ActionEvent actionEvent) {
        digit2ID.setText(code52T.getText());

    }

    public void code62(ActionEvent actionEvent) {
        digit2ID.setText(code62T.getText());

    }

    public void code72(ActionEvent actionEvent) {
        digit2ID.setText(code72T.getText());

    }

    public void code82(ActionEvent actionEvent) {
        digit2ID.setText(code82T.getText());

    }

    public void code92(ActionEvent actionEvent) {
        digit2ID.setText(code92T.getText());

    }

    public void code03(ActionEvent actionEvent) {
        digit3ID.setText(code03T.getText());
    }

    public void code13(ActionEvent actionEvent) {
        digit3ID.setText(code13T.getText());

    }

    public void code23(ActionEvent actionEvent) {
        digit3ID.setText(code23T.getText());

    }

    public void code33(ActionEvent actionEvent) {
        digit3ID.setText(code33T.getText());

    }

    public void code43(ActionEvent actionEvent) {
        digit3ID.setText(code43T.getText());

    }

    public void code53(ActionEvent actionEvent) {
        digit3ID.setText(code53T.getText());

    }

    public void code63(ActionEvent actionEvent) {
        digit3ID.setText(code63T.getText());

    }

    public void code73(ActionEvent actionEvent) {
        digit3ID.setText(code73T.getText());

    }

    public void code83(ActionEvent actionEvent) {
        digit3ID.setText(code83T.getText());

    }

    public void code93(ActionEvent actionEvent) {
        digit3ID.setText(code93T.getText());

    }

    public void code04(ActionEvent actionEvent) {
        digit4ID.setText(code04T.getText());
    }

    public void code14(ActionEvent actionEvent) {
        digit4ID.setText(code14T.getText());

    }

    public void code24(ActionEvent actionEvent) {
        digit4ID.setText(code24T.getText());

    }

    public void code34(ActionEvent actionEvent) {
        digit4ID.setText(code34T.getText());

    }

    public void code44(ActionEvent actionEvent) {
        digit4ID.setText(code44T.getText());

    }

    public void code54(ActionEvent actionEvent) {
        digit4ID.setText(code54T.getText());

    }

    public void code64(ActionEvent actionEvent) {
        digit4ID.setText(code64T.getText());

    }

    public void code74(ActionEvent actionEvent) {
        digit4ID.setText(code74T.getText());

    }

    public void code84(ActionEvent actionEvent) {
        digit4ID.setText(code84T.getText());

    }

    public void code94(ActionEvent actionEvent) {
        digit4ID.setText(code94T.getText());

    }

    public void code05(ActionEvent actionEvent) {
        digit5ID.setText(code05T.getText());
    }

    public void code15(ActionEvent actionEvent) {
        digit5ID.setText(code15T.getText());

    }

    public void code25(ActionEvent actionEvent) {
        digit5ID.setText(code25T.getText());

    }

    public void code35(ActionEvent actionEvent) {
        digit5ID.setText(code35T.getText());

    }

    public void code45(ActionEvent actionEvent) {
        digit5ID.setText(code45T.getText());

    }

    public void code55(ActionEvent actionEvent) {
        digit5ID.setText(code55T.getText());

    }

    public void code65(ActionEvent actionEvent) {
        digit5ID.setText(code65T.getText());

    }

    public void code75(ActionEvent actionEvent) {
        digit5ID.setText(code75T.getText());

    }

    public void code85(ActionEvent actionEvent) {
        digit5ID.setText(code85T.getText());

    }

    public void code95(ActionEvent actionEvent) {
        digit5ID.setText(code95T.getText());

    }



}
