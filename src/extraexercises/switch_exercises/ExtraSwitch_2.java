package extraexercises.switch_exercises;

import java.io.IOException;
import java.util.Scanner;

public class ExtraSwitch_2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float num1 = scanner.nextFloat();
        System.out.println("enter an operator (+, - , * or /): ");
        char operator = (char) System.in.read();
        System.out.print("Enter a number: ");
        float num2 = scanner.nextFloat();
        float result = 0F;
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
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        scanner.close();

    }
}
