package recap.interfaces.p233opdracht2;

public interface Scaleable {
    int DOUBLE = 200;
    int HALF = 50;
    int QUARTER = 25;

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
