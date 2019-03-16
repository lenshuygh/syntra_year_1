package book_exercises.p252opdracht5;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num = Integer.parseInt(scanner.next());
            int den = Integer.parseInt(scanner.next());
            int div = num / den;
            System.out.printf("%d/%d=%d", num, den, div);
        } catch (ArithmeticException ae) {
            System.out.println("Dondo es la division zero");
        } catch (RuntimeException e) {
            System.out.println("runtime exc:");
            e.printStackTrace();
            scanner.close();
        } finally {
            System.out.println("THIS IS THE FINAL BLOCK");
        }
    }
}
