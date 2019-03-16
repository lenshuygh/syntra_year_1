package book_exercises.p147.graphics;

public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("This program uses a rectangle");

        Rectangle rect = new Rectangle();
        rect.setHeigth(10);
        rect.setWidth(6);
        rect.setX(2);
        rect.setY(3);

        System.out.println("h: "+ rect.getHeigth());
        System.out.println("w: " + rect.getWidth());
        System.out.println("x: " + rect.getX());
        System.out.println("y: "+rect.getY());

        Rectangle rect2 = new Rectangle();
        rect2.setHeigth(5);
        rect2.setWidth(20);
        rect2.setX(12);
        rect2.setY(30);

        System.out.println();
        System.out.println("h: "+  rect2.getHeigth());
        System.out.println("w: " + rect2.getWidth());
        System.out.println("x: " + rect2.getX());
        System.out.println("y: "+  rect2.getY());

        rect2.grow(-10);

        System.out.println();
        System.out.println("h: "+  rect2.getHeigth());
        System.out.println("w: " + rect2.getWidth());
        System.out.println("x: " + rect2.getX());
        System.out.println("y: "+  rect2.getY());

        System.out.println("area: "+rect2.getArea());
        System.out.println("perimeter: " + rect2.getPerimeter());


        Rectangle r3 = new Rectangle();
        r3.setX(-5);
        r3.setY(-2);
        r3.setWidth(-15);
        r3.setHeigth(-20);

        printRectangleData(r3);

        Rectangle r4 = new Rectangle(10,20);

        printRectangleData(r4);

        Rectangle r5 = new Rectangle(r4);

        printRectangleData(r5);

        System.out.println();
        System.out.println("angles: " + Rectangle.angles);

        System.out.println();
        System.out.println("angles2: " + Rectangle.angles2);
    }


    public static void printRectangleData(Rectangle r3){

        System.out.println();
        System.out.println("ObjectCount =  " + Rectangle.getCount());
        System.out.println();
        System.out.println("h: "+  r3.getHeigth());
        System.out.println("w: " + r3.getWidth());
        System.out.println("x: " + r3.getX());
        System.out.println("y: "+  r3.getY());

    }
}

