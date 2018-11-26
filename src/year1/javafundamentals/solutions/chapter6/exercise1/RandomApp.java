package year1.javafundamentals.solutions.chapter6.exercise1;

import java.util.Random;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Random numbers no limit: ");
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());

        System.out.println("Random numbers with limit: ");
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
    }
}
