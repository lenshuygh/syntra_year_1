package year1.javafoundations.solutions.chapter20.exercise11;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by JonathanSyntra on 29/03/2017.
 */
public class CoinApp {
    public static void main(String[] args) {
        Map<Coin,Integer> wallet = new HashMap<>();

        wallet.put(Coin.ONE_CENT, 30);
        wallet.put(Coin.FIVE_CENT, 40);
        wallet.put(Coin.ONE_EURO, 21);
        wallet.put(Coin.TEN_CENT, 24);
        wallet.put(Coin.TWO_CENT, 12);
        wallet.put(Coin.TWO_EURO, 17);
        wallet.put(Coin.TWENTY_CENT, 15);
        wallet.put(Coin.FIFTY_CENT, 6);

        System.out.println("Printing contents");
        wallet.forEach((k,v) -> System.out.println(k + ": " + v));
        System.out.println();

        int total = 0;
        for (Coin coin : wallet.keySet()) {
            total += wallet.get(coin) * coin.getValue();
        }

        //wallet.entrySet().stream().mapToInt(value -> value.getKey().getValue() * value.getValue()).sum();

        System.out.println("Total: " + total);
        System.out.println();

        System.out.println("After sorting");
        wallet.keySet().stream()
                .sorted()
                .forEach(coin -> System.out.println(coin + ": " + wallet.get(coin)));
    }
}
