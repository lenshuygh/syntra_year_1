package year1.javafundamentals.solutions.chapter7.exercise1;

/**
 * Created by JonathanSyntra on 28/11/2018.
 */
public class MultiplesOfSevenBis {
    public static void main(String[] args) {

        for(int i = 7, count = 0; count < 20; i +=7, count++){
            //System.out.println(i);
        }

        int[] multiplesOfSeven = new int[20];
        for(int i = 7, index = 0; index < 20; i +=7, index++){
            multiplesOfSeven[index] = i;
        }

        int[] multiplesOfSeven2 = new int[20];
        for (int i = 0; i < 20; i++) {
            multiplesOfSeven2[i] = (i+1)*7;
        }

        int[] multiplesOfSeven3 = new int[20];
        for (int i = 1; i <= 20; i++) {
            multiplesOfSeven3[i-1] = i*7;
        }

        for(int n: multiplesOfSeven){
            //System.out.println(n);
        }

        for(int i = multiplesOfSeven.length-1; i >= 0; i--){
            System.out.println(multiplesOfSeven[i]);
        }
    }
}
