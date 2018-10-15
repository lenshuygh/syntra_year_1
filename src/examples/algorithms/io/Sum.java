package examples.algorithms.io;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Number 1 : ");
        int a = keyboard.nextInt();
        System.out.print("Number 2: " );
        int b = keyboard.nextInt();

        int sum = a + b;
        System.out.println("Sum : " + sum);

        keyboard.close();
    }
}
