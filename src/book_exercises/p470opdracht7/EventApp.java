package book_exercises.p470opdracht7;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EventApp extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("events.fxml"));
        Scene scene = new Scene(root,700,400);
        primaryStage.setTitle("Events");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


