package book_exercises.p233opdracht2.graphics;

import javafx.scene.canvas.GraphicsContext;
import book_exercises.p229opdracht1.graphics.Scaleable;

public interface Drawable extends Scaleable {
    public void draw(GraphicsContext g);
}
