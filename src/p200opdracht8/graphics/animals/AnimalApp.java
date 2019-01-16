package p200opdracht8.graphics.animals;

/**
 * Created by JonathanSyntra on 24/01/2018.
 */
public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Cat("Harry");
        Animal bird = new Bird("Bert");
        cat.move();
        cat.makeNoise();
        bird.move();
        bird.makeNoise();
    }
}
