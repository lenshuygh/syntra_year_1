package year1.basicprogramming.solutions.chapter5.exercise18.extra;

/**
 * Created by JonathanSyntra on 23/10/2018.
 */
public class Extra1_2_3_4_5_6 {
    public static void main(String[] args) {
        System.out.println("====Positivity====");
        System.out.println("Is number 5 positive? " + NumberUtility.isPositive(5));
        System.out.println("Is number -5 positive? " + NumberUtility.isPositive(-5));
        System.out.println();
        System.out.println("====Zeroïsm====");
        System.out.println("Is number 5 zero? " + NumberUtility.isZero(5));
        System.out.println("Is number -5 zero? " + NumberUtility.isZero(-5));
        System.out.println("Is number 0 zero? " + NumberUtility.isZero(0));
        System.out.println();
        System.out.println("====BiggestOfTwo====");
        System.out.println("Which is bigger, 5 or 12? " + NumberUtility.max(5, 12));
        System.out.println("Which is bigger, -1 or -2? " + NumberUtility.max(-1, -2));
        System.out.println();
        System.out.println("====SmallestOfTwo====");
        System.out.println("Which is smaller, 5 or 12? " + NumberUtility.min(5, 12));
        System.out.println("Which is smaller, -1 or -2? " + NumberUtility.min(-1, -2));
        System.out.println();
        System.out.println("====BiggestOfThree====");
        System.out.println("Which is bigger, 5 or 12 or 7? " + NumberUtility.max(5, 12, 7));
        System.out.println("Which is bigger, -1 or -5 or -3? " + NumberUtility.max(-1, -2, -3));
        System.out.println();
        System.out.println("====SmallestOfThree====");
        System.out.println("Which is smaller, 5 or 12 or 7? " + NumberUtility.min(5, 12, 7));
        System.out.println("Which is smaller, -1 or -5 or -3? " + NumberUtility.min(-1, -5, -3));
        System.out.println();
        System.out.println("====QuadraticWhat?====");
        System.out.println("What is the quadraticEquation result of 5, 12, 7? " + NumberUtility.quadraticEquation(5, 12, 7));
        System.out.println();
    }

}