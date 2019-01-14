package p194opdracht7;

public class Circle extends Shape {
    public static final double PI = Math.PI;
    private int radius;
    private static int count;

    {
        count++;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public void grow(int d){
        this.setRadius(this.getRadius() + d);
    }

    public static int getCount() {
        return count;
    }
}
