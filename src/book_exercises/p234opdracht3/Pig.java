package book_exercises.p234opdracht3;

public interface Pig {
    void grunt();

    default void fly(){
        System.out.println("pig is flying");
    }
}
