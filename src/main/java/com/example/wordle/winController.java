package com.example.wordle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class winController {

    @FXML
    public Button exitbtn;

    @FXML
    public Button newGame;


    @FXML
    public void onButtonClicked(ActionEvent e) throws IOException {
        if(e.getSource().equals(exitbtn)) {
            Platform.exit();
        } else if(e.getSource().equals(newGame)) {
            startNewGame();
        }
    }

    @FXML
    public void startNewGame() throws IOException {
        Stage stage = (Stage) newGame.getScene().getWindow();
        stage.close();
        System.out.println(WordleController.isNewGame);
        WordleController.isNewGame();
        System.out.println(WordleController.isNewGame);

    }

}
