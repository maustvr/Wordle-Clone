package com.example.wordle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("wordle.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("wordle.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Welcome to Wordle");
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)  throws IOException{
        WordleController.getWord();

        launch();
    }
}