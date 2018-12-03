package p139opdracht2;

import java.util.Scanner;

public class ArraysOfObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a sentence: ");
        String txt = scanner.nextLine();

        String[] words = txt.split(" ");
        for (String word : words) {
            System.out.println('|' + word + "|("+word.length()+')');
        }
    }
}
