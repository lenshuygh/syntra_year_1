package playground.codewars;

import java.util.stream.Stream;

public class ShortestWord {
    public static void main(String[] args) {
        System.out.println(findShort("dit is a zin met woorden en da is't."));
    }

    public static int findShort(String s) {
        return Stream.of(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }
}
