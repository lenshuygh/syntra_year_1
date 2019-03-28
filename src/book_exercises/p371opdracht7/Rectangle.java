package book_exercises.p371opdracht7;

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

    public Rectangle() throws NegativeSizeException {
        this(5,5);
    }

    public Rectangle(int height, int width) throws NegativeSizeException {
        this(1,1,height,width);
    }

    public Rectangle(int x, int y, int height, int width) throws NegativeSizeException {
        this.setPosition(x,y);
        this.setHeight(height);
        this.setWidth(width);
        count++;
    }

    public Rectangle(Rectangle rectangle) throws NegativeSizeException {
        this(rectangle.getX(),rectangle.getY(),rectangle.getHeight(),rectangle.getWidth());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) throws NegativeSizeException {
        if(height < 0) throw new NegativeSizeException("Height lower than 0");
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) throws NegativeSizeException {
        if(width < 0) throw new NegativeSizeException("Width lower than 0");
        this.width = width;
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

    public void grow(int d) throws NegativeSizeException {
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
    public void scale(int s) throws NegativeSizeException {
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
