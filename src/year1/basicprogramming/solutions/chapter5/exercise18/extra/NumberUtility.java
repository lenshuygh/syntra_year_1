package year1.basicprogramming.solutions.chapter5.exercise18.extra;

/**
 * Created by JonathanSyntra on 24/10/2018.
 */
public class NumberUtility {
    public static boolean isPositive(int number){
        return number > 0;
    }

    public static boolean isZero(int number){
        return number == 0;
    }

    public static int max(int number1, int number2){
        return number1 > number2 ? number1 : number2;
    }

    public static int min(int number1, int number2){
        return number1 < number2 ? number1 : number2;
    }

    public static int max(int number1, int number2, int number3){
        if(number1 > number2 && number1 > number3){
            return number1;
        } else if(number2 > number3) {
            return number2;
        }
        return number3;
    }

    public static int min(int number1, int number2, int number3){
        if(number1 < number2 && number1 < number3){
            return number1;
        } else if(number2 < number3) {
            return number2;
        }
        return number3;
    }

    public static int quadraticEquation(int a, int b, int c){
        return b * b - 4 * a * c;
    }
}
