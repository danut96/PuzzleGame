package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class MessageController implements Initializable {

    @FXML
    private Label L1;

    @FXML
    private Button PA;

    @FXML
    private Button Q;

    // if q button is pressed, close the game
    @FXML
    void quit(){
        System.exit(0);
    }

    //if PA (play again) button is pressed, close the curent window
    @FXML
    void goback(){
        Stage stage = (Stage) Q.getScene().getWindow();
        stage.close();
    }



    @Override
    public void initialize(URL url, ResourceBundle r)
    {
    }
}
