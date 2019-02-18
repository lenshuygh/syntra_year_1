package recap.ex10p203;

public class Circle extends Shape {
    public  final String description = "Circle";
    private static int count;
    private int radius;
    public static final int ANGLES = 0;

    {
        count = 0;
    }

    public Circle() {
        this(5);
    }

    public Circle(int radius) {
        this(radius, 0, 0);
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        setPosition(x,y);
        count++;
    }

    public Circle(Circle circle) {
        this(circle.getRadius(), circle.getX(), circle.getY());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void grow(int d){
        this.setRadius(this.getRadius()+d);
    }

    public static int getCount(){
        return count;
    }
}
