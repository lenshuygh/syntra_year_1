package p147.graphics;

public class Rectangle {
    public int heigth;
    public int width;
    public int x;
    public  int y;

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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

    public void grow(int d){
        this.setWidth(this.width+d);
        this.setHeigth(this.heigth+d);
    }

    public void setPosition(int x,int y){
        this.setX(x);
        this.setY(y);
    }

    public double getArea(){
        return width*heigth;
    }

    public int getPerimeter(){
        return 2*(width+heigth);
    }


}
