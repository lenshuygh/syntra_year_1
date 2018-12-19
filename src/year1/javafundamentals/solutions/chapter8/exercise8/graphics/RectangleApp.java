package year1.javafundamentals.solutions.chapter8.exercise8.graphics;

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

        printRectangle(rect);

        Rectangle rect2 = new Rectangle(-100,-115);
        rect2.setX(10);
        rect2.setY(20);

        printRectangle(rect2);

        Rectangle rect3 = new Rectangle(50,-75,10,12);

        printRectangle(rect3);

        Rectangle rect4 = new Rectangle(rect);

        printRectangle(rect4);
    }

    public static void printRectangle(Rectangle rect){
        System.out.printf("Position: %d(x) %d(y) \n",rect.getX(),rect.getY());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}
