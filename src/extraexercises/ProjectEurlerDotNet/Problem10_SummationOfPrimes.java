package extraexercises.ProjectEurlerDotNet;

public class Problem10_SummationOfPrimes {
    /*
        The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

        Find the sum of all the primes below two million.
     */

    public static void main(String[] args) {

        int limit = 2_000_000;
        long sum = 0L;
        for (int i = 2; i < limit; i++) {
            sum += returnIfPrime(i);
        }
        System.out.println("sum: " + sum);
    }

    public static int returnIfPrime(int number){
        for (int i = 2; i < number-1; i++) {
            if(number % i == 0){
                return 0;
            }
        }
        return number;
    }
}
