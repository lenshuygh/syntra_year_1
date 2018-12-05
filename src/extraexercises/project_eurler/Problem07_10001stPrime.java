package extraexercises.project_eurler;

public class Problem07_10001stPrime {
    /*
        By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

        What is the 10 001st prime number?
     */
    public static void main(String[] args) {
        int count = 0;
        int prime = 0;
        for (int i = 2; count < 10_001; i++) {
            if(isPrime(i)){
                count++;
                prime = i;
            }
        }
        System.out.println("prime -> " + prime);
    }

    private static boolean isPrime(int number) {
        for (int j = 2; j < number-1; j++) {
            if(number % j == 0)
            return false;
        }
        return true;
    }
}
