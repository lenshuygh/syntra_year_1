package extraexercises.arrays.extra_05_12_18;

/*
Maak een methode welke de null waarden uit een array haalt.

hint: tel eerst hoeveel niet null waarden in de array zitten en maak een nieuwe array met die lengte
hint: steek alle niet null waarden in de nieuwe array en geef deze nieuwe array terug

 */
public class Oefening5 {
    public static void main(String[] args) {

        String[] sentence = {"this","is",null,null,"a",null,"sentence"};


        String[] newSentence = removeNulls(sentence);

        System.out.println();
        for (String word : newSentence) {
            System.out.print(word + ' ');
        }
    }

    public static String[] removeNulls(String[] sentence) {
        int newArrayLength = 0;
        for (String word : sentence) {
            if (word != null) {
                newArrayLength++;
            }
        }
        String[] newSentence = new String[newArrayLength];

        int newCounter = 0;
        for (String word : sentence) {
            if (word != null) {
                newSentence[newCounter++] = word;
            }
        }
        return newSentence;
    }

}
