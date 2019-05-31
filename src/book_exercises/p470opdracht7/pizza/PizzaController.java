package book_exercises.p470opdracht7.pizza;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class PizzaController {
    @FXML
    private TextField nameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private DatePicker deliveryDatePicker;

    @FXML
    private MultiSelectListView<String> ingredientsListView;

    @FXML
    private ToggleGroup bottomToggleGroup;

    @FXML
    private CheckBox spicyCheckBox;

    @FXML
    private ChoiceBox<String> sizeChoiceBox;

    @FXML
    private TextField numberTextField;

    @FXML
    private void orderEvent(MouseEvent me) {
        System.out.println("order clicked");
        System.out.println("ingredients; ");
        ingredientsListView.getSelectionModel().getSelectedItems().forEach(System.out::println);
        System.out.println("Name: " + nameTextField.getText());
        System.out.println("email: " + emailTextField.getText());
        System.out.println("DeliveryDate: " + deliveryDatePicker.getValue());
        System.out.println("Bottom: " + bottomToggleGroup.getSelectedToggle());
        System.out.println("Spicy?: " + spicyCheckBox.isSelected());
        System.out.println("size: " + sizeChoiceBox.getValue());
        System.out.println("#: " + numberTextField.getText());
    }
}
