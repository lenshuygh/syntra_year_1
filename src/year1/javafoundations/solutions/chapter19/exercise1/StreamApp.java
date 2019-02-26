package year1.javafoundations.solutions.chapter19.exercise1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by JonathanSyntra on 11/03/2017.
 */
public class StreamApp {
    public static void main(String[] args) {
        String[] words = {"Hello","is","it","me","you're","looking","for?"};
        Stream.of(words).forEach(System.out::println);

        IntStream.range(0,100).forEach(i -> {
            System.out.println(i*i);
        });

        Person[] persons = {new Person("Laurens", Person.Gender.MALE), new Person("Romy", Person.Gender.FEMALE)};
        Stream.of(persons).forEach(System.out::println);
    }
}