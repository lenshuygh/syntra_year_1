package lenshuygh_07112018;

import java.util.Scanner;

public class Oefening_3 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + " -> ");
            sum += scanner.nextInt();
        }
        System.out.println();
        System.out.println("De som van de gegeven getallen is: " + sum);
        System.out.println("Het gemiddelde van de gegeven getallen is: " + ((float) sum) / 10);
        scanner.close();
    }
}
