package playground.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NextBiggerNumber4 {

    public static void main(String[] args) {
        // r: expected:<1101087216> but was:<1101087126>
        // 1101087162

        //assertEquals(2071, Kata.nextBiggerNumber(2017));
        //long l = 1101087162l;
        long l = 9876543210L;
        System.out.println("input =>    " + l);
        //long l = 144;

        System.out.println("returned :  " + getNextNum(l));

        //List<String> list = getPermutations(String.valueOf(l).toCharArray());
    }

    private static long getNextNum(long lo) {
        boolean foundHigherLong = false;
        long divider = 100;
        while (!foundHigherLong) {
            divider *= 10;
            System.out.println("divider = " + divider);
            long firstPart = lo / divider;
            System.out.println("firstPart:  " + firstPart);
            long permutableLong = lo % divider;
            System.out.println("permutable: " + permutableLong);
            List<String> list = getPermutations(String.valueOf(permutableLong).toCharArray());
            Collections.sort(list);
            for (String s : list) {
                //System.out.println("-> " + s);
                if (permutableLong < Long.parseLong(s)) {
                    foundHigherLong = true;
                    return firstPart * divider + Long.parseLong(s);
                }
            }
            if (divider > lo) {
                foundHigherLong = true;
            } else {
                foundHigherLong = false;
            }
        }
        return -1;
    }


    public static char[] getRestArray(char[] arr, char element) {
        char[] out = new char[arr.length - 1];
        int count = 0;
        boolean match = false;
        for (char c : arr) {
            if (!match && (c == element)) {
                match = true;
            } else {
                out[count++] = c;
            }
        }
        return out;
    }

    public static List<String> getPermutations(char[] arr) {
        List<String> list = new ArrayList<>();
        if (arr.length == 0) {
            list.add("");
            return list;
        } else {
            for (int i = 0; i < arr.length; i++) {
                List<String> rest = getPermutations(getRestArray(arr, arr[i]));
                for (int i1 = 0; i1 < rest.size(); i1++) {
                    list.add(arr[i] + rest.get(i1));
                }
            }
            return list;
        }
    }
}
