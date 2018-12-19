package p170opdracht12;

public class Circle {
    public static int angles = 0;
    private static int count;
    private int x;
    private int y;
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle( int radius,int x, int y) {
        this.setX(x);
        this.setY(y);
        this.setRadius(radius);
    }

    public Circle(Circle c){
        this(c.getRadius(),c.getX(),c.getY());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setPosition(int x,int y){
        this.setX(x);
        this.setY(y);
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }

    public int getCount(){
        return count;
    }
}
