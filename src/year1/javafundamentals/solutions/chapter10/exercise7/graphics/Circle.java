package year1.javafundamentals.solutions.chapter10.exercise7.graphics;

/**
 * Created by JonathanSyntra on 5/12/2016.
 */
public class Circle extends Shape {
    private static int count;
    public static final int ANGLES;
    private int radius;

    static {
        ANGLES = 0;
        count = 0;
    }

    public Circle() {
        this(10);
    }

    public Circle(int radius) {
        this(1,1,radius);
    }

    public Circle(int x, int y, int radius) {
        this.setPosition(x,y);
        this.setRadius(radius);
        count++;
    }

    public Circle(Circle circle){
        this(circle.getX(), circle.getY(), circle.getRadius());
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
//        return radius * radius * Math.PI;
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public void grow(int d){
        this.setRadius(this.getRadius() + d);
    }

    public static int getCount() {
        return count;
    }
}
