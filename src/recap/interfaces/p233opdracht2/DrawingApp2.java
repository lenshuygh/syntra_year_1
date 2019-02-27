package recap.interfaces.p233opdracht2;

public class DrawingApp2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,10,40,50);
        Circle circle = new Circle(40,30,20);
        Triangle triangle = new Triangle(40,30,40,20,30);

        System.out.println("areas");
        System.out.println("------");
        Shape[] shapes = {rectangle,circle,triangle};
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }


        Drawable[] drawables = {rectangle,circle,triangle};
        for (int i = 0; i < drawables.length; i++) {
            drawables[i].scale(50);
        }

        System.out.println("after:");
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}
