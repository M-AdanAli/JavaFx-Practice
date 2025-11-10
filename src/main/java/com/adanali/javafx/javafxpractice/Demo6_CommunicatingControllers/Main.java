package com.adanali.javafx.javafxpractice.Demo6_CommunicatingControllers;

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
        Parent root = FXMLLoader.load(getClass().getResource("/com/adanali/javafx/javafxpractice/Demo6_Scene1.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Communication between Controllers");
        stage.setScene(scene);
        stage.show();
    }
}
