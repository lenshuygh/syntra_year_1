package playground.codewars;

import java.util.ArrayList;
import java.util.List;

public class NextBiggerNumber {

    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(513));
        //531
    }

    public static long nextBiggerNumber(long n)
    {
        // list all permutations of the number
        // order them, find next element in line and return that
        /*
        531
        513
        315             3 digits -> 6 combinations
        351
        153
        135
         *//*
        12               2 digits -> 4 combinations
        21
         *//*
        1234
        1243
        1342             4 digits -> 24 combinations
        1324
        1423
        1432

        2341
        2314
        2413
        2431
        2143
        2134

        3412
        3421
        3142
        3124
        3241
        3214

        4123
        4132
        4231
        4213
        4321
        4312
        *//*
        array of digits and array of remaining digits

        method that takes a list/array and returns an array with the remaining digits while building the strings
         */
        String number = ""+n;
        ArrayList<String> stringList = new ArrayList<>();

        for (String performPermutation : performPermutations(number)) {
            System.out.println(performPermutation);
        }

        return -1;
    }

    public static char[] permuteAndReturnRemaining(List<String> stringList,char[] digitArray){
        return new char[0];
    }

    public static ArrayList<String> performPermutations(String s){
        ArrayList<String> arrayList = new ArrayList<String>();


        if (s.length() == 0) {
            arrayList.add("");
            return arrayList;
        }

        else {
            for (int i = 0; i < s.length(); i++) {
                ArrayList<String> remaining = performPermutations(s.substring(0, i) + s.substring(i + 1));
                for (int j = 0; j < remaining.size(); j++) {
                    arrayList.add(s.charAt(i) + remaining.get(j));
                }
            }
            return arrayList;
        }
    }
}
