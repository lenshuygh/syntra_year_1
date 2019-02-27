package p308opdracht2;

import java.util.stream.Stream;

public class Ex02 {

    public static void main(String[] args) {
        String[] words = {"Thor", "Smiegel", "Kiska", "Snickers", "Elsa", "Lyra", "Mina"};
        String result = Stream.of(words)
                .reduce(";", (acc, el) -> acc + el + ";");
        System.out.println(result);
    }
}
