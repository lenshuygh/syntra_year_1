package year1.javafundamentals.solutions.chapter8.exercise4.graphics;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class Rectangle {
    public int x;
    public int y;
    public int height;
    public int width;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setPosition(int x, int y){
        /*this.x = x;
        this.y = y;*/
        this.setX(x);
        this.setY(y);
    }

    public void grow(int d){
        this.setHeight(this.height + d);
        this.setWidth(this.width + d);
    }
}
