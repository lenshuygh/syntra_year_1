package year1.javafoundations.solutions.chapter20.exercise2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by JonathanSyntra on 20/03/2017.
 */
public class LottoAppGenerated {
    public static void main(String[] args) {
        Collection<Integer> integerCollection = new HashSet<>();

        new Random().ints(1,45)
                .distinct()
                .limit(6)
                .forEach(integerCollection::add);

    }
}
