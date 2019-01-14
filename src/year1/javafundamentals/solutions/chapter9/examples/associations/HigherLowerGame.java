package year1.javafundamentals.solutions.chapter9.examples.associations;

import java.util.Random;

/**
 * Created by JonathanSyntra on 6/01/2019.
 */
public class HigherLowerGame {
    private int value;
    private int max;
    private Random rand;

    public HigherLowerGame(int max) {
        this.max = max;
        this.rand = new Random();
        reset();
    }

    private void reset() {
        value = rand.nextInt(max + 1);
    }

    public int guess(int guessValue){
        if(guessValue < value){
            return -1;
        } else if(guessValue > value){
            return 1;
        } else {
            return 0;
        }
    }
}
