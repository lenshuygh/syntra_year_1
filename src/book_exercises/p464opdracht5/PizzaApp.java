package book_exercises.p464opdracht5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PizzaApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("pizza.fxml"));
        Scene scene = new Scene(root,500,500);
        primaryStage.setTitle("Pizza");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
