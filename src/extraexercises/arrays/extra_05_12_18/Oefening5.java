package extraexercises.arrays.extra_05_12_18;

import java.util.Scanner;

/*
Maak een methode welke de null waarden uit een array haalt.

hint: tel eerst hoeveel niet null waarden in de array zitten en maak een nieuwe array met die lengte
hint: steek alle niet null waarden in de nieuwe array en geef deze nieuwe array terug

 */
public class Oefening5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String[] sentence = scanner.nextLine().split(" ");


        String[] newSentence = removeNulls(sentence);

        System.out.println();
        for (String word : newSentence) {
            System.out.print(word + ' ');
        }

        scanner.close();
    }

    public static String[] removeNulls(String[] sentence) {
        int newArrayLength = 0;
        for (String word : sentence) {
            if (!word.equals("") && !word.equals("null")) {
                newArrayLength++;
            }
        }
        String[] newSentence = new String[newArrayLength];

        int newCounter = 0;
        for (String word : sentence) {
            if (!word.equals("") && !word.equals("null")) {
                newSentence[newCounter++] = word;
            }
        }
        return newSentence;
    }

}
