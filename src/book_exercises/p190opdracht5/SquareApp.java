package book_exercises.p190opdracht5;

public class SquareApp {
    public static void main(String[] args) {
        Square square0 = new Square();
        System.out.println("new Square();");
        printSquareInfo(square0);

        Square square1 = new Square(5);
        System.out.println("new Square(5);");
        printSquareInfo(square1);

        Square square2 = new Square(8,10,20);
        System.out.println("new Square(8,10,20);");
        printSquareInfo(square2);

        Square square3 = new Square(square1);
        System.out.println("new Square(square1);");
        printSquareInfo(square3);
    }

    static void printSquareInfo(Square square){
        System.out.println("side: " + square.getSide());
        System.out.println("x: " + square.getX());
        System.out.println("y: " + square.getY());
        System.out.println("height: " + square.getHeight());
        System.out.println("width: " + square.getWidth());
        System.out.println("area: " + square.getArea());
        System.out.println("perimeter: " + square.getPerimeter());
        System.out.println("\n\n");
    }
}
