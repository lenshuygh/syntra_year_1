package recap.Animals;

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
