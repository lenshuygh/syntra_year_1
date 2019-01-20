package year1.javafundamentals.solutions.chapter10.exercise8.graphics;

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

        System.out.println(circle.toString());
        System.out.println(triangle);
        System.out.println(sq);
        System.out.println(circle2);
        System.out.println(isoScelesTriangle);
        System.out.println(isoScelesTriangle2);

        System.out.println(rect);
        System.out.println(rect2);
        System.out.println(rect3);
        System.out.println("Is rect equals to rect2? " + rect.equals(rect2));
        System.out.println("Is rect equals to rect3? " + rect.equals(rect3));
        System.out.println("Is rect2 equals to rect3? " + rect2.equals(rect3));
    }
}
