package year1.javafoundations.solutions.chapter17.exercise6;

public class DuoApp {
    public static void main(String[] args) {
        Duo<String> stringDuo = new Duo<>("Hello", "World");
        Duo<String> stringDuo2 = new Duo<>("Goodbye", "Mars");

        System.out.println(stringDuo);
        System.out.println(stringDuo2);
        System.out.println("=================================");
        DuoUtility.swapFirst(stringDuo, stringDuo2);
        System.out.println(stringDuo);
        System.out.println(stringDuo2);

    }
}
