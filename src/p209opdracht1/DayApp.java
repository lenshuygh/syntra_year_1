package p209opdracht1;

public class DayApp {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day);
            System.out.printf(" with ordinal: %d%n",day.ordinal());
        }
    }
}
