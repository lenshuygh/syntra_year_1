package book_exercises.p181opdracht1;

public class SquareApp {
    public static void main(String[] args) {
        Square square = new Square();
        square.setHeight(5);
        System.out.printf("%.2f\n",square.getArea());
        System.out.printf("%.2f\n",square.getPerimeter());

        System.out.println("---------------------");

        Square q = new Square();
        q.setSide(5);
        System.out.printf("%.2f\n",q.getArea());
        System.out.printf("%.2f\n",q.getPerimeter());

        System.out.println("---------------------");


        q.setHeight(4);
        q.setWidth(3);
    }
}
