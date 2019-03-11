package p322opdracht1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Opdracht1bis {
    public static void main(String[] args) {
        List<Integer> numbersList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number (int): ");
            numbersList.add(scanner.nextInt());
        }
        numbersList.forEach(System.out::println);
        System.out.println("Sum: " + numbersList.stream().mapToInt(Integer::new).sum());
        System.out.print("Average: " + numbersList.stream().mapToInt(Integer::new).average().getAsDouble());

        scanner.close();
    }
}
