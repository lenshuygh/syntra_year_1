package year1.javafundamentals.solutions.chapter10.exercise7.animals;

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
