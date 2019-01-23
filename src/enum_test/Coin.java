package enum_test;

public class Coin {
    int value;

    public static final Coin ONE_EURO = new Coin(100);
    public static final Coin TWO_EURO = new Coin(200);
    public static final Coin FIFTY_CENT = new Coin(50);

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
