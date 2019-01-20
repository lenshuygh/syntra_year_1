package year1.javafundamentals.solutions.chapter10.exercise9.graphics;

/**
 * Created by JonathanSyntra on 26/12/2016.
 */
public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10,5,9,7);
        Circle circle = new Circle(12);
        Triangle triangle = new Triangle(13,12,5);
        Square sq = new Square(13);
        Circle circle2 = new Circle(8);
        IsoScelesTriangle isoScelesTriangle = new IsoScelesTriangle(12,20);
        Rectangle rect2 = new Rectangle(12,7,2,3);
        IsoScelesTriangle isoScelesTriangle2 = new IsoScelesTriangle(12,20);
        Rectangle rect3 = new Rectangle(10,5,9,7);

        Shape shapes[] = {rect, circle, triangle, sq, circle2, isoScelesTriangle, rect2, isoScelesTriangle2, rect3};
        for (Shape shape : shapes) {
            printShape(shape);
        }
    }

    public static void printShape(Shape shape){
        System.out.println(shape);
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println("Area: " + shape.getArea());
        System.out.println("Position: (x) = " + shape.getX() + " (y) = " + shape.getY());
        if(shape instanceof Square){
            Square square = (Square) shape;
            System.out.println("Side: " + square.getSide());
        } else if(shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            System.out.println("Width: " + rectangle.getWidth());
            System.out.println("Height: " + rectangle.getHeight());
        } else if(shape instanceof Triangle){
            Triangle triangleInner = (Triangle) shape;
            System.out.println("Perpendicular: " + triangleInner.getPerpendicular());
            System.out.println("Width: " + triangleInner.getWidth());
        } else if(shape instanceof Circle){
            Circle circle1 = (Circle) shape;
            System.out.println("Radius: " + circle1.getRadius());
        }
    }
}
