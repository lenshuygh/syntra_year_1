package p113opdracht01;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            System.out.println(random.nextInt(45));
        }
    }
}
