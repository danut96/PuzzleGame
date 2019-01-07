package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label Label1;

    @FXML
    private Label Label2;

    @FXML
    private Label Label3;

    @FXML
    private Label Label4;

    @FXML
    private Label Label5;

    @FXML
    private Label Label6;

    @FXML
    private Label Label7;

    @FXML
    private Label Label8;

    @FXML
    private Label Label9;

    @FXML
    private Label Label10;

    @FXML
    private Label Label11;

    @FXML
    private Label Label12;

    @FXML
    private Label Label13;

    @FXML
    private Label Label14;

    @FXML
    private Label Label15;

    @FXML
    private Label Label16;


    //use this instance of Joc during 1 game
    Joc joc;

    //change pressed label's info with "zero" label's info
    void change(int i, int j){
        joc.searchZero();
        joc.change(i,j);
        show();
        //if game is over, display the second window
        if(joc.stopJoc()){
            Mesaj m = new Mesaj();
            m.display();
            //if the game is not closed, create a new game
            joc = new Joc();
            show();
        }
    }

    //modify labels with respect to games's matrix and display them
    void show(){
        Label[][] labels = new Label[][]{
                {Label1, Label2, Label3, Label4},
                {Label5, Label6, Label7, Label8},
                {Label9, Label10, Label11, Label12},
                {Label13,Label14, Label15, Label16}
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (joc.m[i][j] != 0) {
                    labels[i][j].setText(String.valueOf(joc.m[i][j]));
                    labels[i][j].setStyle("-fx-background-color: #cae067;");
                } else {
                    labels[i][j].setStyle("-fx-background-color: #ffffff;");
                    labels[i][j].setText("");
                }
            }
        }
    }


    //set initial window & play
    @Override
    public void initialize(URL url, ResourceBundle r) {
        Label[][] labels = new Label[][]{
                {Label1, Label2, Label3, Label4},
                {Label5, Label6, Label7, Label8},
                {Label9, Label10, Label11, Label12},
                {Label13,Label14, Label15, Label16}
        };

        //set mouse event for all labels
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int x = i;
                int y = j;
                labels[i][j].setOnMouseClicked(event -> change(x, y));
            }
        }

        joc = new Joc();

        show();
    }
}
