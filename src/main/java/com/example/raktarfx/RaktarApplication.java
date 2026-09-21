package com.example.raktarfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class RaktarApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RaktarApplication.class.getResource("raktar-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 412, 355);
        stage.setTitle("Raktár");
        stage.setScene(scene);
        Image windowIconImage = new Image("file:raktar.png");
        stage.getIcons().add(windowIconImage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}