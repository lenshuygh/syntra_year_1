package year1.basicprogramming.solutions.assignment;

/**
 * Created by JonathanSyntra on 7/11/2018.
 */
public class exercise5 {
    public static void main(String[] args) {
        System.out.println("The sum of 5 even numbers is " + sumOfNTermEvenNumbers(5));
        System.out.println("The sum of 6 even numbers is " + sumOfNTermEvenNumbers(6));
        System.out.println("The sum of 7 even numbers is " + sumOfNTermEvenNumbers(7));
        System.out.println("The sum of 10 even numbers is " + sumOfNTermEvenNumbers(10));
    }

    public static int sumOfNTermEvenNumbers(int n){
        int sum = 0;
        for (int i = 1, amountOfEvenNumbers = 0; amountOfEvenNumbers < n; i++) {
            if(i%2 == 0){
                sum += i;
                amountOfEvenNumbers++;
            }
        }
        return sum;
    }
}
