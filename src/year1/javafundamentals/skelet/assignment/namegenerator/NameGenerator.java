package year1.javafundamentals.skelet.assignment.namegenerator;

import java.util.Formatter;
import java.util.Random;

public class NameGenerator {
    private static final String[] FIRST_NAME = {"Lutfu","El Mahdi","Ruben","Mitch","Lars","Orlando","Jonas","Juan","Jens","Lens","Laurens","Yasin","Michiel","Tom","Paul","Thomas","Romy"};
    private static final String[] LAST_NAME = {"Leenders","Alajdi El Idrissi","Volders","Christoffels","Aerssens", "Parren", "Huygh", "Turan", "Thomassen", "Munnix", "Da Lanca", "Gerarts", "Sillen", "Neven", "Fontaine", "Haeldermans", "Keskin"};
    private static final String[] TITLE= {"Writer Of Bugs", "Fixer", "Indian Tutorial Maker", "Google Fu Specialist", "Corrector Of Wrong People On The Internet", "Stack Overflow Browser", "Build Breaker Extraordinaire", "Java Guru", "Know It All", "Wannabee Know It All", "Talks To Much"};

    private static final Random rand = new Random();

    private NameGenerator(){}

    public static String generateName(){
        String firstName = FIRST_NAME[rand.nextInt(FIRST_NAME.length)];
        String lastName = LAST_NAME[rand.nextInt(LAST_NAME.length)];
        String title = TITLE[rand.nextInt(TITLE.length)];

        return new Formatter().format("%s %s the %s", firstName, lastName, title).toString();
    }
}
