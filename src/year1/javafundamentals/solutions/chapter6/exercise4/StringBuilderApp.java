package year1.javafundamentals.solutions.chapter6.exercise4;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("This is my first line of text");
        StringBuilder stringBuilder2 = new StringBuilder("This is my second line of text");

        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);

        System.out.println(stringBuilder1.append(" and this is what I added."));

        System.out.println(stringBuilder2.reverse());

        for (int i = 0; i < stringBuilder1.length(); i++) {
            if(stringBuilder1.charAt(i) == ' '){
                stringBuilder1.deleteCharAt(i--);
            }
        }
        System.out.println(stringBuilder1);
        for (int i = 0; i < stringBuilder2.length(); i++) {
            if(stringBuilder2.charAt(i) == 't'){
                stringBuilder2.insert(i++, 't');
            }
        }
        System.out.println(stringBuilder2);

    }
}
