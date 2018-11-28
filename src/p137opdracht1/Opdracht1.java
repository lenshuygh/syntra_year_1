package p137opdracht1;

import java.util.Random;

public class Opdracht1 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = i * 7;
        }

        for (int i : arr) {
            System.out.println(i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        boolean[] booleanArray = new boolean[3];
        booleanArray[0] = true;
        booleanArray[1] = false;
        booleanArray[2] = false;

        for (boolean b : booleanArray) {
            System.out.println(b);
        }

        int[] primeArray = new int[168];
        int count = 0;
        boolean fail = false;
        for (int i = 2; i < 1000; i++) {
            fail = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    fail = true;
                    break;
                }
            }
            if (!fail) {
                primeArray[count] = i;
                count++;
                System.out.println("#" + count + " -> " + i);

            }
        }
        System.out.println("# primes = " + count);
        for (int i : primeArray) {
            System.out.print(i + ",");
        }

        int[] primeArray2 = new int[168];
        primeArray2[0] = 2;
        count = 0;
        fail = false;
        for (int i = 2; i < 1000; i++) {
            fail = false;
            for (int j : primeArray2) {
                if ((j != 0) && (i % j == 0)) {
                    fail = true;
                    break;
                }
            }
            if (!fail) {
                primeArray2[count] = i;
                count++;
                System.out.println("#" + count + " -> " + i);

            }
        }
        System.out.println("# primes = " + count);
        for (int i : primeArray2) {
            System.out.print(i + ",");
        }

        // bubblesort

        System.out.println();
        System.out.println("bubblesort");
        int[] toSort = new int[10];
        Random r = new Random();
        for (int i = 0; i < toSort.length; i++) {
            toSort[i] = r.nextInt(1000);
        }

        for (int i : toSort) {
            System.out.print(i + ",");
        }
        System.out.println();

        int temp = 0;
        boolean swapOccured = true;
        while (swapOccured) {
            swapOccured = false;
            for (int i = 1; i < toSort.length; i++) {
                if (toSort[i] < toSort[i - 1]) {
                    temp = toSort[i];
                    toSort[i] = toSort[i - 1];
                    toSort[i - 1] = temp;
                    swapOccured = true;
                }
            }
        }
        for (int i : toSort) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < toSort.length; i++) {
            toSort[i] = r.nextInt(1000);
        }
        for (int i : toSort) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (int i = 0; i < toSort.length; i++) {
            for (int j = i+1; j < toSort.length; j++) {
                if (toSort[j] < toSort[i]){
                    temp = toSort[i];
                    toSort[i] = toSort[j];
                    toSort[j] = temp;
                }
            }
        }
        for (int i : toSort) {
            System.out.print(i + ",");
        }
    }
}
