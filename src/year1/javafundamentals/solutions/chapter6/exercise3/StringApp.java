package year1.javafundamentals.solutions.chapter6.exercise3;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class StringApp {
    public static void main(String[] args) {
        String textLine = "This is liNe of text, for testing purPoses i'm aDding a few 'a' letters";
        System.out.println(textLine + ": " + textLine.length());
        System.out.println(textLine.toUpperCase());
        System.out.println(textLine.toLowerCase());
        System.out.println(textLine.replace('a','o'));

        int amountOfE = 0;
        for (char c : textLine.toCharArray()) {
            if(c == 'e'){
                amountOfE++;
            }
        }
        System.out.println("Amount of letter 'e': " + amountOfE);

        amountOfE = 0;
        for(int i = 0; i < textLine.length(); i++){
            if(textLine.charAt(i) == 'e'){
                amountOfE++;
            }
        }
        System.out.println("Amount of letter 'e': " + amountOfE);

        String firstString = "This is the first String";
        String secondString = "This is the second String";
        System.out.println("Are the Strings equal? " + firstString.equals(secondString));
        System.out.println(firstString.compareTo(secondString) < 0 ? firstString + " " + secondString : secondString + " " + firstString);

        String spaces = "        This string has a lot of spaces         ";
        System.out.println(spaces.trim());
    }
}
