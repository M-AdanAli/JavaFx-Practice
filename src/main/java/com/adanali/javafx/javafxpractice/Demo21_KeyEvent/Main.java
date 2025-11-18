package com.adanali.javafx.javafxpractice.Demo21_KeyEvent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader  = new FXMLLoader(getClass().getResource("/com/adanali/javafx/javafxpractice/Demo21_KeyEvent.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        Scene scene = new Scene(root);

        scene.setOnKeyPressed(keyEvent -> {
            switch (keyEvent.getCode()){
                case W,UP -> controller.moveUp();
                case A,LEFT -> controller.moveLeft();
                case S,DOWN -> controller.moveDown();
                case D,RIGHT -> controller.moveRight();
            }
        });

        stage.setScene(scene);
        stage.show();
    }
}