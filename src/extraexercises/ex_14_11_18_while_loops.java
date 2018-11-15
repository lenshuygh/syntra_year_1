package extraexercises;

import java.util.Scanner;

public class ex_14_11_18_while_loops {
    public static void main(String[] args) {
        int number1;
        Scanner scanner = new Scanner(System.in);

        float result = (float) number1;
        String operator = "";

        while (!operator.equals("=")) {
            number1 = getNumber(scanner);
            operator = getOperator(scanner);
            if (operator.equals("=")) {
                break;
            }

            int numberX = getNumber(scanner);
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
        System.out.println("Please enter an operator + - / * % = ");
        String in = "";
        boolean notAnOperator = true;
        while (notAnOperator) {
            in = scanner.nextLine();
            notAnOperator = !checkIfOperator(in);
            if (notAnOperator) {
                System.out.println("I asked for an operator not something else!");
                System.out.println("Please enter an operator + - / * % = ");
            }
        }
        return in;
    }

    private static int getNumber(Scanner scanner) {
        boolean notANumber = true;
        String in = "";
        while (notANumber) {
            //ask inout, check if first number is allready assigned
            if number1 == 0
            System.out.println("Please enter the first number");
            System.out.println("Please enter a number");
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
