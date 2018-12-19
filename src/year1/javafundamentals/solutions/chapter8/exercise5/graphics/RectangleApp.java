package year1.javafundamentals.solutions.chapter8.exercise5.graphics;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.x = 1;
        rect.y = 2;
        rect.height = 10;
        rect.width = 15;

        System.out.printf("Position: %d(x) %d(y) \n",rect.x,rect.y);
        System.out.println("Height: " + rect.height);
        System.out.println("Width: " + rect.width);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());


        Rectangle rect2 = new Rectangle();
        rect2.setX(10);
        rect2.setY(20);
        rect2.setHeight(100);
        rect2.setWidth(115);

        System.out.printf("Position: %d(x) %d(y) \n",rect2.getX(),rect2.getY());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}
