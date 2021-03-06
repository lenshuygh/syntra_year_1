package book_exercises.p147.graphics;

public class Rectangle {
    public static int angles = 4;
    public static int angles2;
    private static int objectCount = 0;
    private int heigth;
    private int width;
    private int x;
    private int y;


    {
        objectCount++;
    }

    static {
        angles2 = 4;
    }

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(int heigth, int width) {
        this(heigth, width, 0, 0);
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.getHeigth(), rectangle.getWidth(), rectangle.getX(), rectangle.getY());
    }

    public Rectangle(int heigth, int width, int x, int y) {
        this.setHeigth(heigth);
        this.setWidth(width);
        this.setX(x);
        this.setY(y);
    }


    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = (heigth < 0) ? heigth * -1 : heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {

        this.width = (width < 0) ? width * -1 : width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = (x < 0) ? 0 : x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = (y < 0) ? 0 : y;
    }

    public void grow(int d) {
        this.setWidth((this.width + d < 0) ? 0 : this.width + d);
        this.setHeigth((this.heigth + d < 0) ? 0 : this.heigth + d);
    }

    public void setPosition(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public double getArea() {
        return width * heigth;
    }

    public int getPerimeter() {
        return 2 * (width + heigth);
    }

    public static int getCount(){
        return objectCount;
    }
}
