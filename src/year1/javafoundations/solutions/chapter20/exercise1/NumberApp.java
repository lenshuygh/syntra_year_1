package year1.javafoundations.solutions.chapter20.exercise1;

import java.util.*;

/**
 * Created by JonathanSyntra on 19/03/2017.
 */
public class NumberApp {
    public static void main(String[] args) {
        Collection<Integer> intCollection;
        intCollection = new ArrayList();
        //intCollection = new LinkedList<>();

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
