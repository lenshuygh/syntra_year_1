package year1.javafoundations.solutions.chapter17.exercise6;

public interface DuoUtility {
    static void printUpper(Duo<String> d){
        System.out.println(d.getFirst().compareTo(d.getSecond()) < 0? d.getSecond() : d.getFirst());
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

    static <T> void swapFirst(Duo<T> d1, Duo<T> d2){
        T temp = d1.getFirst();
        d1.setFirst(d2.getFirst());
        d2.setFirst(temp);
    }
}
