package playground;

public class RecursivePrimes {
    public static void main(String[] args) {
        new RecursivePrimes();
    }

    public RecursivePrimes() {
        System.out.println(isPrime(6));
    }

    private boolean isPrime(int i) {
        if(i < 3){
            return false;
        }
        if(isDivisible(i,i-1)){
            return true;
        }else {
            return false;
        }
    }

    private boolean isDivisible(int number, int divisor) {
        if(divisor == 1){
            return true;
        }
        if(number % divisor == 0){
            return false;
        }
        isDivisible(number, divisor-1);
        System.out.println("this was the end");
        return false;
    }
}
