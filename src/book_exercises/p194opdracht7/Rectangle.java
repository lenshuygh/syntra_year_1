package book_exercises.p194opdracht7;

public class Rectangle extends Shape{
    private static int count;
    public static final int ANGLES = 4;
    private int width;
    private int height;

    {
        count++;
    }

    public Rectangle(){
        this(0,0);
    }
    public Rectangle(int width,int height){
        this(width,height,0,0);
    }
    public Rectangle(int width,int height,int x,int y){
        this.setWidth(width);
        this.setHeight(height);
        setX(x);
        setY(y);
    }
    public Rectangle(Rectangle r){
        this.setWidth(r.getWidth());
        this.setHeight(r.getHeight());
        setX(r.getX());
        setY(r.getY());
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
        return (getX()*getY());
    }

    @Override
    public double getPerimeter() {
        return (getX()+getY())*2;
    }

    public static int getCount() {
        return count;
    }

    public void grow(int d){
        this.setWidth((this.width + d < 0) ? 0 : this.width + d);
        this.setHeight((this.height + d < 0) ? 0 : this.height + d);
    }
}
