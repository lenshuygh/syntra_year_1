package p200opdracht8.graphics.animals;

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
