package year1.javafundamentals.solutions.chapter10.exercise4.graphics;

/**
 * Created by JonathanSyntra on 5/12/2016.
 */
public class Square extends Rectangle {
    public final String description = super.description + " (square)";

    public void setSide(int side){
        super.setHeight(side);
        super.setWidth(side);
    }

    public int getSide(){
        return getHeight();
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }
}
