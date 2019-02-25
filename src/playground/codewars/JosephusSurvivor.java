package playground.codewars;

import java.util.*;

public class JosephusSurvivor {
    public static void main(String[] args) {
        System.out.println(josephusSurvivor(7,3));
        //should give 4
        System.out.println(josephusSurvivor(11,19));
        // 10
        System.out.println(josephusSurvivor(100, 1));
        //100
        Deque<Integer> deque = new LinkedList<>();
        ((LinkedList<Integer>) deque).add(0,50);
        ((LinkedList<Integer>) deque).add(1,60);
        ((LinkedList<Integer>) deque).add(2,70);
        ((LinkedList<Integer>) deque).add(3,80);
        ((LinkedList<Integer>) deque).add(4,90);
        ((LinkedList<Integer>) deque).add(5,50);
        System.out.println(deque.toString());
        ((LinkedList<Integer>) deque).remove(2);
        System.out.println(deque.toString());
        for (int i = 50; i < 90; i+=10) {
            System.out.println(((LinkedList<Integer>) deque).indexOf(i));
        }
    }

    public static int josephusSurvivor(final int n, final int k) {
        for (int i = 1; i <= n; i++) {
            //System.out.println(i);
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
