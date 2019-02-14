package playground.leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OccurenceSort {
    public static void main(String[] args) {
        System.out.println(frequencySort("caaabb"));
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
        for(char c : map.keySet()){
            System.out.println("char: " + c + " -> " + map.get(c));
            Integer i = map.get(c);
            Character character = c;
            System.out.println("i -> " + i);
            System.out.println("character -> " + character);
            mapSorted.put(i,character);

        }
        for(Integer i : mapSorted.keySet()){
            System.out.println(i + " <- " + map.get(i));
        }
        return "";
    }
}
