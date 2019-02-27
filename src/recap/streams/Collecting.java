package recap.streams;

import java.util.stream.Stream;

public class Collecting {
    public static void main(String[] args) {
        String[] words = {"Thor", "Smiegel", "Kiska", "Snickers", "Elsa", "Lyra", "Mina"};


        String[] sa = Stream.of(words).toArray(String[]::new);



    }
}
