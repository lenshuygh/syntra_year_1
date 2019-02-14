package playground.leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OccurenceSort {
    public static void main(String[] args) {
        System.out.println(frequencySort("caaabbdeeeeeff"));
    }

    public static String frequencySort(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        Map<Integer,Character> mapSorted = new TreeMap<>();
        for (char aChar : chars) {
            if(map.containsKey(aChar)){
                Integer c = map.get(aChar);
                c++;
                map.put(aChar,c);
            }else{
                map.put(aChar,1);
            }
        }
        System.out.println("----------------");
        map.forEach((K,V) -> System.out.println("k: " + K + " -> v: " + V));
        System.out.println("----------------");
/*
        for(char c : map.keySet()){
            Integer i = map.get(c);
            Character character = c;
            mapSorted.put(i,character);

        }
*/

        map.forEach((K,V) -> mapSorted.put(V,K));

        System.out.println("----------------");
        mapSorted.forEach((K,V) -> System.out.println("k: " + K + " -> v: " + V));
        System.out.println("----------------");

        return "";
    }
}
