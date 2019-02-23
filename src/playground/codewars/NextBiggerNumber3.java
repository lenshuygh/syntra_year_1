package playground.codewars;

import java.util.*;
import java.util.stream.Collectors;

public class NextBiggerNumber3 {

    public static void main(String[] args) {
        // r: expected:<1101087216> but was:<1101087126>
        // 1101087162

        //assertEquals(2071, Kata.nextBiggerNumber(2017));
        long l = 1101087162l;
        System.out.println(l);
        Map<Character,Integer> charMap = getCharSeq(l);
        for (Character character : charMap.keySet()) {
            System.out.println("character -> " + character + " - value -> " + charMap.get(character));
        }
        boolean nextMatchFound = false;

        long smallestNumber = 0;
        String s = ""+l;
        for (char c : s.toCharArray()) {
            if (smallestNumber < Long.parseLong(""+c)){
                smallestNumber = Long.parseLong(""+c);
            }
        }

        while(!nextMatchFound){
            l+=smallestNumber;
            System.out.println("checking... -> " + l);
            if(checkForChars(l,charMap)){
                System.out.println(l);
                break;
                //return l;
            }
        }
    }

    private static Map<Character, Integer> getCharSeq(long l) {
        Map<Character,Integer> charMap = new HashMap<>();
        String s = ""+l;
        for (char c : s.toCharArray()) {
            if(charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);
            }else{
                charMap.put(c,1);
            }
        }
        return charMap;
    }

    private static boolean checkForChars(long l,Map<Character,Integer> charMap){

        Map<Character,Integer> mapToCheck = getCharSeq(l);
        for (Character character : mapToCheck.keySet()) {
            //check if key exists
            if(charMap.containsKey(character)){
                if(charMap.get(character) != mapToCheck.get(character)){
                    return false;
                }
            }else{
                return false;
            }
            // check if key is the same
        }
        return true;
    }
}
