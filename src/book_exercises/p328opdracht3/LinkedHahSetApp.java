package book_exercises.p328opdracht3;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHahSetApp {
    public static void main(String[] args) {
        Collection<Integer> numbersList = new LinkedHashSet<>();

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
