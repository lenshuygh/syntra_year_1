package year1.javafoundations.solutions.chapter25.exercise4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Created by JonathanSyntra on 22/04/2017.
 */
public class Controller {
    private int count;
    @FXML
    private Label label;

    @FXML
    private void buttonPressed(ActionEvent ev){
        count++;
        label.setText("Count: " + count);
    }

    @FXML
    private void countReset(ActionEvent ev){
        count = 0;
        label.setText("Count: " + count);
    }
}
