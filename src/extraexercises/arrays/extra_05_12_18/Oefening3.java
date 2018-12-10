package extraexercises.arrays.extra_05_12_18;

import java.util.Scanner;

/*
Schrijf een klasse welke een zin aan de gebruiker vraagt.
Maak van deze zin een array van alle woorden welke in deze zin zitten.

Maak dan een methode welke kijkt of een array van Strings de waarde “test” bevat.
Dit moet hoofdletter ongevoelig zijn, wat betekent dat “Test”, “TEST”, enz. ook moet matchen.

Druk af of de gegeven zin het woord test in al zijn vormen bevat.
 */
public class Oefening3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = scanner.nextLine();

        boolean hasTestInIt = checkForTest(str);

        if(hasTestInIt){
            System.out.println("The word test is present!");
        }

        scanner.close();
    }

    private static boolean checkForTest(String str) {
        /*
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.equalsIgnoreCase("TEST")) {
                return true;
            }
        }
        return false;
        */
        str = str.toUpperCase();
        return str.contains("TEST");
    }
}
