package book_exercises.p444opdracht4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ButtonApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("mvc.fxml"));
        Scene scene = new Scene(root,300,100);
        primaryStage.setTitle("Model View Controller");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
