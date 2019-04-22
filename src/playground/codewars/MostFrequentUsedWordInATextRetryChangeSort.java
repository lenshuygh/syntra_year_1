package playground.codewars;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MostFrequentUsedWordInATextRetryChangeSort {

    public static void main(String[] args) {
        //String s = "a a a  b  c c  d d d d  e e e e e";
        //String s = "e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e";
        //String s = "  , e   .. ";
        String s = "  //wont won't won't ";
        System.out.println(top3(s));
    }

    public static List<String> top3(String s) {
        s = s.toLowerCase();
        String lettersOnly = "";
        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c == ' ') || (c == '\'')){
                lettersOnly = lettersOnly.concat(Character.toString(c));
            }
        }

        lettersOnly = lettersOnly.replaceAll(" +"," ");
        lettersOnly = lettersOnly.trim();

        Map<String, Long> resultMap =
                Stream.of(lettersOnly.split(" ")).collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        resultMap.forEach((k,v) -> System.out.println('|'+k+'|' + " - " + v));

        long[] valuesArray = new long[resultMap.size()];

        int index = 0;
        for (Long value : resultMap.values()) {
            valuesArray[index++] = value;
        }

        boolean isSorted = false;
        long temp = 0;
        while(!isSorted){
            boolean changed= false;
            for (int i = 1; i < valuesArray.length; i++) {
                long valA = valuesArray[i-1];
                long valB = valuesArray[i];
                if(valA < valB){
                    temp = valA;
                    valuesArray[i-1] = valB;
                    valuesArray[i] = temp;
                    changed = true;
                }
            }
            if(!changed){
                isSorted = true;
            }
        }

        String[] outputArray;
        if(resultMap.size()>3){
            outputArray = new String[3];
        }else{
            outputArray = new String[resultMap.size()];
        }
        for (int i = 0; i < outputArray.length; i++) {
            long searchedKeyValue = valuesArray[i];
            for (String s1 : resultMap.keySet()) {
                if(resultMap.get(s1)==searchedKeyValue){
                    outputArray[i] = s1;
                    break;
                }
            }
        }

        System.out.println("out:");
        System.out.println("---");
        for (String s1 : outputArray) {
            System.out.println(s1);
        }
        List<String> out = new ArrayList<>();
        for (String s1 : outputArray) {
            out.add(s1);
        }
        /*
        ArrayList<Foo> list = new ArrayList<>(Arrays.asList(sos1.getValue());
         */
        //return new ArrayList<>(List.of(outputArray));

        //return Arrays.asList(outputArray);

        return new ArrayList<>(Arrays.asList(outputArray));
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
