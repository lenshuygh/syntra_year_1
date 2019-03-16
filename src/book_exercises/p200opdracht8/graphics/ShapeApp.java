package book_exercises.p200opdracht8.graphics;

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

        System.out.println("Amount of Shapes: " + Shape.getCount());
        System.out.println("Amount of Rectangles: " + Rectangle.getCount());
        System.out.println("Amount of Squares: " + Square.getCount());
        System.out.println("Amount of Circles: " + Circle.getCount());
        System.out.println("Amount of Triangles: " + Triangle.getCount());
        System.out.println("Amount of IsosclesTriangles: " + IsoScelesTriangle.getCount());
    }
}
