package year1.basicprogramming.solutions.chapter5.exercise16;

/**
 * Created by JonathanSyntra on 17/10/2016.
 */
public class While2 {
    public static void main(String[] args) {
        int number = 0;
        while (number + 3 < 50){
            System.out.println(number += 3);
        }



        int result = 3;
        do {
            System.out.println(result);
            result += 3;
        } while(result < 50);
    }
}
