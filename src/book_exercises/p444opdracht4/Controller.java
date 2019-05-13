package book_exercises.p444opdracht4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    private int count;
    @FXML
    private Label label;

    @FXML
    private void buttonPressed(ActionEvent ae){
        count++;
        label.setText("Count: " + count);
    }

    @FXML
    public void resetButtonPressed(ActionEvent actionEvent) {
        count = 0;
        label.setText("Count: " + count);
    }
}
