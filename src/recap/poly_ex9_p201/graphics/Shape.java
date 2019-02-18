package recap.poly_ex9_p201.graphics;

public abstract class Shape {
    private static int count = 0;
    private int x;
    private int y;

    {
        count++;
    }

    public Shape() {
        //count++;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x,int y){
        setX(x);
        setY(y);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public static int getCount(){
        return count;
    }
}
