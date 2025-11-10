package com.adanali.javafx.javafxpractice.Demo4_CSSstyling;

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
        Parent root = FXMLLoader.load(getClass().getResource("/com/adanali/javafx/javafxpractice/Demo4_CSSstyling.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/com/adanali/javafx/javafxpractice/CSSstyling.css").toExternalForm());
        stage.setTitle("CSS Styling");
        stage.setScene(scene);
        stage.show();
    }
}
