package playground.codewars;

import java.util.*;

public class NextBiggerNumber {

    public static void main(String[] args) {
        // r: expected:<1101087216> but was:<1101087126>
        // 1101087162

        //assertEquals(2071, Kata.nextBiggerNumber(2017));
        Long l = 1101087162l;
        List<String> list = getPermutations(String.valueOf(l).toCharArray());
        Set<Long> longSet = new TreeSet<>();
        for (String s : list) {
            longSet.add(Long.parseLong(s));
        }
        System.out.println(((TreeSet<Long>) longSet).higher(l));
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
