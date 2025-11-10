package com.adanali.javafx.javafxpractice.Demo7_Exit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Button logoutButton;
    @FXML
    private AnchorPane scenePane;
    private Stage stage;

    public void logout(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to exit");
        alert.setContentText("Are you sure?");

        if (alert.showAndWait().get() == ButtonType.OK){
            stage =(Stage) scenePane.getScene().getWindow();
            System.out.println("You Successfully logged out!");
            stage.close();
        }
    }
}
