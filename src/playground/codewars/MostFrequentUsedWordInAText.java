package playground.codewars;

import java.nio.CharBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MostFrequentUsedWordInAText {
    public static void main(String[] args) {
        String s = "e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e";
        System.out.println(top3(s));
    }
    public static List<String> top3(String s) {
        ///only A-Z ascii
        char[] cArr = s.toCharArray();

        IntStream stream = CharBuffer.wrap(cArr).chars();
        String string = stream
                .filter(c -> ((c >= 'a' && c <= 'z') || (c == '\'') || (c == ' ') || (c >= 'A' && c <= 'Z')))
                .collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString();
        System.out.println("=< " + s);
        System.out.println("=> " + string);


        /*Stream.of(s.split(" "))
                .map(t -> t.replace(",",""))
                .map(t -> t.replace(".",""))
                .forEach(System.out::println);*/
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
