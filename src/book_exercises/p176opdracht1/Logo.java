package book_exercises.p176opdracht1;

import year1.javafundamentals.solutions.chapter8.exercise12.graphics.Circle;
import year1.javafundamentals.solutions.chapter8.exercise12.graphics.Rectangle;

public class Logo {
    private Rectangle rectangle;
    private Circle circle;
    private String string;

    public Logo(Rectangle rectangle, Circle circle, String string) {
        this.rectangle = rectangle;
        this.circle = circle;
        this.string = string;
    }

    public Logo(String string) {
        this(null,null,string);
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Double getArea(){
        double area = 0;
        area += (rectangle != null) ? rectangle.getArea() : 0;
        area+= (circle != null) ? circle.getArea() : 0;
        return area;
    }
}
