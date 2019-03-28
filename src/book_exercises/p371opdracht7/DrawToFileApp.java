package book_exercises.p371opdracht7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class DrawToFileApp {
    public static void main(String[] args) {
        final String path = "drawing0.draw";
        Drawing drawing = null;

        try {
            Drawable d1 = new Circle(10, 10, 50);
            Drawable d2 = new Rectangle(50, 80, 400, 600);
            drawing = new Drawing();
            drawing.addDrawable(d1);
            drawing.addDrawable(d2);

        } catch (NegativeSizeException e) {
            e.printStackTrace();
        }

        try {
            ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream(path));
            if(drawing != null) {
                objectOutput.writeObject(drawing);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
