package p233opdracht2.graphics;

import p229opdracht1.graphics.Scaleable;

public class CreateGraphics {
    public static void main(String[] args) {
        Scaleable[] figures = {new Square(40),new Rectangle(20,30),new Circle(20),new Triangle(10,20,20),new IsoScelesTriangle(10,20,10,20)};

        printArray(figures);

        for (int i = 0; i < figures.length; i++) {
            figures[i].scale(5);
        }

        printArray(figures);
    }

    private static void printArray(Scaleable[] figures){
        for (Scaleable figure : figures) {
            System.out.println(figure.getClass().getSimpleName());
            if(figure instanceof Rectangle){
                System.out.println(((Rectangle) figure).getHeight());
                System.out.println(((Rectangle) figure).getWidth());
            }
            if(figure instanceof Circle){
                System.out.println(((Circle) figure).getRadius());
            }
            if(figure instanceof Triangle){
                System.out.println(((Triangle) figure).getHeight());
                System.out.println(((Triangle) figure).getWidth());
                System.out.println(((Triangle) figure).getPerpendicular());
            }
        }
    }
}
