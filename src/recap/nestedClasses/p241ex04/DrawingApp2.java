package recap.nestedClasses.p241ex04;

import java.util.Iterator;

public class DrawingApp2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,10,40,50);
        Circle circle = new Circle(40,30,20);
        Triangle triangle = new Triangle(40,30,40,20,30);

        System.out.println("areas");
        System.out.println("------");
        Shape[] shapes = {rectangle,circle,triangle};
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }


        Drawable[] drawables = {rectangle,circle,triangle};
        for (int i = 0; i < drawables.length; i++) {
            drawables[i].scale(50);
        }

        System.out.println("after:");
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }

        //using iterator

        System.out.printf("%nwith iterator%n%n");
        Drawing drawing = new Drawing();

        drawing.addDrawable(new Circle(10));
        drawing.addDrawable(new Rectangle(10,50,70,80));
        drawing.addDrawable(new Triangle(10,50,40));
        drawing.addDrawable(new Square(10));
        drawing.addDrawable(new IsoScelesTriangle(40,40,50,80));
        drawing.addDrawable(new Circle(80,10,5));

        Iterator iterator = drawing.new DrawableIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
