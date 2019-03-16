package book_exercises.p339opdracht7;

import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args) {
        Collection<Integer> numbersList = new TreeSet<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number (int): ");
            numbersList.add(scanner.nextInt());
        }
        numbersList.forEach(System.out::println);

        System.out.println("Sum: " + numbersList.stream().mapToInt(Integer::intValue).sum());
        System.out.print("Average: " + numbersList.stream().mapToInt(Integer::intValue).average().getAsDouble());

        scanner.close();
    }
}
