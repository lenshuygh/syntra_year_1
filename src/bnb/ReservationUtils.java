package bnb;

import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class ReservationUtils {
    private static Predicate<Reservation> checkIfRoomInReservationPredicate = r -> r.getRooms().contains(room);

    public static boolean checkAvailability(Reservation reservation, Map<String,Reservation> bnbReservationMap){
        room = roomToBookToCheck;

        Optional<Reservation> reservationOptional = bnbReservationMap.values().stream()
                .filter(checkIfRoomInReservationPredicate)
                .filter(r -> (
                        (fromDateToCheck.isAfter(r.getBookedFrom()) && fromDateToCheck.isBefore(r.getBookedUntil())) ||
                                (untilDateToCheck.isAfter(r.getBookedFrom()) && untilDateToCheck.isBefore(r.getBookedUntil())) ||
                                (fromDateToCheck.isBefore(r.getBookedFrom()) && untilDateToCheck.isAfter(r.getBookedUntil())) ||
                                (fromDateToCheck.isEqual(r.getBookedFrom()) || untilDateToCheck.isEqual(r.getBookedUntil())) ||
                                (fromDateToCheck.isEqual(r.getBookedUntil()) || untilDateToCheck.isEqual(r.getBookedFrom()))
                )).findFirst();
        if (reservationOptional.isPresent()) {
            display(LINE_CONFLICTING_RESERVATION);
            Reservation reservation = reservationOptional.get();
            display(reservation.prettyOutput());
            display(LINE_CONFLICTING_RESERVATION_CANCELED);
            return true;
        }
        return false;
    }
}
