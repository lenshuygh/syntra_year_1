package extraexercises.arrays.extra_05_12_18;


import java.util.Scanner;

/*
Maak een methode welke de null waarden uit een array haalt.
hint: tel eerst hoeveel niet null waarden in de array zitten en
 maak een nieuwe array met die lengte hint: steek alle niet null
  waarden in de nieuwe array en geef deze nieuwe array terug
 */
public class Oef5BIS {
    public static void main(String[] args) {


        String[] woorden = {"dit", "is", null, "een", "zin"};

        String[] oplossing = nietNullArray(woorden);

        for (String woord : oplossing) {
            System.out.println(woord);
        }


    }

    public static String[] nietNullArray(String[] origineleRij) {
        int teller = 0;
        for (String woord : origineleRij) {
            if (woord != null) {
                teller++;
            }
        }

        // maak een nieuwe array met die lengte
        String[] nieuweRij = new String[teller];
        int nieuweRijTeller = 0;
        for (String woord : origineleRij) {
            if (woord != null) {
                nieuweRij[nieuweRijTeller] = woord;
                nieuweRijTeller++;
            }
        }
        return nieuweRij;
    }
}
