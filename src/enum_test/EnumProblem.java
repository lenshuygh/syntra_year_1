package enum_test;

public class EnumProblem {


    public static void main(String[] args) {
        Coin one = Coin.ONE_EURO;
        System.out.println(one.getValue());

        Coin two = Coin.TWO_EURO;
        System.out.println(two.getValue());

        Coin half = Coin.FIFTY_CENT;
        System.out.println(half.getValue());

    }
}
