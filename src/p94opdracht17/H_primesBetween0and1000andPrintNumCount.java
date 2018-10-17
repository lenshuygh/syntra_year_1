package p94opdracht17;

public class H_primesBetween0and1000andPrintNumCount {
    public static void main(String[] args) {
        int count = 0;
        boolean fail = false;
        int iterationsTotal = 0;
        for (int i = 2; i < 1000; i++) {
            fail = false;
            for (int j = 2; j < i; j++) {
                iterationsTotal++;
                if(i % j == 0){
                    fail = true;
                    break;
                }
            }
            if(!fail){
                count++;
                System.out.println(count+" -> " +i+" <- ");

            }
        }
        System.out.println("# primes = " + count);
        System.out.println("# of total iterations = " + iterationsTotal);
    }
}
