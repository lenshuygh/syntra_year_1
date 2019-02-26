package year1.javafoundations.solutions.chapter17.exercise1;

import java.util.Scanner;

public class DuoApp {
    public static void main(String[] args) {
        System.out.println("Duo:");
        Duo<String> duo = new Duo<>("Hello", "World");
        String first = duo.getFirst();
        System.out.println("First: " + first);
        System.out.println("Second: " + duo.getSecond());
        System.out.println("Duo before swap: " + duo);
        duo.swap();
        System.out.println("Duo after swap: " + duo);
        
        System.out.println("=====================================");

        System.out.println("MixedDuo:");
        MixedDuo<Scanner, String> mixedDuo = new MixedDuo<>(new Scanner(System.in), "Scanner");
        System.out.println("First: " + mixedDuo.getFirst());
        System.out.println("Second: " + mixedDuo.getSecond());
    }
}
