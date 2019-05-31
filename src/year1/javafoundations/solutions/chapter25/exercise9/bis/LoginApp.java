package year1.javafoundations.solutions.chapter25.exercise9.bis;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by JonathanSyntra on 3/05/2017.
 */
public class LoginApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Login");
        stage.setScene(SceneManager.getLoginScene());
        stage.show();
    }
}
