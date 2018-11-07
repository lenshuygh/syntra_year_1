package year1.basicprogramming.solutions.extra;

/**
 * Created by JonathanSyntra on 29/10/2018.
 */
public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println("hasTeen(9, 99, 19)");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println("hasTeen(23, 15, 42)");
        System.out.println(hasTeen(23, 15, 42));
        System.out.println("hasTeen(22, 23, 34)");
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int age1, int age2, int age3){
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }

    public static boolean isTeen(int age){
        return age >= 13 && age <= 19;
    }
}
