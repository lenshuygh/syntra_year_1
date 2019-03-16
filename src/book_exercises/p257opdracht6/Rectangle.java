package book_exercises.p257opdracht6;

import javafx.scene.canvas.GraphicsContext;

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
        if(width < 0 || height < 0){
            throw new NegativeSizeException("Rectangle height cannot be negative.");
        }
        this.height = Math.abs(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) throws NegativeSizeException{
        if(width < 0 || width < 0){
            throw new NegativeSizeException("Rectangle width cannot be negative.");
        }
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (getHeight() != rectangle.getHeight()) return false;
        if (getWidth() != rectangle.getWidth()) return false;
        if (getX() != rectangle.getX()) return false;
        if (getY() != rectangle.getY()) return false;

        return description != null ? description.equals(rectangle.description) : rectangle.description == null;

    }

    @Override
    public int hashCode() {
        int result = getHeight();
        result = 31 * result + getWidth();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + getX();
        result = 31 * result + getY();
        return result;
    }

    @Override
    public void scale(int s) {
        float factor = (float)s / 100;
        int newHeight = (int)(getHeight() * factor);
        int newWidth = (int)(getWidth() * factor);

        setHeight(newHeight);
        setWidth(newWidth);
    }


    @Override
    public void draw(GraphicsContext g) {

    }
}
