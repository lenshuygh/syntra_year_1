package playground.codewars;

import java.util.*;
import java.util.stream.Collectors;

public class NextBiggerNumber2 {

    public static void main(String[] args) {
        // r: expected:<1101087216> but was:<1101087126>
        // 1101087162

        //assertEquals(2071, Kata.nextBiggerNumber(2017));
        //long l = 1101087162l;
        long l = 144;
        List<String> list = getPermutations(String.valueOf(l).toCharArray());
        Set<Long> longSet = list.stream().map(Long::parseLong).collect(Collectors.toSet());
        //List<Long> longList = list.stream().map(Long::parseLong).collect(Collectors.toList());

        //Set<Long> sSet = new SortedSet<>();
        }


        /*java.util.Collections.sort(longSet);
        int index = longSet.indexOf(l);
        for (Long aLong : longList) {
            System.out.println(aLong);
        }
        System.out.println(longList.get(index+1));*/


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
