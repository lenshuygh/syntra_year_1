package book_exercises.p297opdracht2;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("give me a sentence: ");
        String s = scanner.nextLine();

        TextPrinter textPrinter = new TextPrinter(s);

        textPrinter.printProcessedWords(TextUtil::reverse);
        System.out.println("------------------------------");
        TextScrambler textScrambler = new TextScrambler();
        textPrinter.printProcessedWords(textScrambler::scramble);
        System.out.println("------------------------------");
        textPrinter.printProcessedWords(String::toLowerCase);
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        TextPrinter textPrinter1 = new TextPrinter("10 test 22 0 5.5");
        textPrinter1.printNumberValues(Double::valueOf);
        System.out.println("------------------------------");
        textPrinter1.printSum(Double::valueOf);
    }
}

