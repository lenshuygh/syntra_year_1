package book_exercises.p346opdracht11;

import java.util.*;
import java.util.stream.Stream;

public class MapApp {
    public static void main(String[] args) {
        Map<Coin,Integer> portemonee = new HashMap<>();

        portemonee.put(Coin.FIFTY_CENT,4);
        portemonee.put(Coin.FIVE_CENT,5);
        portemonee.put(Coin.ONE_CENT,2);
        portemonee.put(Coin.TEN_CENT,4);
        portemonee.put(Coin.ONE_EURO,2);
        portemonee.put(Coin.TWENTY_CENT,1);
        portemonee.put(Coin.TWO_EURO,4);
        portemonee.put(Coin.TWO_CENT,4);

        System.out.println("contents wallet: ");
        portemonee.forEach((k,v) -> System.out.println(k + " -> #"+v));

        int sum = 0;
        for (Coin coin : portemonee.keySet()) {
            sum += coin.getValue() *portemonee.get(coin);
        }
        System.out.println("sum: " + sum + " cents.");

        System.out.println();
        System.out.println("sorted:");
        System.out.println("-------");
        portemonee.keySet().stream()
                .sorted()
                .forEach(c -> System.out.println(c + " : " + portemonee.get(c)));

        int summer = portemonee.entrySet().stream().mapToInt(value -> value.getKey().getValue() * value.getValue()).sum();
        System.out.println("summer: "+ summer);
    }
}
