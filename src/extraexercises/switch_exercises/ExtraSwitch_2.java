package extraexercises.switch_exercises;

import java.io.IOException;
import java.util.Scanner;

public class ExtraSwitch_2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.print("enter an operator: ");
        char operator = (char) System.in.read();
        System.out.print("Enter a number: ");
        int num2 = scanner.nextInt();
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        System.out.println("result: " + result);
        scanner.close();

    }
}
