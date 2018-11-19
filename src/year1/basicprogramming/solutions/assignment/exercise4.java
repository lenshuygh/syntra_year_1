package year1.basicprogramming.solutions.assignment;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 7/11/2018.
 */
public class exercise4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please give a number of which you want the multiplication table of:");
        int number = keyboard.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t*\t" + number + "\t=\t" + number * i);
        }
    }
}
