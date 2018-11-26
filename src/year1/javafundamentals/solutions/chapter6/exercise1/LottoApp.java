package year1.javafundamentals.solutions.chapter6.exercise1;

import java.util.Random;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class LottoApp {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            System.out.println(random.nextInt(45) + 1);
        }
    }
}
