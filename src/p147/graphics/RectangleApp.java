package p147.graphics;

public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("This program uses a rectangle");

        Rectangle rect = new Rectangle();
        rect.heigth = 10;
        rect.width = 6;
        rect.x = 2;
        rect.y = 3;

        System.out.println("h: "+ rect.heigth);
        System.out.println("w: " + rect.width);
        System.out.println("x: " + rect.x);
        System.out.println("y: "+rect.y);

        Rectangle rect2 = new Rectangle();
        rect2.heigth = 5;
        rect2.width = 20;
        rect2.x = 12;
        rect2.y = 30;

        System.out.println("h: "+  rect2.heigth);
        System.out.println("w: " + rect2.width);
        System.out.println("x: " + rect2.x);
        System.out.println("y: "+  rect2.y);

        rect2.grow(10);

        System.out.println("h: "+  rect2.heigth);
        System.out.println("w: " + rect2.width);
        System.out.println("x: " + rect2.x);
        System.out.println("y: "+  rect2.y);

        System.out.println("area: "+rect2.getArea());
        System.out.println("perimeter: " + rect2.getPerimeter());


    }
}

