package book_exercises.p470opdracht7;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class EventController {
    @FXML
    private Text text;

    @FXML
    private void mouseMoved(MouseEvent me){
        text.setText(String.format("The mouse was moved to (%.0f,%.0f)",me.getX(),me.getY()));
    }

    @FXML
    private void mouseClicked(MouseEvent me){
        text.setText(String.format("The mouse was clicked with the %s on (%.0f,%.0f)",me.getButton(),me.getX(),me.getY()));
    }

    @FXML
    private void mouseEntered(MouseEvent me){
        text.setText(String.format("The mouse entered the canvas on (%.0f,%.0f)",me.getX(),me.getY()));
    }

    @FXML
    private void mouseExited(MouseEvent me){
        text.setText(String.format("The mouse exited the canvas on (%.0f,%.0f)",me.getX(),me.getY()));
    }

    /*
MouseMoved
MouseClicked
MouseEntered
MouseExited
 */
}
