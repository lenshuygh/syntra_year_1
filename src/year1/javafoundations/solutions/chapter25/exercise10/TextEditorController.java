package year1.javafoundations.solutions.chapter25.exercise10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;

import java.io.*;
import java.nio.file.Files;

/**
 * Created by JonathanSyntra on 9/05/2017.
 */
public class TextEditorController {
    @FXML
    private Pane pane;
    @FXML
    private TextArea textArea;
    @FXML
    private Alert aboutAlert;
    private Alert errorAlert;
    @FXML
    private FileChooser fileChooser;

    @FXML
    private void initialize() {
        errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setTitle("An error has occured");
        errorAlert.setHeaderText("Error");
    }

    @FXML
    private void showAbout(ActionEvent ev) {
        aboutAlert.showAndWait();
    }

    @FXML
    private void fileOpen(ActionEvent ev) {
        File file = fileChooser.showOpenDialog(pane.getScene()
                .getWindow());
        if (file != null) {
            textArea.clear();
            try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    textArea.appendText(line);
                    textArea.appendText(System.lineSeparator());
                }
            } catch (IOException e) {
                errorAlert.setContentText(e.getMessage());
                errorAlert.showAndWait();
            }
        }
    }

    @FXML
    private void fileSave(ActionEvent ev) {
        File file = fileChooser.showSaveDialog(pane.getScene()
                .getWindow());
        if (file != null) {
            try (BufferedWriter writer = new BufferedWriter(
                    new FileWriter(file))) {
                writer.write(textArea.getText());
            } catch (IOException e) {
                errorAlert.setContentText(e.getMessage());
                errorAlert.showAndWait();
            }
        }
    }

    @FXML
    private void exit(ActionEvent ev) {
        System.exit(0);
    }
}
