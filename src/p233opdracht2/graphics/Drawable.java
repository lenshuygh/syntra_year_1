package p233opdracht2.graphics;

import javafx.scene.canvas.GraphicsContext;
import p229opdracht1.graphics.Scaleable;

public interface Drawable extends Scaleable {
    public void draw(GraphicsContext g);
}
