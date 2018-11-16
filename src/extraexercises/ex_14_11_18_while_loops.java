package extraexercises;

import java.util.Scanner;

public class ex_14_11_18_while_loops {
    public static void main(String[] args) {
        int number1 = 0;
        boolean firstNumberAsked = false;
        Scanner scanner = new Scanner(System.in);
        float result = 0F;
        String operator = "";

        while (!operator.equals("=")) {
            //only the first time the first number needs to be asked to put in
            if (!firstNumberAsked) {
                number1 = getNumber(scanner, firstNumberAsked);
                result = (float) number1;
                firstNumberAsked = true;
            }
            operator = getOperator(scanner);
            if (operator.equals("=")) {
                break;
            }

            int numberX = getNumber(scanner, firstNumberAsked);
            switch (operator) {
                case "+":
                    result += numberX;
                    break;
                case "-":
                    result -= numberX;
                    break;
                case "*":
                    result *= numberX;
                    break;
                case "/":
                    result /= numberX;
                    break;
            }
        }
        System.out.println("The result of your calculation  = " + result);


        scanner.close();
    }

    private static String getOperator(Scanner scanner) {
        String in = "";
        boolean notAnOperator = true;
        while (notAnOperator) {
            System.out.println("Please enter an operator + - / * % = ");
            in = scanner.nextLine();
            notAnOperator = !checkIfOperator(in);
            if (notAnOperator) {
                System.out.println("I asked for an operator not something else!");

            }
        }
        return in;
    }

    private static int getNumber(Scanner scanner, boolean firstNumberAsked) {
        boolean notANumber = true;
        String in = "";
        while (notANumber) {
            System.out.println(firstNumberAsked ? "Please enter a number" : "Please enter the first number");
            in = scanner.nextLine();
            notANumber = checkIfOperator(in);
            if (notANumber) {
                System.out.println("I asked for a number not an operator!");
            }
        }
        return Integer.parseInt(in);
    }

    private static boolean checkIfOperator(String in) {
        return in.equals("+") || in.equals("-") || in.equals("/") || in.equals("*") || in.equals("%") || in.equals("=");
    }
}
