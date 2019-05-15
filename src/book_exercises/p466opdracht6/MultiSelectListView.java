package book_exercises.p466opdracht6;

import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MultiSelectListView<T> extends ListView {
    public MultiSelectListView(){
        getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
}
