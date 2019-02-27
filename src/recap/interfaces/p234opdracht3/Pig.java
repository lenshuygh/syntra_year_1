package recap.interfaces.p234opdracht3;

public interface Pig {
    void grunt();

    default void fly(){
        System.out.println("Pig is flying");
    }
}
