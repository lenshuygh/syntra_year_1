package recap.streams;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Ex03 {
    public static void main(String[] args) {
        String[] words = {"Thor","Smiegel","Kiska","Snickers","Elsa","Lyra","Mina"};

        Stream<String> stringStream = Stream.of(words);
        Consumer<String> consumer = s -> System.out.println(s);
        stringStream.forEach(consumer);

        System.out.println("-------------------------");

        Stream<String> stringStream2 = Stream.of(words);
        Consumer<String> consumer2 = System.out::println;
        stringStream2.forEach(consumer2);

        System.out.println("-------------------------");
        Stream.of(words)
                .forEach(System.out::println);
    }
}
