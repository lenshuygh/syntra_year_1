package p330opdracht4;

import java.util.*;

public class TreeSetApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedSet<String> mySet = new TreeSet<>();

        System.out.print("Enter a few words: ");
        String[] words = scanner.nextLine().split(" ");
        scanner.close();

        Arrays.stream(words).forEach(mySet::add);

        System.out.println();
        System.out.println("words:");
        mySet.stream().forEach(System.out::println);
        System.out.println();
        System.out.print("First: " + mySet.first());
        System.out.println();
        System.out.println("Last: " + mySet.last());


    }
}
