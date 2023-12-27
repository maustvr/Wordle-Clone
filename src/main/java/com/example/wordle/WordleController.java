package com.example.wordle;

//import javafx.event.ActionEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordleController {

    @FXML
    private Label firstWord1;
    @FXML
    private Label firstWord2;
    @FXML
    private Label firstWord3;
    @FXML
    private Label firstWord4;
    @FXML
    private Label firstWord5;
    @FXML
    private Label secWord1;
    @FXML
    private Label secWord2;
    @FXML
    private Label secWord3;
    @FXML
    private Label secWord4;
    @FXML
    private Label secWord5;
    @FXML
    private Label thirdWord1;
    @FXML
    private Label thirdWord2;
    @FXML
    private Label thirdWord3;
    @FXML
    private Label thirdWord4;
    @FXML
    private Label thirdWord5;
    @FXML
    private Label fourthWord1;
    @FXML
    private Label fourthWord2;
    @FXML
    private Label fourthWord3;
    @FXML
    private Label fourthWord4;
    @FXML
    private Label fourthWord5;
    @FXML
    private Label fifthWord1;
    @FXML
    private Label fifthWord2;
    @FXML
    private Label fifthWord3;
    @FXML
    private Label fifthWord4;
    @FXML
    private Label fifthWord5;
    @FXML
    private Label sixthWord1;
    @FXML
    private Label sixthWord2;
    @FXML
    private Label sixthWord3;
    @FXML
    private Label sixthWord4;
    @FXML
    private Label sixthWord5;
    @FXML
    private Label error;
    //@FXML
    //private Button btn;
    @FXML
    private TextField userInput;
   // @FXML
    //private String guess;

    @FXML
    public static String newWord;
    public static boolean isNewGame = false;


    @FXML
    public void onButtonClicked(ActionEvent event)  {

        ArrayList<Character> foundLetters = new ArrayList<Character>();
        //int found = 0;

        System.out.println(newWord);

        String guess = userInput.getText().toLowerCase();
        System.out.println(guess);

        if (guess.length() != 5) {
            System.out.println("Word must be 5 letters!");
            error.setText("Word must be 5 letters!");
        } else if(guess.matches("[a-zA-Z]+")){
            //System.out.println("letters");
            error.setText("");
            for (int i = 0; i < guess.length(); i++) {
                char c = guess.charAt(i);
                System.out.println(c);
                String letter = Character.toString(c);
                if (firstWord1.getText().isEmpty()) {
                    firstWord1.setText(letter);
                    match(newWord, guess, c, i, firstWord1, foundLetters);
                    /*if (newWord.indexOf(c) != -1) {
                        System.out.println("Letter found " + c);
                        if (guess.charAt(i) == newWord.charAt(i)) {
                            found += 1;
                            foundLetters.add(c);
                            System.out.println("found letters" + foundLetters);
                            firstWord1.setStyle("-fx-background-color: mediumseagreen");
                        } else {
                            System.out.println("reached");
                            /*for (int j = 0; j < foundLetters.size(); j++) {
                                System.out.println(j);
                                System.out.println("Found letter " + foundLetters.get(j));
                                if (foundLetters.get(j) != c) {
                            firstWord1.setStyle("-fx-background-color: lightgoldenrodyellow");
                                    //System.out.println(foundLetters.get(j) + " " + c + "Yellow");
                                //}
                           // }
                        }
                    }else {
                    firstWord1.setStyle("-fx-background-color: d3d3d3");
                }*/
                } else if (firstWord2.getText().isEmpty()) {
                    firstWord2.setText(letter);
                    match(newWord, guess, c, i, firstWord2, foundLetters);

                } else if (firstWord3.getText().isEmpty()) {
                    firstWord3.setText(letter);
                    match(newWord, guess, c, i, firstWord3, foundLetters);

                } else if (firstWord4.getText().isEmpty()) {
                    firstWord4.setText(letter);
                    match(newWord, guess, c, i, firstWord4, foundLetters);

                } else if (firstWord5.getText().isEmpty()) {
                    firstWord5.setText(letter);
                    match(newWord, guess, c, i, firstWord5, foundLetters);
                    userInput.clear();
                    if (guess.equals(newWord)) {
                        System.out.println("You won");
                        winWindow();
                    }
                } else if (secWord1.getText().isEmpty()) {
                    secWord1.setText(letter);
                    match(newWord, guess, c, i, secWord1, foundLetters);

                } else if (secWord2.getText().isEmpty()) {
                    secWord2.setText(letter);
                    match(newWord, guess, c, i, secWord2, foundLetters);

                } else if (secWord3.getText().isEmpty()) {
                    secWord3.setText(letter);
                    match(newWord, guess, c, i, secWord3, foundLetters);

                } else if (secWord4.getText().isEmpty()) {
                    secWord4.setText(letter);
                    match(newWord, guess, c, i, secWord4, foundLetters);

                } else if (secWord5.getText().isEmpty()) {
                    secWord5.setText(letter);
                    match(newWord, guess, c, i, secWord5, foundLetters);

                    userInput.clear();
                    if (guess.equals(newWord)) {
                        winWindow();
                    }
                } else if (thirdWord1.getText().isEmpty()) {
                    thirdWord1.setText(letter);
                    match(newWord, guess, c, i, thirdWord1, foundLetters);

                } else if (thirdWord2.getText().isEmpty()) {
                    thirdWord2.setText(letter);
                    match(newWord, guess, c, i, thirdWord2, foundLetters);

                } else if (thirdWord3.getText().isEmpty()) {
                    thirdWord3.setText(letter);
                    match(newWord, guess, c, i, thirdWord3, foundLetters);

                } else if (thirdWord4.getText().isEmpty()) {
                    thirdWord4.setText(letter);
                    match(newWord, guess, c, i, thirdWord4, foundLetters);

                } else if (thirdWord5.getText().isEmpty()) {
                    thirdWord5.setText(letter);
                    match(newWord, guess, c, i, thirdWord5, foundLetters);

                    userInput.clear();
                    if (guess.equals(newWord)) {
                        winWindow();
                    }
                } else if (fourthWord1.getText().isEmpty()) {
                    fourthWord1.setText(letter);
                    match(newWord, guess, c, i, fourthWord1, foundLetters);

                } else if (fourthWord2.getText().isEmpty()) {
                    fourthWord2.setText(letter);
                    match(newWord, guess, c, i, fourthWord2, foundLetters);

                } else if (fourthWord3.getText().isEmpty()) {
                    fourthWord3.setText(letter);
                    match(newWord, guess, c, i, fourthWord3, foundLetters);

                } else if (fourthWord4.getText().isEmpty()) {
                    fourthWord4.setText(letter);
                    match(newWord, guess, c, i, fourthWord4, foundLetters);

                } else if (fourthWord5.getText().isEmpty()) {
                    fourthWord5.setText(letter);
                    match(newWord, guess, c, i, fourthWord5,  foundLetters);

                    userInput.clear();
                    if (guess.equals(newWord)) {
                        winWindow();
                    }
                } else if (fifthWord1.getText().isEmpty()) {
                    fifthWord1.setText(letter);
                    match(newWord, guess, c, i, fifthWord1,  foundLetters);

                } else if (fifthWord2.getText().isEmpty()) {
                    fifthWord2.setText(letter);
                    match(newWord, guess, c, i, fifthWord2,  foundLetters);

                } else if (fifthWord3.getText().isEmpty()) {
                    fifthWord3.setText(letter);
                    match(newWord, guess, c, i, fifthWord3, foundLetters);

                } else if (fifthWord4.getText().isEmpty()) {
                    fifthWord4.setText(letter);
                    match(newWord, guess, c, i, fifthWord4,  foundLetters);

                } else if (fifthWord5.getText().isEmpty()) {
                    fifthWord5.setText(letter);
                    match(newWord, guess, c, i, fifthWord5,  foundLetters);

                    userInput.clear();
                    if (guess.equals(newWord)) {
                        winWindow();
                    }
                } else if (sixthWord1.getText().isEmpty()) {
                    sixthWord1.setText(letter);
                    match(newWord, guess, c, i, sixthWord1, foundLetters);

                } else if (sixthWord2.getText().isEmpty()) {
                    sixthWord2.setText(letter);
                    match(newWord, guess, c, i, sixthWord2, foundLetters);

                } else if (sixthWord3.getText().isEmpty()) {
                    sixthWord3.setText(letter);
                    match(newWord, guess, c, i, sixthWord3, foundLetters);

                } else if (sixthWord4.getText().isEmpty()) {
                    sixthWord4.setText(letter);
                    match(newWord, guess, c, i, sixthWord4, foundLetters);

                } else if (sixthWord5.getText().isEmpty()) {
                    sixthWord5.setText(letter);
                    match(newWord, guess, c, i, sixthWord5, foundLetters);
                    if (guess.equals(newWord)) {
                        winWindow();
                    } else {
                        loseWindow();
                    }//closes lose window
                }
            }
        }else {
            error.setText("Please enter only letters a-z");
            userInput.clear();
        }
    }//close method

    private void winWindow() {
        try {
            //Load win scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("win.fxml"));
            Parent root = loader.load();

            //Show win scene in new window
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            System.out.println(isNewGame);
            stage.showAndWait();
            System.out.println(isNewGame);
            if (isNewGame) {
                newGame();
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public void newGame() throws IOException {
        clearGame(firstWord1);
        clearGame(firstWord2);
        clearGame(firstWord3);
        clearGame(firstWord4);
        clearGame(firstWord5);
        clearGame(secWord1);
        clearGame(secWord2);
        clearGame(secWord3);
        clearGame(secWord4);
        clearGame(secWord5);
        clearGame(thirdWord1);
        clearGame(thirdWord2);
        clearGame(thirdWord3);
        clearGame(thirdWord4);
        clearGame(thirdWord5);
        clearGame(fourthWord1);
        clearGame(fourthWord2);
        clearGame(fourthWord3);
        clearGame(fourthWord4);
        clearGame(fourthWord5);
        clearGame(fifthWord1);
        clearGame(fifthWord2);
        clearGame(fifthWord3);
        clearGame(fifthWord4);
        clearGame(fifthWord5);
        clearGame(sixthWord1);
        clearGame(sixthWord2);
        clearGame(sixthWord3);
        clearGame(sixthWord4);
        clearGame(sixthWord5);
        userInput.clear();
        getWord();
    }

    public static boolean isNewGame(){
        isNewGame = true;
        return isNewGame;
    }
    private void loseWindow() {
        try {
            //Load second scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("lose.fxml"));
            Parent root = loader.load();

            //Get controller of scene2
            LoseController loseController = loader.getController();
            //Pass whatever data you want. You can have multiple method calls here
            loseController.correctAnswer(newWord);

            //Show scene 2 in new window
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Second Window");
            System.out.println(isNewGame);

            stage.showAndWait();
            System.out.println(isNewGame);
            if (isNewGame) {
                newGame();
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    public static void getWord() throws IOException {
        List<String> wordList = new ArrayList<String>();
        File f = new File("wordle.txt");
        BufferedReader reader = new BufferedReader(new FileReader(f));
        String word = reader.readLine();
        while (word != null) {
            wordList.add(word);
            word = reader.readLine();
        }
        reader.close();
        System.out.println(wordList);
        Random r = new Random();
        newWord = wordList.get(r.nextInt(wordList.size()));
        System.out.println(newWord);
        //return newWord;

    }

    public void clearGame(Label square) {
        square.setText("");
        square.setStyle("-fx-background-color: white");
    }

    public void match(String correct, String guessed, char letter, int i, Label pos,  ArrayList<Character> list) {
        if (correct.indexOf(letter) != -1) {
            System.out.println("Letter found " + letter);
            if (guessed.charAt(i) == correct.charAt(i)) {
                //found += 1;
                list.add(letter);
                //System.out.println("found letters" + letters);
                pos.setStyle("-fx-background-color: mediumseagreen");
            } else {
                if (list.contains(letter)) {
                    pos.setStyle("-fx-background-color: d3d3d3");
                }else {
                    pos.setStyle("-fx-background-color: c9b458");
                    System.out.println("reached");
                }
            }
        } else {
            pos.setStyle("-fx-background-color: d3d3d3");
        }
    }
}


