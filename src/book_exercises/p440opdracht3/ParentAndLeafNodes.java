package book_exercises.p440opdracht3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ParentAndLeafNodes extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ParentsAndLeafs.fxml"));
        Scene scene = new Scene(root,300,250);
        primaryStage.setTitle("Sample");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
