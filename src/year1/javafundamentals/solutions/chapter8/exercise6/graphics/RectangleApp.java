package year1.javafundamentals.solutions.chapter8.exercise6.graphics;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setX(1);
        rect.setY(2);
        rect.setHeight(10);
        rect.setWidth(15);

        System.out.printf("Position: %d(x) %d(y) \n",rect.getX(),rect.getY());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        Rectangle rect2 = new Rectangle();
        rect2.setX(10);
        rect2.setY(20);
        rect2.setHeight(-100);
        rect2.setWidth(-115);

        System.out.printf("Position: %d(x) %d(y) \n",rect2.getX(),rect2.getY());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}
