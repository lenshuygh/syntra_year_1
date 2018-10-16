package year1.basicprogramming.solutions.chapter5.exercise11;

/**
 * Created by JonathanSyntra on 10/10/2016.
 */
public class ConditionalOperator {
    public static void main(String[] args) {
        int number1 = 57;
        int number2 = 33;
        int number3 = -65;
        System.out.println("(number1 < number2)?number1:number2 -> " + ((number1 < number2)?number1:number2));
        System.out.println("(number1 < number3)?number1:number3 -> " + ((number1 < number3)?number1:number3));
        System.out.println("(number2 < number1)?number2:number1 -> " + ((number2 < number1)?number2:number1));
        System.out.println("(number2 < number3)?number2:number3 -> " + ((number2 < number3)?number2:number3));
        System.out.println("(number3 < number1)?number3:number1 -> " + ((number3 < number1)?number3:number1));
        System.out.println("(number3 < number2)?number3:number2 -> " + ((number3 < number2)?number3:number2));
    }
}
