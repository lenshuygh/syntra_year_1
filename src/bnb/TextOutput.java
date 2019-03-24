package bnb;

public class TextOutput {
    private static final String LINE_CONFLICTING_RESERVATION =
            "Conflicting reservation found";

    private static final String LINE_CONFLICTING_RESERVATION_CANCELED =
            "Current reservation is canceled%n";

    private static void display(String s) {
        System.out.printf(s);
    }

    public static void conflictingReservation(Reservation reservation) {
        display(LINE_CONFLICTING_RESERVATION);
        display(reservation.prettyOutput());
        //display(LINE_CONFLICTING_RESERVATION_CANCELED);
    }
}
