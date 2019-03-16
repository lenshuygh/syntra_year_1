package year1.javafoundations.solutions.chapter20.exercise3;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by JonathanSyntra on 20/03/2017.
 */
public class LottoApp {
    public static void main(String[] args) {
        Collection<Integer> intCollection = new LinkedHashSet<>();
        Scanner keyboard = new Scanner(System.in);

        while (intCollection.size() < 6) {
            System.out.println("Geef een uniek getal tussen 1 en 45:");
            int number = keyboard.nextInt();
            intCollection.add(number);
        }

        intCollection.forEach(System.out::println);
    }
}
