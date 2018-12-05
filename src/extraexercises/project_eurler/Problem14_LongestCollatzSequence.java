package extraexercises.project_eurler;

public class Problem14_LongestCollatzSequence {
    /*
        The following iterative sequence is defined for the set of positive integers:

        n → n/2 (n is even)
        n → 3n + 1 (n is odd)

        Using the rule above and starting with 13, we generate the following sequence:
        13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

        It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

        Which starting number, under one million, produces the longest chain?

        NOTE: Once the chain starts the terms are allowed to go above one million.
     */
    public static void main(String[] args) {
        long biggestSequenceStart = 0L;
        long biggestCounter = 0L;
        long counter = 1L;
        long newNumber = 0L;
        long startNumber = 0L;
        for (long i = 13; i < 1_000_000; i++) {
            newNumber = i;
            startNumber = i;
            while(newNumber  != 1){
                counter++;
                if(newNumber % 2 == 0){
                    newNumber = newNumber / 2;
                }else{
                    newNumber = newNumber * 3 + 1;
                }

            }
            if(counter > biggestCounter){
                biggestCounter = counter;
                biggestSequenceStart = startNumber;
            }
            counter = 1;
        }
        System.out.println(biggestSequenceStart);

    }
}
