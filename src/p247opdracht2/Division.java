package p247opdracht2;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num = Integer.parseInt(scanner.next());
            int den = Integer.parseInt(scanner.next());
            try {
                int div = num / den;
                System.out.printf("%d/%d=%d", num, den, div);
            } catch (ArithmeticException ae) {
                System.out.println("Dondo es la division zero");
            }
        }catch (NumberFormatException nfe){
            System.out.println("Error while parsing into Integer");
        }
        scanner.close();
    }
}
