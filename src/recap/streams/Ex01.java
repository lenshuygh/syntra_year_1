package recap.streams;

import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        String[] words = {"Thor","Smiegel","Kiska","Snickers","Elsa","Lyra","Mina"};
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("----------------");
        Stream.of(words).forEach(System.out::println);
        System.out.println("----------------");
        Stream<String> stringStream = Stream.of(words);
        stringStream.forEach(System.out::println);
    }
}
