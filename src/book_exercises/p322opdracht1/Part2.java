package book_exercises.p322opdracht1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        String word;
        do{
            System.out.print("Enter a word: ");
            word = scanner.next();
            list.add(word);
        }while (!word.endsWith("."));
        scanner.close();
        System.out.println();
        System.out.println("reverse order");
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        System.out.println();
        System.out.println("wordCount: " + list.size());
        String[] stringArray = list.toArray(new String[list.size()]);
        System.out.println();
        System.out.println("Print as array:");
        for (String s : stringArray) {
            System.out.println(s);
        }
    }
}
