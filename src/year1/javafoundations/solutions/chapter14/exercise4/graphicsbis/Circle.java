package year1.javafoundations.solutions.chapter14.exercise4.graphicsbis;

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
    public void scale(int s) {
        float factor = (float)s / 100;
        int newRadius = (int)(getRadius() * factor);

        setRadius(newRadius);
    }

    @Override
    public void draw(GraphicsContext g) {

    }
}
