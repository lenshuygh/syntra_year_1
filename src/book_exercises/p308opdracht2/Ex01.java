package book_exercises.p308opdracht2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(0, 50);
        System.out.println(intStream.count());
        intStream = IntStream.rangeClosed(0, 50);
        System.out.println(intStream.max().getAsInt());
        intStream = IntStream.rangeClosed(0, 50);
        System.out.println(intStream.min().getAsInt());
        intStream = IntStream.rangeClosed(0, 50);
        System.out.println(intStream.average().getAsDouble());
        intStream = IntStream.rangeClosed(0, 50);
        System.out.println(intStream.sum());
        intStream = IntStream.rangeClosed(0, 50);
        System.out.println(intStream.reduce(0,(acc,el) -> acc + (int)Math.pow(el,2)));
        System.out.println();
    }
}
