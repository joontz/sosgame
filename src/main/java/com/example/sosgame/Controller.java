package com.example.sosgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;



public class Controller {

    @FXML
    private RadioButton rSimpleGame, rGeneralGame;
    String gameMode;

    public void getGame(ActionEvent event) {

        if (rSimpleGame.isSelected()) {
            gameMode = (rSimpleGame.getText());
        } else if (rGeneralGame.isSelected()) {
            gameMode = (rGeneralGame.getText());
        }
        System.out.println(gameMode);
    }

    @FXML
    private TextField boardSize;
    @FXML
    private Button setBoard;

    public void getBoardSize(ActionEvent event) {
        int input = Integer.parseInt(boardSize.getText());
        int size = sizeValidator((input));
        buildBoard(size);
    }

    public static int sizeValidator(int j){
        int size = 0;
        if (j > 2 && j < 11){
             size = j;
        } else {
            System.out.println("wrong input");
            size = -1;
        }
        return size;
    }


    @FXML
    public GridPane gridPane;
    public static String buttonClicked;

    public void buildBoard(int s) {
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                Button button = new Button();
                TextField text = new TextField();
                button.setMaxSize(30, 30);
                String id = String.valueOf(i + "," + j);
                button.setId(id);
                //System.out.println(String.valueOf(i +"," + j)););
                button.setOnAction(value -> {
                    buttonClicked = id;
                    button.setText(playerAction);
                    button.setTextFill(playerActionColor);
                });

                gridPane.add(button, i, j);


            }
        }
    }

    @FXML
    private RadioButton redS, redO, blueS, blueO;
    public static String playerAction;

    public static Color playerActionColor;


    public void getPlayer(ActionEvent event) {
        if (redS.isSelected()) {
            playerAction = "s";
            playerActionColor = Color.rgb(255,0,0);
        } else if (redO.isSelected()) {
            playerAction = "o";
            playerActionColor = Color.rgb(255,0,0);

        } else if (blueS.isSelected()) {
            playerAction = "s";
            playerActionColor = Color.rgb(0,0,255);

        } else if (blueO.isSelected()) {
            playerAction = "o";
            playerActionColor = Color.rgb(0,0,255);

        }
    }




}

