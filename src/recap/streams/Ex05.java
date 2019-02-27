package recap.streams;

import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args) {
        int result = IntStream.rangeClosed(1,10)
                .reduce(1, (acc,el) -> acc*el);
        System.out.println(result);
    }
}
