package com.example.parisroutefinder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainMenuController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField nameField;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Bienvenue," + nameField.getText() + "!");
    }
}