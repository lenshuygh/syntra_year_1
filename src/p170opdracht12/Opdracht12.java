package p170opdracht12;

public class Opdracht12 {
    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.setPosition(5,5);
        circle.setRadius(5);

        printCircleData(circle);



    }

    public static void printCircleData(Circle c){
        System.out.println("--------------");
        System.out.println("circle counter: " + c.getCount());
        System.out.println("x: " + c.getX());
        System.out.println("y: " + c.getY());
        System.out.println("radius: " + c.getRadius());
        System.out.println("area: " + c.getArea());
        System.out.println("perimeter: " + c.getPerimeter());
    }

}
