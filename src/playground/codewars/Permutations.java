package playground.codewars;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        singlePermutations("ab");
    }

    public static List<String> singlePermutations(String s) {
        // Your code here!
        char[] arr = s.toCharArray();
        String[][] stringMap = new String[arr.length][arr.length];
        ArrayList<String> out = new ArrayList<>();
        int outCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                String str = "";
                if(i == 0){
                    out.add(outCount,""+arr[j]);
                }else{
                    str = out.get(outCount);
                    str = str.concat(""+arr[j]);
                    out.add(outCount,str);
                }
                outCount++;
            }
        }
        out.forEach(t -> System.out.println(s));

        return out;
    }
}
/*


In this kata you have to create all permutations of an input string and remove duplicates, if present. This means, you have to shuffle all letters from the input in all possible orders.

Examples:

Permutations.singlePermutations("a") `shouldBe` ["a"]
Permutations.singlePermutations("ab") `shouldBe` ["ab", "ba"]
Permutations.singlePermutations("aabb") `shouldBe` ["aabb","abab","abba","baab","baba","bbaa"]
The order of the permutations doesn't matter.

 */