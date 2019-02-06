package year1.javafoundations.solutions.chapter11.exercise1;

/**
 * Created by JonathanSyntra on 22/01/2017.
 */
public class CoinApp {
    public static void main(String[] args) {
        Coin[] coins = {Coin.ONE_CENT, Coin.FIFTY_CENT, Coin.ONE_EURO};
        int total = 0;

        for (Coin coin : coins) {
            total += coin.getValue();
        }

        System.out.println("Total value = " + total);
    }
}
