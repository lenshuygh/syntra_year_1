package year1.javafoundations.solutions.chapter25.exercise8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;


/**
 * Created by JonathanSyntra on 3/05/2017.
 */
public class DrawingController {
    @FXML
    private Button clearButton;
    @FXML
    private Canvas canvas;
    private GraphicsContext gc;

    @FXML
    public void initialize(){
        gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);
        gc.setFill(Color.WHITE);
        clear();
    }

    @FXML
    private void clearPressed(ActionEvent ev) {
        clear();
    }

    @FXML
    private void mousePressed(MouseEvent ev) {
        gc.beginPath();
        gc.stroke();
    }

    @FXML
    private void mouseDragged(MouseEvent ev) {
        gc.lineTo(ev.getX(),ev.getY());
        gc.stroke();
    }

    @FXML
    private void mouseReleased(MouseEvent ev) {
        gc.closePath();
    }

    private void clear(){
        gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
    }
}
