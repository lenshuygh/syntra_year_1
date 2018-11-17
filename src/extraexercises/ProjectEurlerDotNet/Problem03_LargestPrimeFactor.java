package extraexercises.ProjectEurlerDotNet;

public class Problem03_LargestPrimeFactor {

    //  The prime factors of 13195 are 5, 7, 13 and 29.
    //  What is the largest prime factor of the number 600851475143 ?


    public static void main(String[] args) {
        long inputNumber = 600851475143L;
        //long inputNumber = 13195L;
        //long inputNumber = 161L;

        long biggestPrimeFactor = 1;

        long result = 1L;

        //System.out.println("found: "+findPrimeDivider(inputNumber));

        long i = inputNumber;

        while(result < inputNumber){
            long t = findPrimeDivider(i);
            System.out.println("t -> " + t);
            i = i / t;
            result *= t;
            biggestPrimeFactor = (biggestPrimeFactor > t) ? biggestPrimeFactor : t;
        }
        System.out.println("biggest = " + biggestPrimeFactor);
    }


    private static long findPrimeDivider(long number){
        for (long i = 3; i < number; i++) {
            if(isPrime(i)&&(number % i == 0)){
                return i;
            }
        }
        return number;
    }

    private static boolean isPrime(long i) {
        for (long j = 2L; j < i; j++) {
            if(i % j == 0){
                return false;
            }
        }
        //System.out.println(i+" is a prime");
        return true;
    }
}
