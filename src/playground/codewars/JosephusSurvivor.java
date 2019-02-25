package playground.codewars;

import java.util.*;

public class JosephusSurvivor {
    public static void main(String[] args) {
        System.out.println(josephusSurvivor(7, 3));
        //should give 4
        System.out.println(josephusSurvivor(11, 19));
        // 10
        System.out.println(josephusSurvivor(100, 1));
        //100
    }

    public static int josephusSurvivor(final int n, final int k) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        int j = 1;
        int removed = 0;
        while (removed < arr.length - 1) {
            for (int i = 0; i < arr.length; i++) {
                for (int i1 : arr) {
                    System.out.printf("%d",i1);
                }
                System.out.println();
                if (j % 3 == 0) {
                    arr[i] = 0;
                    removed++;
                    j = 0;
                } else {
                    if (arr[i] != 0) {
                        j++;
                    }
                }
            }
        }
        for (int i : arr) {
            if(i != 0){
                return i;
            }
        }
            return 0;
        }
    }

/*
In this kata you have to correctly return who is the "survivor", ie: the last element of a Josephus permutation.

Basically you have to assume that n people are put into a circle and that they are eliminated in steps of k elements, like this:

josephus_survivor(7,3) => means 7 people in a circle;
one every 3 is eliminated until one remains
[1,2,3,4,5,6,7] - initial sequence
[1,2,4,5,6,7] => 3 is counted out
[1,2,4,5,7] => 6 is counted out
[1,4,5,7] => 2 is counted out
[1,4,5] => 7 is counted out
[1,4] => 5 is counted out
[4] => 1 counted out, 4 is the last element - the survivor!
The above link about the "base" kata description will give you a more thorough insight about the origin of this kind of
 permutation, but basically that's all that there is to know to solve this kata.

Notes and tips: using the solution to the other kata to check your function may be helpful,
 but as much larger numbers will be used, using an array/list to compute the number of the survivor may be too slow;
  you may assume that both n and k will always be >=1.
 */
