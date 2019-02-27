package recap.streams;

import java.util.stream.Stream;

public class Map01 {
    public static void main(String[] args) {
        String[] words = {"Thor","Smiegel","Kiska","Snickers","Elsa","Lyra","Mina"};

        Stream.of(words)
                .mapToInt(s -> s.length())
                .forEach(System.out::println);
    }
}
