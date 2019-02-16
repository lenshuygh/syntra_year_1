package year1.javafoundations.solutions.chapter14.exercise4.graphicsbis;

/**
 * Created by JonathanSyntra on 5/02/2017.
 */
public interface Scaleable {
    int QUARTER = 25;
    int HALF = 50;
    int DOUBLE = 200;

    void scale(int s);

    default void scaleQuarter(){
        scale(QUARTER);
    }

    default void scaleHalf(){
        scale(HALF);
    }

    default void scaleDouble(){
        scale(DOUBLE);
    }
}