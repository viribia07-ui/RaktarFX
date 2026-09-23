package com.example.raktarjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public Button buttonRaktar1, buttonRaktar2, buttonToRaktar1, buttonToRaktar2, buttonDeleteRaktar1, buttonDeleteRaktar2, buttonSave;
    @FXML
    public ListView<String> listViewRaktar1, listViewRaktar2;
    @FXML
    public TextField textFieldInput;

    @FXML
    protected void onButtonRaktar1() {
        System.out.println("Button Raktár1");
    }

    @FXML
    protected void onButtonRaktar2() {
        System.out.println("Button Raktár2");
    }
    @FXML
    protected void onButtonToRaktar1() {
        System.out.println("Button toRaktár1");
    }
    @FXML
    protected void onButtonToRaktar2() {
        System.out.println("Button toRaktár2");
    }
    @FXML
    protected void onButtonDelete1() {
        System.out.println("Button Delete1");
    }
    @FXML
    protected void onButtonDelete2() {
        System.out.println("Button Delete2");
    }
    @FXML
    protected void onButtonSave() {
        System.out.println("Button Save");
    }
}