package book_exercises.p470opdracht7.pizza;

import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

/**
 * Created by JonathanSyntra on 26/04/2017.
 */
public class MultiSelectListView<T> extends ListView<T> {
    public MultiSelectListView(){
        getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
}
