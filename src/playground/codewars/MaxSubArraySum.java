package playground.codewars;

import java.util.Set;
import java.util.TreeSet;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //int[] arr = new int[]{-2, -1, -3, 4, -1, -2, -1, -5, -4};
        int out = sequence(arr);
        System.out.println(out);
    }

    private static int sequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        boolean allNegative = true;
        for (int i : arr) {
            if (i > 0) {
                allNegative = false;
                break;
            }
        }
        if (allNegative) {
            return 0;
        }

        Set<Integer> set = new TreeSet<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                System.out.println(sum);
                set.add(sum);
            }
            sum = 0;
        }
        return ((TreeSet<Integer>) set).last();
    }


}

/*
The maximum sum subarray problem consists in finding the maximum sum of a contiguous
 subsequence in an array or list of integers:

Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
// should be 6: {4, -1, 2, 1}
Easy case is when the list is made up of only positive numbers and the maximum
 sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.

Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
 */
