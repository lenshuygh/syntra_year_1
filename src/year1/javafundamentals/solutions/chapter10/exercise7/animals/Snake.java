package year1.javafundamentals.solutions.chapter10.exercise7.animals;

/**
 * Created by JonathanSyntra on 24/01/2018.
 */
public class Snake extends Animal {
    public Snake() {
    }

    public Snake(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is gliding!");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " is hissing!");
    }
}
