package recap.graphics;

public class Rectangle extends Shape {
    private static int count;
    public static final int ANGLES = 4;
    private int width;
    private int height;
    public  final String description = "Rectangle";

    {
        count = 0;
    }

    public Rectangle() {
        this(5,5);
    }

    public Rectangle(int width, int height) {
        this(width,height,0,0);
    }

    public Rectangle(int width, int height, int x, int y) {
        this.setWidth(width);
        this.setHeight(height);
        setPosition(x,y);
        count++;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }

    @Override
    public double getPerimeter() {
        return 2*(getWidth()+getHeight());
    }

    public static int getCount(){
        return count;
    }

    public void grow(int d){
        this.setWidth(getWidth()+d);
        this.setHeight(getHeight()+d);
    }
}
