package com.adanali.javafx.javafxpractice.Demo1_Scenes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, Color.YELLOW);
        Image icon = new Image("Logo.png");
        stage.getIcons().add(icon);
        stage.setTitle("First Javafx Program");
        stage.setHeight(500);
        stage.setWidth(500);
        stage.setResizable(false);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You cannot escape until you press k");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("k"));

        stage.setScene(scene);
        stage.show();
    }
}
