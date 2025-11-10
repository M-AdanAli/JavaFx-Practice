package com.adanali.javafx.javafxpractice.Demo1_Scenes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Demo1_Scenes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.LIGHTCYAN);

        Text text = new Text("Hello Coders!");
        text.setX(150);
        text.setY(150);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.CRIMSON);

        Line line = new Line();
        line.setStartX(120);
        line.setStartY(157);
        line.setEndX(500);
        line.setEndY(157);
        line.setStroke(Color.DEEPSKYBLUE);
        line.setStrokeWidth(5);
        line.setRotate(1);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(110);
        rectangle.setY(100);
        rectangle.setWidth(400);
        rectangle.setHeight(78);
        rectangle.setFill(Color.LIGHTPINK);
        rectangle.setStroke(Color.DEEPSKYBLUE);
        rectangle.setStrokeWidth(3);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                300.0,182.0,
                340.0,235.0,
                260.0,235.0
        );
        triangle.setFill(Color.LIGHTCYAN);
        triangle.setStroke(Color.ORANGE);
        triangle.setStrokeWidth(5);

        Circle circle = new Circle();
        circle.setCenterX(290);
        circle.setCenterY(400);
        circle.setRadius(50);
        circle.setFill(Color.PINK);

        Image javaLogo = new Image("Logo.png");
        ImageView imageView = new ImageView(javaLogo);
        imageView.setX(255);
        imageView.setY(375);
        imageView.setFitHeight(100);
        imageView.setFitWidth(75);

        root.getChildren().add(rectangle);
        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);

        stage.setScene(scene);
        stage.show();
    }
}