package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Mesaj {

    //display this window in case game is over
     void display() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Message.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Game Over");
            stage.setScene(new Scene(root1));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
