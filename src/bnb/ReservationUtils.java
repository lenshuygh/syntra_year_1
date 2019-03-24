package bnb;

import java.time.LocalDate;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class ReservationUtils {
    private static Room room;
    private static LocalDate fromDateToCheck;
    private static LocalDate untilDateToCheck;

    private static Predicate<Reservation> checkIfRoomInReservationMapPredicate = r -> r.getRooms().contains(room);

    private static Predicate<Reservation> checkIfAskedFromDateInsideBookedPeriodPredicate = r -> fromDateToCheck.isAfter(r.getBookedFrom()) && fromDateToCheck.isBefore(r.getBookedUntil());
    private static Predicate<Reservation> checkIfAskedUntilDateInsideBookedPeriodPredicate = r -> untilDateToCheck.isAfter(r.getBookedFrom()) && untilDateToCheck.isBefore(r.getBookedUntil());
    private static Predicate<Reservation> checkIfAskedDatesOverSpanBookedPeriodPredicate = r -> fromDateToCheck.isBefore(r.getBookedFrom()) && untilDateToCheck.isAfter(r.getBookedUntil());
    private static Predicate<Reservation> checkIfAskedFromDateIsSameAsAnyBookedPeriodDatePredicate = r -> fromDateToCheck.isEqual(r.getBookedFrom()) || untilDateToCheck.isEqual(r.getBookedUntil());
    private static Predicate<Reservation> checkIfAskedUntilDateIsSameAsAnyBookedPeriodDatePredicate = r -> fromDateToCheck.isEqual(r.getBookedUntil()) || untilDateToCheck.isEqual(r.getBookedFrom());

    private static Predicate<Reservation> checkAskedDatesAgainstReservedDates =
            checkIfAskedFromDateInsideBookedPeriodPredicate
                    .or(checkIfAskedUntilDateInsideBookedPeriodPredicate)
                    .or(checkIfAskedDatesOverSpanBookedPeriodPredicate)
                    .or(checkIfAskedFromDateIsSameAsAnyBookedPeriodDatePredicate)
                    .or(checkIfAskedUntilDateIsSameAsAnyBookedPeriodDatePredicate);


    public static boolean checkAvailabilityRoomToPeriod(Room roomWanted, Reservation reservation, Map<String, Reservation> bnbReservationMap) {
        room = roomWanted;
        fromDateToCheck = reservation.getBookedFrom();
        untilDateToCheck = reservation.getBookedUntil();

        Optional<Reservation> reservationOptional = bnbReservationMap.values().stream()
                .filter(checkIfRoomInReservationMapPredicate)
                .filter(checkAskedDatesAgainstReservedDates)
                .findFirst();

        if (reservationOptional.isPresent()) {
            reservation = reservationOptional.get();
            TextOutput.conflictingReservation(reservation);
            return true;
        }
        return false;
    }
}
