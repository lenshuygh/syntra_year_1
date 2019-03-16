package year1.javafoundations.solutions.chapter20.exercise2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by JonathanSyntra on 20/03/2017.
 */
public class LottoApp {
    public static void main(String[] args) {
        Collection<Integer> guessedNumbers = new HashSet<>();
        Scanner keyboard = new Scanner(System.in);

        while (guessedNumbers.size() < 6) {
            System.out.println("Geef een uniek getal tussen 1 en 45:");
            int number = keyboard.nextInt();
            if(number < 1 || number > 45) {
                System.out.println("Wrong number!");
                continue;
            }
            guessedNumbers.add(number);
        }
        guessedNumbers.forEach(System.out::println);

        Collection<Integer> generatedNumbers = new HashSet<>();

        new Random().ints(1,45)
                .distinct()
                .limit(6)
                .forEach(generatedNumbers::add);

        guessedNumbers.retainAll(generatedNumbers);
        System.out.println("Your lucky guesses are:");
        guessedNumbers.forEach(System.out::println);

    }
}
