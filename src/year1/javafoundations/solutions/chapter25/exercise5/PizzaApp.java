package year1.javafoundations.solutions.chapter25.exercise5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by JonathanSyntra on 26/04/2017.
 */
public class PizzaApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(
                "Pizza.fxml"));
        Scene scene = new Scene(root, 700, 400);
        stage.setTitle("Pizza");
        stage.setScene(scene);
        stage.show();
    }
}
