package year1.javafoundations.solutions.chapter13.exercise3;

/**
 * Created by JonathanSyntra on 7/02/2018.
 */
public interface Pig {
    void grunt();
    default void fly(){
        System.out.println("Pigs can't fly");
    }
}
