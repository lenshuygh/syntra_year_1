package book_exercises.p435opdracht1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloWorldApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label helloLabel = new Label("Hello World");
        helloLabel.setLayoutX(20);
        helloLabel.setLayoutY(20);
        Group rootGroup = new Group(helloLabel);
        Scene scene = new Scene(rootGroup,300,100);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
