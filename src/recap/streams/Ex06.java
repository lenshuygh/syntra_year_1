package recap.streams;

import java.util.stream.Stream;

public class Ex06 {
    public static void main(String[] args) {
        String[] words = {"Thor","Smiegel","Kiska","Snickers","Elsa","Lyra","Mina"};

        String res = Stream.of(words)
                .reduce("*",(acc,el) -> acc + el + "*");
        System.out.println(res);
    }
}
