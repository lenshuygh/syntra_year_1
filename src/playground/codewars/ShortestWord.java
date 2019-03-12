package playground.codewars;

import java.util.stream.Stream;

public class ShortestWord {
    public static void main(String[] args) {
        System.out.println(findShort("dit is een zin met woorden en da is't."));
    }

    public static int findShort(String s) {
        String[] words = s.split(" ");
        return Stream.of(words).mapToInt(String::length).min().getAsInt();
    }
}
