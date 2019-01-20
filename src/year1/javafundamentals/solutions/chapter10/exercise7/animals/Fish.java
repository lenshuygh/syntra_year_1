package year1.javafundamentals.solutions.chapter10.exercise7.animals;

/**
 * Created by JonathanSyntra on 24/01/2018.
 */
public class Fish extends Animal {
    public Fish() {
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is swimming!");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " is blubbing!");
    }
}
