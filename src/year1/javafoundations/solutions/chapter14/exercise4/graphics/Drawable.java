package year1.javafoundations.solutions.chapter14.exercise4.graphics;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by JonathanSyntra on 5/02/2017.
 */
public interface Drawable extends Scaleable {
    void draw(GraphicsContext g);
}
