package year1.basicprogramming.solutions.chapter5.exercise17;

/**
 * Created by JonathanSyntra on 23/10/2016.
 */
public class For7 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0; i < 10000; i+=28){
            if(i % 6 == 0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
