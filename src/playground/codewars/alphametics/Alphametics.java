package playground.codewars.alphametics;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Alphametics {
    public Alphametics(String s){
        System.out.println(solve(s));
    }

    private String solve(String s) {
        Set<Integer> digits = new HashSet<>();
        IntStream.rangeClosed(0,9).forEach(d -> digits.add(d));
        System.out.println("digits:");
        String[] words = s.split(" ");
        words = Arrays.stream(words).filter(w -> !w.equals("=")).filter(w -> !w.equals("+")).distinct().toArray(String[]::new);

        Set<Character> firstChars = new HashSet<>();
        Arrays.stream(words)
                .map(w -> w.charAt(0))
                .forEach(firstChars::add);

        Set<Character> cypher = new HashSet<>();
        String oneString = Arrays.stream(words).distinct().reduce("",(a,o) -> a + o);
        char[] allChars = oneString.toCharArray();
        Set<Character> allCharSet =  new HashSet<>();
        for (char allChar : allChars) {
            allCharSet.add(allChar);
        }
        cypher = computeCypher(allCharSet,firstChars);

        return "";
    }

    private Set<Character> computeCypher(Set<Character> allCharSet, Set<Character> firstChars) {
        Random random = new Random();
        Set<Character> cypher = new HashSet<>();
        for (Character character : allCharSet) {
            Character digitCharacter = ((char) random.nextInt(10));
            //if((!firstChars.contains(character)) && (digi)
        }

        return null;
    }

    private String[] handleWords(String[] words) {

        String[] out = new String[1];
        return out;
    }
}
