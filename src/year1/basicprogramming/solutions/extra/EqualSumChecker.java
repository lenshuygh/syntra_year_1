package year1.basicprogramming.solutions.extra;

/**
 * Created by JonathanSyntra on 29/10/2018.
 */
public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println("hasEqualSum(1,1,1)");
        System.out.println(hasEqualSum(1,1,1));
        System.out.println("hasEqualSum(1,1,2)");
        System.out.println(hasEqualSum(1,1,2));
        System.out.println("hasEqualSum(1,1,1)");
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int number1, int number2, int expectedSum){
        /*return number1 + number2 == expectedSum;*/
        int actualSum = number1 + number2;
        return actualSum == expectedSum;
    }
}
