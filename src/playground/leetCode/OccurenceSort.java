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

        int max = 0;
        for(Character c: map.keySet()){
            int v = map.get(c);
            System.out.println("v: " + v);
            if(max < v){
                max = v;
            }
        }

        System.out.println("highest occurence: " + max);
        int countDown = max;
        String out = "";
        for(Character c : map.keySet()){
            if(map.get(c) == max){
                out += c;
            }
            max--;
        }

        return out;
    }
}
