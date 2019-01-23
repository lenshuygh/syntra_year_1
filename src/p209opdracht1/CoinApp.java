package p209opdracht1;

import static p209opdracht1.Coin.*;

public class CoinApp {
    public static void main(String[] args) {
        Coin[] coins = {
                ONE_CENT,
                TWO_CENT,
                ONE_CENT,
                ONE_EURO,
                ONE_EURO,
                TWO_EURO,
                ONE_EURO,
                FIFTY_CENT,
                TWENTY_CENT,
                FIFTY_CENT,
                TWENTY_CENT,
                TWENTY_CENT,
                TWENTY_CENT
        };
        int totalValue = 0;
        for (Coin coin : coins) {
            totalValue += coin.getValue();
        }
        System.out.printf("Total value is %d",totalValue);
    }
}
