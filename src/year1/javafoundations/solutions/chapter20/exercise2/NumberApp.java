package year1.javafoundations.solutions.chapter20.exercise2;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by JonathanSyntra on 19/03/2017.
 */
public class NumberApp {
    public static void main(String[] args) {
        Collection<Integer> intCollection;
        //intCollection = new ArrayList();
        intCollection = new HashSet<>();

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.println("Give number " + (i+1) + ":");
            intCollection.add(keyboard.nextInt());
        }

        intCollection.forEach(System.out::println);
        System.out.println("Sum: " + intCollection.stream().mapToInt(Integer::intValue).sum());
        System.out.println("Average: " + intCollection.stream().mapToInt(Integer::intValue).average());
    }
}
