package book_exercises.p244opdracht1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.next());
        int den = Integer.parseInt(scanner.next());
        int div = num / den;
        System.out.printf("%d/%d=%d",num,den,div);
        scanner.close();
    }
}
