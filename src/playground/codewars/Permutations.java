package playground.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String s ="abc";
        char[] arr = s.toCharArray();
        List<String> list = getPermutations(arr);
        for (String s1 : list) {
            System.out.println(s1);
        }
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

/*


In this kata you have to create all permutations of an input string and remove duplicates, if present. This means, you have to shuffle all letters from the input in all possible orders.

Examples:

Permutations.singlePermutations("a") `shouldBe` ["a"]
Permutations.singlePermutations("ab") `shouldBe` ["ab", "ba"]
Permutations.singlePermutations("aabb") `shouldBe` ["aabb","abab","abba","baab","baba","bbaa"]
a
a
b
b

The order of the permutations doesn't matter.

 */