package year1.javafoundations.solutions.chapter19.exercise4;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by JonathanSyntra on 11/03/2017.
 */
public class StreamApp {
    public static void main(String[] args) {
        System.out.println(IntStream.range(0,1000)
                .filter(i -> i % 5 == 0)
                .filter(i -> i % 8 == 0)
                .limit(20)
                .mapToDouble(Math::sqrt)
                .sum());

        int[] sortedRandomInts = new Random().ints(0, 10000)
                .distinct()
                .filter(n -> n % 2 == 0)
                .limit(500)
                .sorted()
                .toArray();

        IntStream.of(sortedRandomInts)
                .limit(20)
                .forEach(System.out::println);
    }
}
