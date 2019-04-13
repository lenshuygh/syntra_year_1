package playground.streams;

import java.util.Arrays;
import java.util.List;

public class FlatMap2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alpha","bravo","charlie");
        list.stream()
                .map(String::toUpperCase)
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

    }
}
