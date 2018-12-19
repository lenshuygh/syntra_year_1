package year1.javafundamentals.solutions.chapter7.extra;

/**
 * Created by JonathanSyntra on 30/11/2018.
 */
public class Oefening2 {
    public static void main(String[] args) {
        int[] numbers1 = {5, 6, 8};
        int[] numbers2 = {9,12,20,5103,3513,513,1,3,81,7,33};
        int[] numbers3 = {9,12,20,8,9};
        for (int number : mergeArrays(numbers1, numbers2, numbers3)) {
            System.out.println(number);
        }
    }

    public static int[] mergeArrays(int[]... arrays){
        int totalLength = 0;
        for (int[] array : arrays) {
            totalLength += array.length;
        }
        int[] mergedArray = new int[totalLength];
        int currentIndex = 0;
        for (int[] array : arrays) {
            for (int number : array) {
                mergedArray[currentIndex++] = number;
            }
        }

        return mergedArray;
    }
}
