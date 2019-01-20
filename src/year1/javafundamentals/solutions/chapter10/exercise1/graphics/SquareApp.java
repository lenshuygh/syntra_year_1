package year1.javafundamentals.solutions.chapter10.exercise1.graphics;

/**
 * Created by JonathanSyntra on 5/12/2016.
 */
public class SquareApp {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
        System.out.println(square.getX());
        System.out.println(square.getY());
        System.out.println(square.getHeight());
        System.out.println(square.getWidth());

        square.setPosition(10,15);
        System.out.println(square.getX());
        System.out.println(square.getY());
    }
}
