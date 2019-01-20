package year1.javafundamentals.solutions.chapter10.exercise5.graphics;

/**
 * Created by JonathanSyntra on 13/01/2019.
 */
public class SquareApp {
    public static void main(String[] args) {
        Square square1 = new Square();
        Square square2 = new Square(5);
        Square square3 = new Square(7,8,5);
        Square square4 = new Square(square3);
        printSquare(square1);
        printSquare(square2);
        printSquare(square3);
        printSquare(square4);
    }

    private static void printSquare(Square square){
        System.out.printf("%-10s: %5d %n","Side", square.getSide());
        System.out.printf("%-10s: %5d %n","X", square.getX());
        System.out.printf("%-10s: %5d %n","Y", square.getY());
        System.out.printf("%-10s: %5.2f %n","Area", square.getArea());
        System.out.printf("%-10s: %5.2f %n","Perimeter", square.getPerimeter());
        System.out.println("######################################################");
    }
}
