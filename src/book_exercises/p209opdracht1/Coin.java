package book_exercises.p209opdracht1;

public enum Coin {
    ONE_CENT(1), TWO_CENT(2), FIVE_CENT(5), TWENTY_CENT(20), FIFTY_CENT(50), ONE_EURO(100), TWO_EURO(200);

    private int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
