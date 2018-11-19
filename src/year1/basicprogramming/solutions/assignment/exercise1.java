package year1.basicprogramming.solutions.assignment;

/**
 * Created by JonathanSyntra on 7/11/2018.
 */
public class exercise1 {
    public static void main(String[] args) {
        System.out.println("Is 5 divisible by 3? " + isDivisible(5,3));
        System.out.println("Is 2 divisible by 2? " + isDivisible(2,2));
        System.out.println("Is 2 divisible by 3? " + isDivisible(2,3));
    }

    public static boolean isDivisible(int number, int divider){
        return number % divider == 0;
    }
}
