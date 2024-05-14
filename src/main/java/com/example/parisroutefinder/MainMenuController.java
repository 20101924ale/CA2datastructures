package com.example.parisroutefinder;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MainMenuController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField nameField;

    @FXML
    protected void continueButton() {
        try {
            // Load the FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ParisRoutes.fxml"));
            Parent root = loader.load();

            // Create the scene
            Scene scene = new Scene(root);

            // Set the scene to the primary stage
            StartRouteFinder.primaryStage.setScene(scene);
        } catch (IOException e) {
            // Log the exception
            e.printStackTrace();
        }
    }
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Bienvenue," + nameField.getText() + "!");
    }
}