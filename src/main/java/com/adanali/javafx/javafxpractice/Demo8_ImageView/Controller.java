package com.adanali.javafx.javafxpractice.Demo8_ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private ImageView myImageView;
    @FXML
    private Button myButton;
    Image myImage = new Image(getClass().getResourceAsStream("/com/adanali/javafx/javafxpractice/Shrek2.jpg"));

    public void displayImage(ActionEvent event){
        myImageView.setImage(myImage);
    }
}
