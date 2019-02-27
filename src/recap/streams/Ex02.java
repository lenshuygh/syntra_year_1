package recap.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        Stream<String> stringStream  = Stream.generate(() -> "Hello World!!!!");
        //stringStream.forEach(s -> System.out.println(s));

        IntStream intStream = IntStream.rangeClosed(0,10);
        intStream.forEach(System.out::println);
        System.out.println("-----------------");
        IntStream.rangeClosed(5,15)
                .forEach(System.out::println);
        System.out.println("-----------------");
        /*IntStream.iterate(0, i -> i + 1)
                .forEach(System.out::println);
        */

    }
}
