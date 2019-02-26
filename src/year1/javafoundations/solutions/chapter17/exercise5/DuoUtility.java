package year1.javafoundations.solutions.chapter17.exercise5;

public interface DuoUtility {
    static void printUpper(Duo<String> d){
        System.out.println(d.getFirst().toUpperCase() + " " + d.getSecond().toUpperCase());
    }

    static void printDuo(Duo<?> d){
        System.out.println(d);
    }

    static void printSum(Duo<? extends Number> d){
        System.out.println(d.getFirst().doubleValue() + d.getSecond().doubleValue());
    }

    static void printSuperDuo(Duo<? super Number> d){
        System.out.println(d);
    }
}
