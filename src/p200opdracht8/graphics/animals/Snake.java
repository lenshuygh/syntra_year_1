package p200opdracht8.graphics.animals;

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
