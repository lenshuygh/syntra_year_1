package playground.codewars;

import java.nio.CharBuffer;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class MostFrequentUsedWordInATextRetry {
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
        s = s.toLowerCase();
        System.out.println(s);
        String lettersOnly = "";
        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c == ' ')){
                lettersOnly = lettersOnly.concat(Character.toString(c));
            }
        }


        Map<String, Long> result =
                Stream.of(lettersOnly.split(" ")).collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        result.forEach((k,v) -> System.out.println(k + " - " + v));

        Map<String,Long> sorted =
            result
                    .entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(Map.Entry::getKey,Map.Entry::getValue, (e1,e2) -> e2,LinkedHashMap::new));

        System.out.println("------------------------------------");
        sorted.forEach((k,v) -> System.out.println(k + " - " + v));

        System.out.println("------------------------------------");

        long[] outSize;
        if(sorted.size()>3){
            outSize = new long[3];
        }else{
            outSize = new long[sorted.size()];
        }


        System.out.println(lettersOnly);
        return null;
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
