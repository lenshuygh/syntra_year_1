package extraexercises.arrays.extra_05_12_18;

import static extraexercises.arrays.extra_05_12_18.Oefening4.removeDupes;
import static extraexercises.arrays.extra_05_12_18.Oefening5.removeNulls;

/*
Oefening 6
Combineer oefening 3 en 4 en maak een programma welke een zin vraagt aan de
gebruiker en hier uit alle dubbels haalt. Vorm hiermee een nieuwe zin welke afgedrukt wordt.
Gebruik volgende zin om dit te testen:
“This sentence sentence has a few sentence few has words words to much to”
 */
public class Oefening6 {
    public static void main(String[] args) {
        String[] str = "This sentence sentence has a few sentence few has words words to much to".split(" ");
        String[] s = removeDupes(str);
        String[] s2 = removeNulls(s);
        for (String s1 : s2) {
            System.out.print(s1+' ');
        }

    }
}
