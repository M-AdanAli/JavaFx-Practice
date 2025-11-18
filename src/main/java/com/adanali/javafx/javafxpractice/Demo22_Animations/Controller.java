package com.adanali.javafx.javafxpractice.Demo22_Animations;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.Axis;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private ImageView myImage;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /*TranslateTransition translate = new TranslateTransition();
        translate.setNode(myImage);
        translate.setDuration(Duration.millis(1500));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByX(250);
        translate.setByY(-250);
        translate.setAutoReverse(true);
        translate.play();*/

        RotateTransition rotate = new RotateTransition();
        rotate.setNode(myImage);
        rotate.setDuration(Duration.millis(600));
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.play();

        /*FadeTransition fade = new FadeTransition();
        fade.setNode(myImage);
        fade.setDuration(Duration.millis(600));
        fade.setCycleCount(TranslateTransition.INDEFINITE);
        fade.setInterpolator(Interpolator.LINEAR);
        fade.setFromValue(1);
        fade.setToValue(0);
        fade.play();*/

        ScaleTransition scale = new ScaleTransition();
        scale.setNode(myImage);
        scale.setDuration(Duration.millis(600));
        scale.setCycleCount(TranslateTransition.INDEFINITE);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setAutoReverse(true);
        scale.setByX(2);
        scale.setByY(2);
        scale.play();
    }
}
