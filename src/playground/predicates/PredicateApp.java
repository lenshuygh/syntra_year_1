package playground.predicates;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicateApp {
    public static void main(String[] args) {
        new PredicateApp();
    }
    public PredicateApp() {
        Predicate<Integer> checkNumberEqualTo6 = s -> s == 6;
        Predicate<String> checkLengthGreaterThan10 = s -> s.length() > 6;

        Predicate<Cat> catsAbove10 = s -> s.getAge() > 10;
        Predicate<Cat> catsLongerName = s -> s.getName().length() > 5;

        int myNumber = 10;
        System.out.println("Is the number equal 6 ? : " + checkNumberEqualTo6.test(myNumber));
        myNumber = 6;
        System.out.println("Is the number equal 6 ? : " + checkNumberEqualTo6.test(myNumber));

        System.out.println();

        String testString = "testje";
        System.out.println("String length > 6 ?: " + checkLengthGreaterThan10.test(testString));

        testString = "langerestring";
        System.out.println("String length > 6 ?: " + checkLengthGreaterThan10.test(testString));

        System.out.println();
        System.out.println();

        System.out.println("Stream 4 to 8:");
        IntStream.rangeClosed(4, 8)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Stream 4 to 8 with predicate filter:");
        IntStream.rangeClosed(4, 8)
                .filter(checkNumberEqualTo6::test)
                .forEach(System.out::println);


        Cat c1 = new Cat("Thor", 14);
        Cat c2 = new Cat("Smiegel", 8);
        Set<Cat> catSet = new HashSet<>();
        catSet.add(c1);
        catSet.add(c2);

        System.out.println();
        System.out.println("All cats");
        catSet.stream()
                .map(Cat::getName)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Cats above 10");
        catSet.stream()
                .filter(catsAbove10)
                .map(Cat::getName)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Cats many letters");
        catSet.stream()
                .filter(catsLongerName)
                .map(Cat::getName)
                .forEach(System.out::println);
    }
}

