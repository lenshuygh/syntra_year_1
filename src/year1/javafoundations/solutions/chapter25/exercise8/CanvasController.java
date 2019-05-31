package year1.javafoundations.solutions.chapter25.exercise8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.*;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * Created by JonathanSyntra on 3/05/2017.
 */
public class CanvasController {
    @FXML
    private Canvas canvas;

    private GraphicsContext gc;
    private Image image;

    @FXML
    public void initialize() {
        gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);
        gc.setFill(Color.WHITE);
        gc.setFont(Font.font(36));
        image = new Image(getClass().getResourceAsStream(
                "java.png"));
        clear();
    }

    @FXML
    private void rectangle(ActionEvent ev) {
        gc.strokeRect(10, 10, 80, 50);
    }

    @FXML
    private void circle(ActionEvent ev) {
        gc.strokeOval(100, 10, 50, 50);
    }

    @FXML
    private void triangle(ActionEvent ev) {
        double[] yPoints = { 10, 10, 60 };
        double[] xPoints = { 150, 210, 180 };
        gc.strokePolygon(xPoints, yPoints, 3);
    }

    @FXML
    private void text(ActionEvent ev) {
        gc.strokeText("My first drawing", 10, 100);
    }

    @FXML
    private void image(ActionEvent ev) {
        gc.drawImage(image, 220, 10, 50, 50);
    }

    @FXML
    private void clear(ActionEvent ev) {
        clear();
    }

    private void clear() {
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
}
