package year1.basicprogramming.solutions.chapter5.exercise18.extra;

import java.util.Random;

/**
 * Created by JonathanSyntra on 23/10/2018.
 */
public class Extra7_8 {
    public static void main(String[] args) {
        Random random = new Random();
        int amountOf1 = 0;
        int amountOf2 = 0;
        int amountOf3 = 0;
        int amountOf4 = 0;
        int amountOf5 = 0;
        int amountOf6 = 0;

        for (int i = 0; i < 1000000; i++) {
            int diceRoll = DiceUtility.rollDice(random);
            switch (diceRoll){
                case 1: amountOf1++;
                    break;
                case 2: amountOf2++;
                    break;
                case 3: amountOf3++;
                    break;
                case 4: amountOf4++;
                    break;
                case 5: amountOf5++;
                    break;
                case 6: amountOf6++;
                    break;
            }
        }

        float percentageCoefficient = 10_000;
        System.out.println("Number 1 was thrown: " + amountOf1/percentageCoefficient + "% of the times!");
        System.out.println("Number 2 was thrown: " + amountOf2/percentageCoefficient + "% of the times!");
        System.out.println("Number 3 was thrown: " + amountOf3/percentageCoefficient + "% of the times!");
        System.out.println("Number 4 was thrown: " + amountOf4/percentageCoefficient + "% of the times!");
        System.out.println("Number 5 was thrown: " + amountOf5/percentageCoefficient + "% of the times!");
        System.out.println("Number 6 was thrown: " + amountOf6/percentageCoefficient + "% of the times!");
    }

}