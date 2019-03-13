package playground.codewars;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Stream;

public class Alphametics {
    String input;
    Map<Character, Character> cypher = new HashMap<>();
    Random random = new Random();
    char[] chars = new char[10];
    char[] numberChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static void main(String[] args) {
        //new Alphametics("COUPLE + COUPLE = QUARTET");
        //new Alphametics("ELEVEN + NINE + FIVE + FIVE = THIRTY");
        new Alphametics("SEND + MORE = MONEY");
        //new Alphametics("50 + 50 + 50 = 150");

        //SEND + MORE = MONEY
        //expected:<[9567 + 1085 = 10652]> but was:<[5731 + 0647 = 06378]>
    }

    public Alphametics(String s) {
        input = s;
        System.out.println(s);
        System.out.println(solve());
    }

    public String solve() {
        LocalDateTime start = LocalDateTime.now();
        String output = "";
        boolean correct = false;
        while (!correct) {
            String[] words = Stream.of(input.split(" ")).filter(s -> !(s.equals("+"))).filter(s -> !(s.equals("="))).toArray(String[]::new);
            String[] firstLetters = Stream.of(words).map(String::new).map(s-> s.substring(0,1)).toArray(String[]::new);

            String all = Arrays.stream(words).reduce("", (acc, ch) -> acc + ch);
            List<Character> cList = new ArrayList<>();
            char[] singleChars = all.toCharArray();
            for (char singleChar : singleChars) {
                if (!cList.contains(singleChar)) {
                    cList.add(singleChar);
                }
            }
            char[] letters = new char[cList.size()];
            for (int i = 0; i < letters.length; i++) {
                letters[i] = cList.get(i);
            }
            createCypher(letters);
            words = reasembleWords(words);
            String[] adders = new String[words.length - 1];
            for (int i = 0; i < words.length - 1; i++) {
                adders[i] = words[i];
            }
            String result = words[words.length - 1];
            int sum = Arrays.stream(adders).mapToInt(Integer::new).sum();
            if (sum == Integer.parseInt(result)) {
                correct = true;
                for (int i = 0; i < adders.length; i++) {
                    output += adders[i] + " ";
                    if (i != adders.length - 1) {
                        output += "+ ";
                    }
                }
                output += "= " + result;
            }
            cypher.clear();
        }
        LocalDateTime end = LocalDateTime.now();
        System.out.println(Duration.between(start, end).toString());
        return output;
    }

    private void createCypher(char[] letters) {
        chars = numberChars;
        //for (char letter : letters) {
        for (int i = 0; i < letters.length; i++) {
            boolean addNew = true;
            do {
                addNew = true;
                int randIndex = random.nextInt(chars.length);
                char randChar = chars[randIndex];
                if((i == 0) && (randChar == 0)){
                    addNew = false;
                }else {
                    for (Character character : cypher.keySet()) {
                        if (cypher.get(character) == randChar) {
                            addNew = false;
                            break;
                        }
                    }
                }
                if (addNew) {
                    cypher.put(letters[i], randChar);
                    removeCharFromChars(randChar);
                }
            } while (!addNew);
        }
    }

    private void removeCharFromChars(char randChar) {
        char[] newCharArray = new char[chars.length - 1];
        int newCharArrayCounter = 0;
        for (char aChar : chars) {
            if (aChar != randChar) {
                newCharArray[newCharArrayCounter++] = aChar;
            }
        }
        chars = newCharArray;
    }

    private String[] reasembleWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            words[i] = reasembleWord(words[i]);
        }
        return words;
    }

    private String reasembleWord(String word) {
        String out = "";
        char[] wordChars = word.toCharArray();
        for (int i = 0; i < wordChars.length; i++) {
            Character c = cypher.get(wordChars[i]);
            String charAdd = Character.toString(c);
            out += charAdd;
        }
        return out;
    }
}

/*
Alphametics is a type of cryptarithm in which a set of words is written down in the form of a long addition sum or
some other mathematical problem. The objective is to replace the letters of the alphabet with decimal digits to
 make a valid arithmetic sum.

For this kata, your objective is to write a function that accepts an alphametic equation in the form of a single-line
string and returns a valid arithmetic equation in the form of a single-line string.

Test Examples
INPUT:    "SEND + MORE = MONEY"
SOLUTION: "9567 + 1085 = 10652"

INPUT:    "ELEVEN + NINE + FIVE + FIVE = THIRTY"
SOLUTION: "797275 + 5057 + 4027 + 4027 = 810386"
Some puzzles may have multiple valid solutions; your function only needs to return one

BIG + CAT = LION
403 + 679 = 1082
326 + 954 = 1280
304 + 758 = 1062
...etc.
Technical Details
All alphabetic letters in the input will be uppercase
Each unique letter may only be assigned to one unique digit
As a corollary to the above, there will be a maximum of `10` unique letters in any given test
The equations will only deal with addition with multiple summands on the left side and one term on the right side
The number of summands will range between `2` and `7`,inclusive
The length of each summand will range from `2` to `8` characters, inclusive
All test cases will be valid and will have one or more possible solutions
Full Test Suite: `15` fixed tests, `21` random tests for Python and Ruby / `18` random tests for JavaScript / `136`
random tests for Java
Optimize your code -- a naive, brute-force algorithm may time out before the first test completes
Use Python 3.6+ for the Python translation
If you enjoyed this kata, be sure to check out my other katas
 */
