package p194opdracht7;

public class Triangle extends Shape {
    public static final int ANGLES = 3;
    private static int count;
    private int height;
    private int width;
    private int perpendicular;

    {
        count++;
    }

    public Triangle(){
        this(0,0,0);
    }

    public Triangle(int width,int height,int perpendicular){
        this(width,height,perpendicular,0,0);
    }

    public Triangle(int width,int height,int perpendicular,int x,int y){
        this.setWidth(width);
        this.setHeight(height);
        this.setPerpendicular(perpendicular);
        setX(x);
        setY(y);
    }

    public Triangle(Triangle triangle){
        this.setWidth(triangle.getWidth());
        this.setHeight(triangle.getHeight());
        this.setPerpendicular(triangle.getPerpendicular());
        this.setX(triangle.getX());
        this.setY(triangle.getY());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public static int getCount() {
        return count;
    }
}
