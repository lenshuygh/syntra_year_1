package year1.javafundamentals.solutions.chapter7.extra;

/**
 * Created by JonathanSyntra on 30/11/2018.
 */
public class Oefening1 {
    public static void main(String[] args) {
        int[] numbers = {20, 35, 50, 12, 114, 205, 99, 300, 57, 112};

        int amountEven = 0;
        int sumEven = 0;

        int amountUneven = 0;
        int sumUneven = 0;

        for (int number : numbers) {
            if(number % 2 == 0) {
                amountEven++;
                sumEven += number;
            } else {
                amountUneven++;
                sumUneven += number;
            }
        }
        System.out.printf("We have %d even numbers %n", amountEven);
        System.out.println("The sum of the even numbers is " + sumEven);
        System.out.println("The average of the even numbers is " + sumEven/(float)amountEven);
        System.out.println();
        System.out.printf("We have %d even numbers %n", amountUneven);
        System.out.println("The sum of the uneven numbers is " + sumUneven);
        System.out.println("The average of the uneven numbers is " + sumUneven/(float)amountUneven);
    }
}
