package recap.interfaces.playground;

public interface InterfaceWithDefaultMethods {
    int HALF = 50;
    int DOUBLE = 200;

    void scale(double factor);

    default void scaleDouble(){
        scale(DOUBLE);
    }

    default void scaleHalf(){
        scale(HALF);
    }
}
