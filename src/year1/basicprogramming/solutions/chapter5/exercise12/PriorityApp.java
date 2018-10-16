package year1.basicprogramming.solutions.chapter5.exercise12;

/**
 * Created by JonathanSyntra on 15/10/2016.
 */
public class PriorityApp {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int result = ++a * b-- + b < 2 ? --a : ++b;
        System.out.println("Result = " + result);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /**
         * 1st: ++a             =>  a = 2   b = 2
         * 2nd: *               =>  a = 2   b = 2
         * 3rd: b--             =>  a = 2   b = 1
         * 4th: +               =>  a = 2   b = 1
         * 5th: < ? :           =>  a = 2   b = 1
         * 6th: ++b             =>  a = 2   b = 2
         */
    }
}
