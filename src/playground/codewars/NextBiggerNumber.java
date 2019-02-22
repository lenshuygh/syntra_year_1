package playground.codewars;

import java.util.*;

public class NextBiggerNumber {

    public static void main(String[] args) {


        //assertEquals(2071, Kata.nextBiggerNumber(2017));
        Long l = 2017l;
        List<String> list = getPermutations(String.valueOf(l).toCharArray());
        long[] longArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            longArr[i] = Long.parseLong(list.get(i));
        }
        int index = 0;
        for (int i = 0; i < longArr.length; i++) {
            if(longArr[i] == l){
                index = i+1;
            }
        }
        System.out.println(longArr[index]);
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
