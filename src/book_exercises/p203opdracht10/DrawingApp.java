package book_exercises.p203opdracht10;

import book_exercises.p200opdracht8.graphics.Circle;
import book_exercises.p200opdracht8.graphics.Shape;
import book_exercises.p200opdracht8.graphics.Square;

public class DrawingApp {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();



        Shape square1 = new Square(8);
        drawing.add(square1);
        System.out.println("size of array in drawing: " + drawing.getSize());

        Shape circle = new Circle(20,4,8);
        drawing.add(circle);
        System.out.println("size of array in drawing: " + drawing.getSize());

        drawing.remove(square1);
        System.out.println("size of array in drawing: " + drawing.getSize());

        Shape circle2 = new Circle(20,4,8);
        drawing.add(circle2);
        System.out.println("size of array in drawing: " + drawing.getSize());

/*        Shape triangle = new Triangle(8,9,4);
        drawing.add(triangle);
        System.out.println("size of array in drawing: " + drawing.getSize());

        Shape square = new Square(8);
        drawing.add(square);
        System.out.println("size of array in drawing: " + drawing.getSize());

        Shape square2 = new Square(5);
        drawing.add(square2);
        System.out.println("size of array in drawing: " + drawing.getSize());

        Shape triangle2 = new Triangle(8,9,4);
        drawing.add(triangle2);
        System.out.println("size of array in drawing: " + drawing.getSize());

        drawing.remove(triangle);
        System.out.println("size of array in drawing: " + drawing.getSize());*/
    }



}
