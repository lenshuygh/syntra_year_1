package playground.codewars;

import java.util.*;
import java.util.stream.Stream;

public class Alphametics {
    String input;
    Map<Character, Character> cypher = new HashMap<>();
    Random random = new Random();
    char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static void main(String[] args) {
        new Alphametics("SEND + MORE = MONEY");
        //new Alphametics("50 + 50 + 50 = 150");
    }

    public Alphametics(String s) {
        input = s;
        solve();
    }

    public String solve() {
        String[] words = Stream.of(input.split(" ")).filter(s -> !(s.equals("+"))).filter(s -> !(s.equals("="))).toArray(String[]::new);



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






        boolean correct = false;
        while (!correct) {
            System.out.println("loop");

            createCypher(letters);

            printCypher();

            words = reasembleWords(words);

            String[] adders = new String[words.length - 1];
            for (int i = 0; i < words.length - 1; i++) {
                adders[i] = words[i];
            }
            String result = words[words.length - 1];

            int sum = Arrays.stream(adders).mapToInt(Integer::new).sum();
            if (sum == Integer.parseInt(result)) {
                correct = true;
                System.out.println("CORRECT");
            }
            cypher.clear();
        }

        return null;
    }

    private void printCypher() {
        System.out.println("##########startprint############");
        for (Character character : cypher.keySet()) {
            System.out.println(cypher.get(character));
        }
        System.out.println("##########endprint############");
    }

    private void createCypher(char[] letters) {
        for (char letter : letters) {
            boolean addNew = true;
            do {
                int randIndex = random.nextInt(10);
                char randChar = chars[randIndex];
                System.out.println("randchar => " + randChar);
                for (Character character : cypher.keySet()) {
                    if(cypher.get(character) == randChar){
                        addNew = false;
                    }
                }
                if (addNew) {
                    System.out.println("adding -> " + randChar + " <- ");
                    cypher.put(letter, randChar);
                }
                addNew = true;
            } while (!addNew);
        }
    }

    private String[] reasembleWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            words[i] = reasembleWord(words[i]);
        }
        return words;
    }

    private String reasembleWord(String word){
        printCypher();
        String out = "";
        char[] wordChars = word.toCharArray();
        for (int i = 0; i < wordChars.length; i++) {
            System.out.println("word - i - is " + i);
            String charAdd = Character.toString(cypher.get(wordChars[i]));
            System.out.println("charGotten is " + charAdd);
            out += charAdd;
        }
        System.out.println("WOOOOOOOOORd => " + out);
        return out;
    }

    public char[] removeCharFromArray(char c, char[] chars) {
        char[] newChars = new char[chars.length - 1];
        for (int i = 0; i < newChars.length; i++) {
            if (chars[i] != c) {
                newChars[i] = chars[i];
            }
        }
        return newChars;
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
