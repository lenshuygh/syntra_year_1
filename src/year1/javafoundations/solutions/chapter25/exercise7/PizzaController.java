package year1.javafoundations.solutions.chapter25.exercise7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * Created by JonathanSyntra on 3/05/2017.
 */
public class PizzaController {
    @FXML
    private TextField name;

    @FXML
    private TextField email;

    @FXML
    private DatePicker date;

    @FXML
    private MultiSelectListView<String> ingredients;

    @FXML
    private ToggleGroup bottom;

    @FXML
    private CheckBox spicy;

    @FXML
    private ChoiceBox<String> size;

    @FXML
    private TextField number;

    @FXML
    private void order(ActionEvent ev) {
        System.out.println("Order pizza");
        System.out.println("Name: " +name.getText());
        System.out.println("Email: " +email.getText());
        System.out.println("Delivery date: " + date.getValue());
        System.out.println("Ingredients: ");
        ingredients.getSelectionModel().getSelectedItems().forEach(System.out::println);
        System.out.println("Bottom:" + bottom.getSelectedToggle());
        System.out.println("Spicy: " + spicy.isSelected());
        System.out.println("Size: " + size.getValue());
        System.out.println("Number: " + number.getText());

    }
}
