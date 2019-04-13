package playground.streams;

import java.util.Arrays;

public class FlatMap {
    public static void main(String[] args) {

                new FlatMap();
    }

    public FlatMap(){
        run();


    }

    private void run() {
        String[] words = {"Thor","Smiegel","Lens"};
        Arrays.stream(words).forEach(System.out::println);

        System.out.println("--------------------");

        Arrays.stream(words)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("--------------------");
        Arrays.stream(words)
            .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

        }
}
