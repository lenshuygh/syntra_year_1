package year1.javafundamentals.solutions.chapter10.exercise7.graphics;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class Rectangle extends Shape {
    private static int count;
    public static final int ANGLES;
    private int height;
    private int width;
    public final String description = "Rectangle";

    static {
        count = 0;
        ANGLES = 4;
    }

    public Rectangle() {
        this(5,5);
    }

    public Rectangle(int height, int width) {
        this(1,1,height,width);
    }

    public Rectangle(int x, int y, int height, int width) {
        this.setPosition(x,y);
        this.setHeight(height);
        this.setWidth(width);
        count++;
    }

    public Rectangle(Rectangle rectangle){
        this(rectangle.getX(),rectangle.getY(),rectangle.getHeight(),rectangle.getWidth());
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
        //this.width = width < 0 ? -width : width;
    }

    @Override
    public double getArea(){
        return height * width;
    }

    @Override
    public double getPerimeter(){
        return (height + width) * 2;
    }

    public void grow(int d){
        this.setHeight(this.getHeight()+d);
        this.setWidth(this.getWidth()+d);
    }

    public static int getCount(){
        return count;
    }
}
