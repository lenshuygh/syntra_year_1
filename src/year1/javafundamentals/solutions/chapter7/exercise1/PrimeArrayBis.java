package year1.javafundamentals.solutions.chapter7.exercise1;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class PrimeArrayBis {
    public static void main(String[] args) {
        final int MAX = 1000;
        int[] primes = new int[MAX/2];
        int count = 0;
        for(int possiblePrime = 2; possiblePrime < MAX; possiblePrime++){
            boolean isPrime = true;
            for(int foundPrimeIndex = 0;foundPrimeIndex < primes.length && isPrime; foundPrimeIndex++){
                if(primes[foundPrimeIndex] == 0){
                    break;
                }
                if(possiblePrime != primes[foundPrimeIndex] && possiblePrime % primes[foundPrimeIndex] == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                primes[count++] = possiblePrime;
            }
        }

        for (int prime : primes) {
            if (prime == 0){
                break;
            }
            System.out.println(prime);
        }
    }
}
