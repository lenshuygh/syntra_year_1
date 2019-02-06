package year1.javafoundations.solutions.chapter13.exercise1.graphics;

/**
 * Created by JonathanSyntra on 22/01/2017.
 */
public class DrawingApp {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        Rectangle rect = new Rectangle(10,5,9,7);
        Circle circle = new Circle(12);
        Triangle triangle = new Triangle(13,12,5);

        System.out.println(drawing.getSize());
        drawing.addShape(rect);
        System.out.println(drawing.getSize());
        drawing.addShape(circle);
        System.out.println(drawing.getSize());
        drawing.addShape(triangle);
        System.out.println(drawing.getSize());

        for (int i = 0; i <= 150; i++) {
            drawing.addShape(new Circle(i));
        }

        System.out.println(drawing.getSize());
    }
}
