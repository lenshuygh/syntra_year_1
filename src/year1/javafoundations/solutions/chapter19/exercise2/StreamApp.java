package year1.javafoundations.solutions.chapter19.exercise2;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by JonathanSyntra on 11/03/2017.
 */
public class StreamApp {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        IntStream numbersStream = IntStream.of(numbers);
        System.out.println("Count:");
        printOptional(numbersStream.count());
        numbersStream = IntStream.of(numbers);
        System.out.println("Max:");
        printOptional(numbersStream.max());
        numbersStream = IntStream.of(numbers);
        System.out.println("Min:");
        printOptional(numbersStream.min());
        numbersStream = IntStream.of(numbers);
        System.out.println("Average:");
        printOptional(numbersStream.average());
        numbersStream = IntStream.of(numbers);
        System.out.println("Sum:");
        printOptional(numbersStream.sum());
        numbersStream = IntStream.of(numbers);
        System.out.println("Sum of quadrants");
        System.out.println(numbersStream.reduce(0,(acc,el) -> acc + el * el));

        String[] words = {"These","aren't","the","droids","you're","looking","for"};
        System.out.println(Stream.of(words).reduce("",(acc,el)-> acc + el + ";"));
    }

    public static void printOptional(OptionalInt optionalInt){
        System.out.println(optionalInt.isPresent() ? optionalInt.getAsInt() : "No Result");
    }

    public static void printOptional(OptionalDouble optionalInt){
        System.out.println(optionalInt.isPresent() ? optionalInt.getAsDouble() : "No Result");
    }

    public static void printOptional(int number){
        System.out.println(number);
    }
    public static void printOptional(long number){
        System.out.println(number);
    }
}
