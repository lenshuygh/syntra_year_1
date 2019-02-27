package recap.streams;

import java.util.stream.Stream;

public class Filtering02 {
    public static void main(String[] args) {
        String[] words = {"Thor","Smiegel","Kiska","Snickers","Elsa","Lyra","Mina","Thor"};

        for (String word : words) {
            if(word.contains("e") && word.length() > 3){
                System.out.println(word);
            }
        }

        System.out.println("-----------becomes------------");

        Stream.of(words)
                .filter(word -> word.contains("e"))
                .filter(word -> word.length() > 3)
                .forEach(System.out::println);
        System.out.println("------------------------------------");
        Stream.of(words).forEach(System.out::println);

        System.out.println("------------distinct----------------");
        Stream.of(words)
                .distinct()
                .forEach(System.out::println);

        System.out.println("-------------limit------------------");
        Stream.of(words)
                .distinct()
                .limit(2)
                .forEach(System.out::println);

        System.out.println("-----------original----------------");
        Stream.of(words)
                .forEach(System.out::println);

        System.out.println("-------------skip------------------");
        Stream.of(words)
                .skip(3)
                .forEach(System.out::println);
    }
}
