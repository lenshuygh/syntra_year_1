package p113opdracht01;

import java.util.*;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("without bound:");
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());

        System.out.println("with bound:");
        System.out.println(random.nextInt(50));
        System.out.println(random.nextInt(50));
        System.out.println(random.nextInt(50));


    }
}
