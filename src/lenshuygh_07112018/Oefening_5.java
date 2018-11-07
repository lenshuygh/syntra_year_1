package lenshuygh_07112018;

import java.util.Scanner;

public class Oefening_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer het aantal termen in: ");
        int number = scanner.nextInt();
        System.out.println("De som van de even natuurlijke getallen tot " + number + " termen is " + nNaturalSum(number) );
    }

    private static int nNaturalSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i * 2;
        }
        return sum;
    }
}
