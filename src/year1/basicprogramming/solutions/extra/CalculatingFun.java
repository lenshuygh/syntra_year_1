package year1.basicprogramming.solutions.extra;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by JonathanSyntra on 13/11/2018.
 */
public class CalculatingFun {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the most awesome calculator in the world!");
        System.out.println("With this calculator you can use any round number!");
        System.out.println("As operators you can use any of these symbols + - / * % =");
        System.out.println("Using the = operator will make the program stop and show the result");
        System.out.println();

        boolean keepRunning = true;
        boolean firstRun = true;
        double result = 0;
        do {
            String operator = "-";
            if(!firstRun) {
                operator = getOperator(keyboard);
            }
            if("=".equals(operator)) {
                System.out.println("The result of your calculation = " + result);
                keepRunning = false;
                continue;
            }

            int input = getNumber(keyboard, firstRun);
            if(firstRun){
                result += input;
                firstRun = false;
                continue;
            }
            switch (operator) {
                case "+":
                    result += input;
                    break;
                case "-":
                    result -= input;
                    break;
                case "*":
                    result *= input;
                    break;
                case "/":
                    result /= input;
                    break;
                case "%":
                    result %= input;
                    break;
            }

        } while(keepRunning);
    }

    private static int getNumber(Scanner keyboard, boolean firstRun) {
        String inputNotParsed = "0";
        do{
            if(isOperator(inputNotParsed)){
                System.out.println("I asked for a number not an operator!");
            }
            System.out.println(firstRun ? "Please enter the first number " : "Please enter a number ");
            inputNotParsed = keyboard.nextLine();
        } while(isOperator(inputNotParsed));
        return Integer.parseInt(inputNotParsed);
    }

    public static String getOperator(Scanner keyboard) {
        String operator = "-";
        do {
            if (!isOperator(operator)) {
                System.out.println("I asked for an operator not something else!");
            }
            System.out.println("Please enter an operator + - / * % = ");
            operator = keyboard.nextLine();
        } while (!isOperator(operator));
        return operator;
    }


    public static boolean isOperator(String input){
        return "+".equals(input) || "-".equals(input) || "/".equals(input) || "*".equals(input) || "%".equals(input) || "=".equals(input);
    }
}
