package year1.javafoundations.solutions.chapter25.exercise9.bis;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class SceneManager {
    public static Scene getLoginScene() throws IOException {
        Parent root = FXMLLoader.load(LoginApp.class.getResource(
                "Login.fxml"));
        return new Scene(root, 400, 200);
    }

    public static Scene getLoginSuccessfulScene() throws IOException {
        Parent root = FXMLLoader.load(LoginApp.class.getResource(
                "LoginSuccesful.fxml"));
        return new Scene(root, 400, 200);
    }
}
