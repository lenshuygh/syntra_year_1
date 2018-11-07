package lenshuygh_07112018;

import java.util.Scanner;

public class Oefening_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (i * number));
        }
        scanner.close();
    }
}
