package extraexercises.ProjectEurlerDotNet;

public class Problem03_LargestPrimeFactor {

    //  The prime factors of 13195 are 5, 7, 13 and 29.
    //  What is the largest prime factor of the number 600851475143 ?


    public static void main(String[] args) {
        long inputNumber = 600851475143L;
        //int primeFactor = 1;
        long biggestPrimeFactor = 1;
        for (long i = 3L; i < inputNumber; i++) {
            System.out.print(i);
            // check if inputNumber is divisible by i
            if(inputNumber % i == 0){
                // check if it's a prime
                // if so check if previously found number is smaller or greater
                if(isPrime(i)){
                    if(i > biggestPrimeFactor){
                        biggestPrimeFactor = i;
                    }
                }
            }
            System.out.println();
        }
        System.out.println(biggestPrimeFactor);
    }

    private static boolean isPrime(long i) {

        for (long j = 2L; j < i-1; j++) {
            if(i % j == 0){
                System.out.print(j+',');
                return false;
            }
        }
        return true;
    }
}
