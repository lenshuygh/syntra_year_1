package recap.streams;

import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        // starts counting at 100 , print 100 numbers divisable by 3 and 5
        int counter = 0;
        for (int i = 100; counter < 100; i++) {
            if((i%3 == 0) && (i % 5 == 0)){
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("Counter " + counter);

        System.out.println("--------------streams----------------");
        Stream.iterate(100,i -> i+1)
                .filter(s -> s % 3 == 0)
                .filter(s -> s % 5 == 0)
                .limit(100).forEach(System.out::println);
    }
}
