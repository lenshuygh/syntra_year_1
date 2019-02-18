package recap.graphics;

public class Triangle extends Shape {
    private static int count;
    public final String description = "Triangle";
    private int height;
    private int width;
    private int perpendicular;

    {
        count = 0;
    }

    public Triangle(){
        this(0,0,0);
    }

    public Triangle(int width,int height,int perpendicular){
        this(width,height,perpendicular,0,0);
    }

    public Triangle(int width,int height,int perpendicular,int x,int y){
        setWidth(width);
        setHeight(height);
        setPerpendicular(perpendicular);
        setPosition(x,y);
        count++;
    }

    public Triangle(Triangle triangle){
        this(triangle.getWidth(),triangle.getHeight(),triangle.getPerpendicular(),triangle.getX(),triangle.getY());
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
        return (getHeight() * getWidth()) / 2;
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
