package playground.codewars;

import java.nio.CharBuffer;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MostFrequentUsedWordInAText {
    private static Map<String,Integer> occurencesMap = new HashMap<>();
    private static List<Integer> sorter = new ArrayList<>();
    public static void main(String[] args) {
        //String s = "a a a  b  c c  d d d d  e e e e e";
        String s = "e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e";
        //String s = "  , e   .. ";
        //String s = "  //wont won't won't ";
        System.out.println(top3(s));
    }

    public static List<String> top3(String s) {
        s = s.replace("  "," ");
        char[] cArr = s.toLowerCase().toCharArray();


        IntStream stream = CharBuffer.wrap(cArr).chars();
        String string = stream
                .filter(c -> ((c >= 'a' && c <= 'z') || (c == '\'') || (c == ' ')))
                .collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString();
        System.out.println("=< " + s);
        System.out.println("=> " + string);

        //string = string.strip();

        Stream.of(string.split(" "))
                .forEach(st -> evaluate(st));

        occurencesMap.forEach((k,v)-> System.out.println(k +" - "+v));

        occurencesMap.values().forEach(sorter::add);
        sorter.sort(Comparator.reverseOrder());
        System.out.println("sorter size = " + sorter.size());
        List<String> outList = new ArrayList<>();
        for (int i = 0; i < 3 && i < sorter.size(); i++) {
            System.out.println("i -> " + i);

            String foundString = "";
            for (String s1 : occurencesMap.keySet()) {
                Integer searchedNumber = occurencesMap.get(s1);
                if(searchedNumber == sorter.get(i)){
                    foundString = s1;
                    System.out.println("foundString -> " + foundString);
                    break;
                }
            }
            outList.add(i,foundString);
        }
        //occurencesMap = new HashMap<>();
        occurencesMap.clear();
        return outList;
    }

    private static void evaluate(String st) {
        int count = 0;
        if(occurencesMap.containsKey(st)){
            count = occurencesMap.get(st) + 1;
            occurencesMap.put(st,count);
        }else{
            occurencesMap.put(st,1);
        }
    }
}

/*
 assertEquals(Arrays.asList("e", "d", "a"),    TopWords.top3("a a a  b  c c  d d d d  e e e e e"));
    assertEquals(Arrays.asList("e", "ddd", "aa"), TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
    assertEquals(Arrays.asList("won't", "wont"),  TopWords.top3("  //wont won't won't "));
    assertEquals(Arrays.asList("e"),              TopWords.top3("  , e   .. "));
    assertEquals(Arrays.asList(),                 TopWords.top3("  ...  "));
    assertEquals(Arrays.asList(),                 TopWords.top3("  '  "));
    assertEquals(Arrays.asList(),                 TopWords.top3("  '''  "));
    assertEquals(Arrays.asList("a", "of", "on"),  TopWords.top3(Stream
                    .of("In a village of La Mancha, the name of which I have no desire to call to",
                        "mind, there lived not long since one of those gentlemen that keep a lance",
                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                        "coursing. An olla of rather more beef than mutton, a salad on most",
                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                        "on Sundays, made away with three-quarters of his income.")
                     .collect(Collectors.joining("\n")) ));
 */
