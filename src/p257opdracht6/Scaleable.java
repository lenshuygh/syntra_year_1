package p257opdracht6;

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