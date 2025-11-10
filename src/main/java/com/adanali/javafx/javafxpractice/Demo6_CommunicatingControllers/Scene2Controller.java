package com.adanali.javafx.javafxpractice.Demo6_CommunicatingControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {

    @FXML
    Label nameLabel;

    public void displayName(String username){
        nameLabel.setText("Hello : "+username);
    }
}
