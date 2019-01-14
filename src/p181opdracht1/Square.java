package p181opdracht1;

import year1.javafundamentals.solutions.chapter8.exercise10.graphics.Rectangle;

public class Square extends Rectangle {
    public void setSide(int s){
        //setHeight(s);
        //setWidth(s);
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
}
