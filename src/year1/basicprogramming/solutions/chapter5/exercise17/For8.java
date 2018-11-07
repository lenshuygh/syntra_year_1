package year1.basicprogramming.solutions.chapter5.exercise17;

/**
 * Created by JonathanSyntra on 23/10/2016.
 */
public class For8 {
    public static void main(String[] args) {
        final int MAX = 1000;
        int count = 0;
        for(int i = 2; i < MAX; i++){
            boolean isPrime = true;
            for(int j = 2; j < i && isPrime; j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("I have found " + count + " primes");
    }
}
