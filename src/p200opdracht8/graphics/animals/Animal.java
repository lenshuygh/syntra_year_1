package p200opdracht8.graphics.animals;

/**
 * Created by JonathanSyntra on 24/01/2018.
 */
public abstract class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void move();

    public abstract void makeNoise();
}
