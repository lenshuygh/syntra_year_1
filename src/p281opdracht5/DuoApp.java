package p281opdracht5;

import p272opdracht1.Duo;

public class DuoApp {
    public static void main(String[] args) {
        Duo<String> stringDuo = new Duo<>("Hello","World");
        Duo<Integer> integerDuo = new Duo<>(8,6);
        Duo<Number> numberDuo = new Duo<>(8,9);

        DuoUtility.printUpper(stringDuo);
        DuoUtility.printDuo(stringDuo);
        DuoUtility.printSum(integerDuo);
        //DuoUtility.printSuperDuo(numberDuo);
       // DuoUtility.printSuperDuo(integerDuo);
    }
}
