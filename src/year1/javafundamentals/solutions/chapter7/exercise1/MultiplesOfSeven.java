package year1.javafundamentals.solutions.chapter7.exercise1;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class MultiplesOfSeven {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0, number = 7; i < numbers.length; i++, number += 7) {
            numbers[i] = number;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
