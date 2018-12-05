package extraexercises.project_eurler;

public class Problem02_EvenFibonacciNumbers {
    //By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

    public static void main(String[] args) {
        int sum = 2;
        int v1 = 1;
        int v2 = 2;
        int vPlus = 0;
        while(vPlus<4_000_000){
            vPlus = v1 + v2;
            if(vPlus % 2 == 0){
                sum += vPlus;
            }
            v1 = v2;
            v2 = vPlus;
        }
        System.out.println(sum);
    }
}
