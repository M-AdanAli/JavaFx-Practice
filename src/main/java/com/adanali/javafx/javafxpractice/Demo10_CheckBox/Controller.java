package com.adanali.javafx.javafxpractice.Demo10_CheckBox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    ImageView myImageView;
    @FXML
    Label myLabel;
    @FXML
    CheckBox myCheckBox;

    Image image1 = new Image(getClass().getResourceAsStream("/com/adanali/javafx/javafxpractice/bulb1.png"));
    Image image2 = new Image(getClass().getResourceAsStream("/com/adanali/javafx/javafxpractice/bulb2.png"));

    public void change(ActionEvent event){
         if (myCheckBox.isSelected()){
             myLabel.setText("ON");
             myImageView.setImage(image2);
         }else {
             myLabel.setText("OFF");
             myImageView.setImage(image1);
         }

    }
}
