package p215opdracht1;

import java.util.Scanner;

public class WrapperExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.next();
        //Integer i = new Integer(input);
        Integer i = Integer.parseInt(input);
        i += 10;
        System.out.println("i: " + i);
        System.out.println("bitCount: " + Integer.bitCount(i));
        //System.out.println("byteValue: " + i.byteValue());
        System.out.println(i.BYTES);
    }
}
