package book_exercises.p371opdracht7;

import javafx.scene.canvas.GraphicsContext;

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

    public Circle() throws NegativeSizeException {
        this(10);
    }

    public Circle(int radius) throws NegativeSizeException {
        this(1,1,radius);
    }

    public Circle(int x, int y, int radius) throws NegativeSizeException {
        this.setPosition(x,y);
        this.setRadius(radius);
        count++;
    }

    public Circle(Circle circle) throws NegativeSizeException {
        this(circle.getX(), circle.getY(), circle.getRadius());
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) throws NegativeSizeException {
        if(radius < 0) throw new NegativeSizeException("Radius lower than 0");
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

    public void grow(int d) throws NegativeSizeException {
        this.setRadius(this.getRadius() + d);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        if (getX() != circle.getX()) return false;
        if (getY() != circle.getY()) return false;

        return getRadius() == circle.getRadius();

    }

    @Override
    public int hashCode() {
        return getRadius() + getX()*11 + getY()*3;
    }

    @Override
    public void scale(int s) throws NegativeSizeException {
        float factor = (float)s / 100;
        int newRadius = (int)(getRadius() * factor);

        setRadius(newRadius);
    }

    @Override
    public void draw(GraphicsContext g) {

    }
}
