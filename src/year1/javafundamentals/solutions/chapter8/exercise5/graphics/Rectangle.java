package year1.javafundamentals.solutions.chapter8.exercise5.graphics;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class Rectangle {
    public int x;
    public int y;
    public int height;
    public int width;

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

    public void setPosition(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public double getArea(){
        return this.getHeight() * this.getWidth();
    }

    public double getPerimeter(){
        return (this.getHeight() + this.getWidth()) * 2;
    }

    public void grow(int d){
        this.setHeight(this.height + d);
        this.setWidth(this.width + d);
    }
}
