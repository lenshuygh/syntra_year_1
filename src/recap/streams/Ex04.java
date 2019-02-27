package recap.streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Ex04 {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(0,10)
                .sum();
        System.out.println(sum);

        OptionalInt max = IntStream.rangeClosed(0,0)
                .max();
        if(max.isPresent()){
            System.out.println("max -> " + max.getAsInt());
        }else{
            System.out.println("no max value");
        }
        System.out.println("-----------------");

        max = IntStream.of()
                .max();
        if(max.isPresent()){
            System.out.println("max -> " + max.getAsInt());
        }else{
            System.out.println("no max value");
        }
    }
}
