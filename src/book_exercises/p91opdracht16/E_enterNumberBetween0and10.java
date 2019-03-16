package book_exercises.p91opdracht16;

import java.util.Scanner;

public class E_enterNumberBetween0and10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
        }while((num >= 10) || (num <= 0));
        scanner.close();
    }
}
