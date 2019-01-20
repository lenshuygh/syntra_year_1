package year1.javafundamentals.solutions.chapter9.exercise1.logo;

import year1.javafundamentals.solutions.chapter9.graphics.Circle;
import year1.javafundamentals.solutions.chapter9.graphics.Rectangle;

/**
 * Created by JonathanSyntra on 6/01/2019.
 */
public class LogoBis {
    private Circle[] circles = {};
    private Rectangle[] rectangles = {};
    private String text = "";

    public LogoBis() {
    }

    public LogoBis(String text) {
        this(null, null, text);
    }

    public LogoBis(Circle[] circles, Rectangle[] rectangles, String text) {
        this.setCircles(circles);
        this.setRectangles(rectangles);
        this.setText(text);
    }

    public Circle[] getCircles() {
        return circles;
    }

    public void setCircles(Circle[] circles) {
        if(circles != null) {
            this.circles = circles;
        }
    }

    public Rectangle[] getRectangles() {
        return rectangles;
    }

    public void setRectangles(Rectangle[] rectangles) {
        if(rectangles != null) {
            this.rectangles = rectangles;
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if(text != null) {
            this.text = text;
        }
    }

    public double getArea(){
        double area = 0;
        for (Rectangle rectangle : rectangles) {
            area +=  rectangle != null ? rectangle.getArea() : 0;
        }
        for (Circle circle : circles) {
            if(circle != null) {
                area += circle.getArea();
            }
        }
        return area;
    }
}
