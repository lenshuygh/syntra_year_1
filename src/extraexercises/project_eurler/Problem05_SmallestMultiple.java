package extraexercises.project_eurler;

public class Problem05_SmallestMultiple {
    /*
        2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

        What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */

    public static void main(String[] args) {
        for (int i = 20;i<1_000_000_000;i++) {
            boolean divisionOk = false;
            for (int j = 1; j <= 20 ; j++) {
                divisionOk = i % j == 0;
                if(!divisionOk){
                    break;
                }
            }
            if(divisionOk){
                System.out.println(i);
                break;
            }

        }
    }
}
