package recap.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filtering01 {
    public static void main(String[] args) {
        String[] words = {"Thor","Smiegel","Kiska","Snickers","Elsa","Lyra","Mina"};



        Predicate<String> stringPredicate = s -> s.toLowerCase().contains("e");
        Stream<String> filteredStream = Stream.of(words)
                .filter(stringPredicate);

        filteredStream.forEach(System.out::println);
    }
}
