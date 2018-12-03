package p143opdracht4;

import java.util.Scanner;

public class LookupTables {

    public static void main(String[] args) {
        int[] points = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("word: ");
        String word = scanner.nextLine();

        word = word.toUpperCase();
        char[] letters = word.toCharArray();

        int fistLetterValue = 'A';

        for (char letter : letters) {
            score += points[letter - fistLetterValue];
        }

        System.out.print("points: " + score);

        scanner.close();
    }
}
