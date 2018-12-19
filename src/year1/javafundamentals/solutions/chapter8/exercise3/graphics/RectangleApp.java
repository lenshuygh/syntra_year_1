package year1.javafundamentals.solutions.chapter8.exercise3.graphics;

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

        System.out.printf("Position: %d(x) %d(y) %n",rect.x,rect.y);
        System.out.println("Height: " + rect.height);
        System.out.println("Width: " + rect.width);
        System.out.println();

        Rectangle rect2 = new Rectangle();
        rect2.x = 10;
        rect2.y = 20;
        rect2.height = 100;
        rect2.width = 115;

        System.out.printf("Position: %d(x) %d(y) %n",rect2.x,rect2.y);
        System.out.println("Height: " + rect2.height);
        System.out.println("Width: " + rect2.width);
    }
}
