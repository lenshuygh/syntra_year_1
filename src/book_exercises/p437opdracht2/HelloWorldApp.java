package book_exercises.p437opdracht2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloWorldApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("HelloWorld.fxml"));
        Scene scene = new Scene(root,300,100);
        primaryStage.setTitle("HEeEeEllo World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
