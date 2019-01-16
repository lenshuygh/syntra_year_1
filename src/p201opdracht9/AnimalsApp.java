package p201opdracht9;

import p200opdracht8.graphics.animals.*;

public class AnimalsApp {
    public static void main(String[] args) {
        Animal bird = new Bird("Vliegbeest");
        Animal cat = new Cat("Thor");
        Animal fish = new Fish("moby dick");
        Animal snake = new Snake("ana conda");

        Animal[] animals = new Animal[4];

        animals[0] = bird;
        animals[1] = cat;
        animals[2] = fish;
        animals[3]= snake;


        for (Animal animal : animals) {
            animal.makeNoise();
        }
    }
}
