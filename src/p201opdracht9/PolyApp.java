package p201opdracht9;

import p200opdracht8.graphics.*;

public class PolyApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];

        Shape triangle1 = new Triangle(5, 6, 8, 5, 6);
        Shape rect1 = new Rectangle(4, 8, 4, 3);
        Shape square1 = new Square(5, 01, 80);
        Shape circle1 = new Circle(5, 45, 30);
        Shape iso1 = new IsoScelesTriangle(4, 6, 40, 60);
        Shape triangle2 = new Triangle(10, 18, 3, 80, 90);
        Shape rect2 = new Rectangle(14, 9, 70, 60);
        Shape square2 = new Square(17, 40, 80);
        Shape circle2 = new Circle(13, 20, 100);
        Shape iso2 = new IsoScelesTriangle(8, 19, 8, 9);

        shapes[0] = triangle1;
        shapes[1] = rect1;
        shapes[2] = square1;
        shapes[3] = circle1;
        shapes[4] = iso1;
        shapes[5] = triangle2;
        shapes[6] = rect2;
        shapes[7] = square2;
        shapes[8] = circle2;
        shapes[9] = iso2;

        for (Shape shape : shapes) {
            System.out.println("\n******************* properties ***********************\n");
            printProperties(shape);
            System.out.println("\n******************* dimensions ************************\n");
            printDimensions(shape);
        }
    }

    private static void printDimensions(Shape shape) {
        System.out.println("class = " + shape.getClass().getSimpleName());
        System.out.println("--------------------------------------------------");

        if (shape instanceof Square) {
            System.out.println("side: " + ((Square) shape).getSide());

        } else if (shape instanceof Triangle) {
            System.out.println("perpendicular: " + ((Triangle) shape).getPerpendicular());
            System.out.println("height: " + ((Triangle) shape).getHeight());
            System.out.println("width: " + ((Triangle) shape).getWidth());
        } else if (shape instanceof Rectangle) {
            System.out.println("height: " + ((Rectangle) shape).getHeight());
            System.out.println("width: " + ((Rectangle) shape).getWidth());
        } else if (shape instanceof Circle) {
            System.out.println("radius: " + ((Circle) shape).getRadius());
        }
    }


    private static void printProperties(Shape shape) {
        System.out.println(shape.getClass().getName());
        System.out.println("------------------------------------");
        System.out.println("perimeter: " + shape.getPerimeter());
        System.out.println("area: " + shape.getArea());
        System.out.println("x: " + shape.getX());
        System.out.println("y: " + shape.getY());
    }
}
