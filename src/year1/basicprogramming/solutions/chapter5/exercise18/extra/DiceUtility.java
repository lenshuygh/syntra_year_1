package year1.basicprogramming.solutions.chapter5.exercise18.extra;

import java.util.Random;

/**
 * Created by JonathanSyntra on 24/10/2018.
 */
public class DiceUtility {
    public static int rollDice(Random random){
        return random.nextInt(6) + 1;
    }
}
