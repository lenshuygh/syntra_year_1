package year1.javafundamentals.solutions.chapter10.exercise7.animals;

/**
 * Created by JonathanSyntra on 24/01/2018.
 */
public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is running!");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " is miaowing!");
    }
}
