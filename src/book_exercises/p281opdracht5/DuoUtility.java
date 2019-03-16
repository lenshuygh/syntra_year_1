package book_exercises.p281opdracht5;

import book_exercises.p272opdracht1.Duo;

public interface DuoUtility {
    static void printUpper(Duo<String> d){
        System.out.println(d.getFirst().toUpperCase() + "," +d.getSecond().toUpperCase());
    }

    static void printDuo(Duo<?> d){
        System.out.println(d.getFirst() + "," +d.getSecond());
    }

    static void printSum(Duo<? extends Number> d){
        Number n1 = d.getFirst();
        Number n2 = d.getSecond();
        System.out.println(n1 + " + " + n2 + " = " + n1.doubleValue() + n2.doubleValue());
    }

    static void printSuperDuo(Duo<Integer> integerDuo) {
    }
}
