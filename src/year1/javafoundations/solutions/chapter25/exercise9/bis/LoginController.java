package year1.javafoundations.solutions.chapter25.exercise9.bis;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by JonathanSyntra on 3/05/2017.
 */
public class LoginController {
    @FXML
    private TextField name;

    @FXML
    private PasswordField password;

    @FXML
    private Label message;

    @FXML
    private void login(ActionEvent ev) throws IOException {
        name.getStyleClass().remove("error");
        password.getStyleClass().remove("error");

        if(name.getText().isEmpty()) {
            message.setText("Please enter your name!");
            name.getStyleClass().add("error");
        } else if (password.getText().isEmpty()) {
            message.setText("Enter your password!");
            password.getStyleClass().add("error");
        } else if(!name.getText().equals(password.getText())) {
            message.setText("Invalid password!");
            password.getStyleClass().add("error");
        } else {
            ((Stage)message.getScene().getWindow()).setScene(SceneManager.getLoginSuccessfulScene());
        }
    }
}
