package book_exercises.p485opdracht10;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TextEditorApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TextEditor.fxml"));
        Scene scene = new Scene(root,700,400);
        primaryStage.setTitle("TextEditor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
