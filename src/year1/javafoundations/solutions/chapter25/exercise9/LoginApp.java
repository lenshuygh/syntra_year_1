package year1.javafoundations.solutions.chapter25.exercise9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by JonathanSyntra on 3/05/2017.
 */
public class LoginApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(
                "Login.fxml"));
        Scene scene = new Scene(root, 400, 200);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }
}
