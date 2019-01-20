package year1.javafundamentals.solutions.chapter10.exercise7.animals;

/**
 * Created by JonathanSyntra on 24/01/2018.
 */
public class Bird extends Animal {
    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is flying!");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " is tsjirping!");
    }
}
