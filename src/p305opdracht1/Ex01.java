package p305opdracht1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        String[] w = {"aa","bb","cc","dd","ee","ff"};
        Stream.of(w)
                .forEach(System.out::println);

        System.out.println("---------");
        IntStream.rangeClosed(0,99)
                .forEach(System.out::print);
    }
}
