package year1.javafundamentals.solutions.chapter9.exercise1.logo;

import year1.javafundamentals.solutions.chapter9.graphics.Circle;
import year1.javafundamentals.solutions.chapter9.graphics.Rectangle;

/**
 * Created by JonathanSyntra on 6/01/2019.
 */
public class Logo {
    private Circle circle;
    private Rectangle rectangle;
    private String text;

    public Logo() {
    }

    public Logo(String text) {
        this.text = text;
    }

    public Logo(Circle circle, Rectangle rectangle, String text) {
        this.circle = circle;
        this.rectangle = rectangle;
        this.text = text;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getArea(){
        double area = 0;
        if(rectangle != null){
            area += this.rectangle.getArea();
        }
        if(circle != null) {
            area += this.circle.getArea();
        }
        return area;
    }
}
