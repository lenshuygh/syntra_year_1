package p190opdracht5;

import year1.javafundamentals.solutions.chapter8.exercise10.graphics.Rectangle;

public class Square extends Rectangle {
    public static int count = 0;

    {
        count++;
    }

    public Square(){
        this(0);
    }

    public Square(int side){
        this(side,0,0);
    }

    public Square(int side,int xPos,int yPos){
        super(xPos,yPos,side,side);
    }

    public Square(Square s){
        this(s.getSide(),s.getX(),s.getY());
    }

    public void setSide(int s){
        super.setHeight(s);
        super.setWidth(s);
    }

    public int getSide(){
        return getWidth();
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }

    public static int getCount(){
        return count;
    }
}
