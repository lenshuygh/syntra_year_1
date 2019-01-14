package p176opdracht1;

import year1.javafundamentals.solutions.chapter8.exercise12.graphics.Circle;
import year1.javafundamentals.solutions.chapter8.exercise12.graphics.Rectangle;

public class LogoBis {
    private Rectangle[] rectangles = {};
    private Circle[] circles = {};
    private String[] strings = {};

    public LogoBis(Rectangle[] rectangles, Circle[] circles, String[] strings) {
        if (rectangles != null) {
            this.rectangles = rectangles;
        }
        if (circles != null) {
            this.circles = circles;
        }
        if(strings != null) {
            this.strings = strings;
        }
    }

    public LogoBis(String[] strings) {
        this.strings = strings;
    }

    public Rectangle[] getRectangles() {
        return rectangles;
    }

    public void setRectangles(Rectangle[] rectangles) {
        this.rectangles = rectangles;
    }

    public Circle[] getCircles() {
        return circles;
    }

    public void setCircles(Circle[] circles) {
        this.circles = circles;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public Double getArea() {
        double area = 0;
        for (Rectangle rectangle : rectangles) {
            area +=  (rectangle != null)?  rectangle.getArea() : 0;
        }
        for (Circle circle : circles) {
            area +=  (circle != null) ? circle.getArea() : 0;
        }
        return area;
    }
}
