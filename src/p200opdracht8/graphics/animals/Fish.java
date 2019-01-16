package p200opdracht8.graphics.animals;

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
