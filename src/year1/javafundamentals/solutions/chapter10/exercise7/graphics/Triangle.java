package year1.javafundamentals.solutions.chapter10.exercise7.graphics;

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
        int base1 = this.getPerpendicular();
        int base2 = this.getWidth() - base1;

        double side1 = Math.sqrt(Math.pow(this.getHeight(),2) + Math.pow(base1,2));
        double side2 = Math.sqrt(Math.pow(this.getHeight(),2) + Math.pow(base2,2));

        return side1+side2+this.getWidth();
    }

    public static int getCount() {
        return count;
    }
}
