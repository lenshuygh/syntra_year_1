package book_exercises.p371opdracht7;

import java.io.Serializable;

/**
 * Created by JonathanSyntra on 5/02/2017.
 */
public interface Scaleable extends Serializable {
    int QUARTER = 25;
    int HALF = 50;
    int DOUBLE = 200;

    void scale(int s) throws NegativeSizeException;

    default void scaleQuarter() throws NegativeSizeException {
        scale(QUARTER);
    }

    default void scaleHalf() throws NegativeSizeException {
        scale(HALF);
    }

    default void scaleDouble() throws NegativeSizeException {
        scale(DOUBLE);
    }
}