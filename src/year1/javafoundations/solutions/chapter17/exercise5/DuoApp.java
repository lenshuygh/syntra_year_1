package year1.javafoundations.solutions.chapter17.exercise5;

public class DuoApp {
    public static void main(String[] args) {
        Duo<String> stringDuo = new Duo<>("Hello", "World");
        Duo<Integer> integerDuo = new Duo<>(8, 6);
        Duo<Number> numberDuo = new Duo<>(8,9);

        /*DuoUtility.printUpper(stringDuo);
        DuoUtility.printDuo(stringDuo);
        DuoUtility.printSum(integerDuo);
        DuoUtility.printSuperDuo(numberDuo);*/
        //DuoUtility.printSuperDuo(integerDuo);

        DuoUtility.printUpper(new Duo<>("Hello","World"));
        DuoUtility.printDuo(new Duo<>("Oops",7));
        DuoUtility.printSum(new Duo<>(8,6));
        DuoUtility.printSuperDuo(new Duo<>(new Integer(7),8));
        Duo<Number> integerDuo1 = new Duo<>(new Integer(7), 8);
        DuoUtility.printSuperDuo(integerDuo1);
    }
}
