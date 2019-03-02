package recap.nestedClasses.p241ex04;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by JonathanSyntra on 26/12/2016.
 */
public class Triangle extends Shape {
    public static final int ANGLES = 3;
    private static int count = 0;
    private int height;
    private int width;
    private int perpendicular;

    {
        count++;
    }

    public Triangle(){
        this(0,0,0);
    }

    public Triangle(int height, int width, int perpendicular) {
        this(height,width,perpendicular,0,0);
    }

    public Triangle(int height, int width, int perpendicular, int x, int y) {
        this.setHeight(height);
        this.setWidth(width);
        this.setPerpendicular(perpendicular);
        this.setPosition(x,y);
    }

    public Triangle(Triangle triangle){
        this(triangle.getHeight(), triangle.getWidth(), triangle.getPerpendicular(), triangle.getX(), triangle.getY());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = Math.abs(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = Math.abs(width);
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = Math.abs(perpendicular);
    }

    @Override
    public double getArea() {
        return this.getHeight() * this.getWidth() / 2;
    }

    @Override
    public double getPerimeter() {
        int base1 = this.getWidth() - this.getPerpendicular();
        int base2 = this.getWidth() - base1;

        double side1 = Math.sqrt(Math.pow(this.getHeight(),2) + Math.pow(base1,2));
        double side2 = Math.sqrt(Math.pow(this.getHeight(),2) + Math.pow(base2,2));

        return side1+side2+this.getWidth();
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", perpendicular=" + perpendicular +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (getHeight() != triangle.getHeight()) return false;
        if (getWidth() != triangle.getWidth()) return false;
        if (getX() != triangle.getX()) return false;
        if (getY() != triangle.getY()) return false;

        return getPerpendicular() == triangle.getPerpendicular();

    }

    @Override
    public int hashCode() {
        int result = getHeight();
        result = 31 * result + getWidth();
        result = 31 * result + getPerpendicular();
        result = 31 * result + getX();
        result = 31 * result + getY();
        return result;
    }

    @Override
    public void draw(GraphicsContext g) {

    }

    @Override
    public void scale(int s) {
        float factor = (float)s / 100;
        setPerpendicular((int)(getPerpendicular()*factor));
        setWidth((int) (getWidth()*factor));
        setHeight((int) (getHeight()*factor));
    }
}
