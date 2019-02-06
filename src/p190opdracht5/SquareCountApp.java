package p190opdracht5;

import year1.javafundamentals.solutions.chapter8.exercise10.graphics.Rectangle;


public class SquareCountApp {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.getCount());

        System.out.println();
        Square square1 = new Square();
        System.out.println(square.getCount());
        System.out.println(Square.getCount()); // <- class method can be accessed trough class name instead of instance name
        System.out.println(Rectangle.getCount());

        System.out.println();
        Rectangle rectangle = new Rectangle();
        System.out.println(square.getCount());
        System.out.println(rectangle.getCount());

        System.out.println();
        Rectangle s = new Square();
        System.out.println(square.getCount());
        System.out.println(rectangle.getCount());
    }
}
