package playground.codewars.alphametics;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Alphametics {
    public Alphametics(String s){
        System.out.println(solve(s));
    }

    private String solve(String s) {
        Set<Character> digits = new HashSet<>();
        char[] charDigits = {'0','1','2','3','4','5','6','7','8','9'};
        for (char charDigit : charDigits) {
            digits.add(charDigit);
        }
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
        cypher = computeCypher(allCharSet,firstChars,digits);

        return "";
    }

    private Set<Character> computeCypher(Set<Character> allCharSet, Set<Character> firstChars,Set<Character> digits) {
        Random random = new Random();
        Set<Character> cypher = new HashSet<>();
        for (Character character : allCharSet) {
            Character digitCharacter = ((char) random.nextInt(10));
            if((!firstChars.contains(character)) && (digits.contains(digitCharacter))
        }

        return null;
    }

    private String[] handleWords(String[] words) {

        String[] out = new String[1];
        return out;
    }
}
