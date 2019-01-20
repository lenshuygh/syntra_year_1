package year1.javafundamentals.solutions.chapter10.exercise3.graphics;

/**
 * Created by JonathanSyntra on 5/12/2016.
 */
public class Square extends Rectangle {
    public final String description = super.description + " (square)";

    public void setSide(int side){
        setHeight(side);
        setWidth(side);
    }

    public int getSide(){
        return getHeight();
    }
}
