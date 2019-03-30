package bnb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static bnb.TextMessages.*;

public class ReservationUtils {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static Room room;
    private static LocalDate fromDateToCheck;
    private static LocalDate untilDateToCheck;
    private static Person searchedPerson;
    private static int chosenIndex;

    private static Predicate<Reservation> checkIfRoomInReservationMapPredicate = r -> r.getRooms().contains(room);

    private static Predicate<Reservation> checkIfAskedFromDateInsideBookedPeriodPredicate = r -> fromDateToCheck.isAfter(r.getBookedFrom()) && fromDateToCheck.isBefore(r.getBookedUntil());
    private static Predicate<Reservation> checkIfAskedUntilDateInsideBookedPeriodPredicate = r -> untilDateToCheck.isAfter(r.getBookedFrom()) && untilDateToCheck.isBefore(r.getBookedUntil());
    private static Predicate<Reservation> checkIfAskedDatesOverSpanBookedPeriodPredicate = r -> fromDateToCheck.isBefore(r.getBookedFrom()) && untilDateToCheck.isAfter(r.getBookedUntil());
    private static Predicate<Reservation> checkIfAskedFromDateIsSameAsAnyBookedPeriodDatePredicate = r -> fromDateToCheck.isEqual(r.getBookedFrom()) || untilDateToCheck.isEqual(r.getBookedUntil());
    private static Predicate<Reservation> checkIfAskedUntilDateIsSameAsAnyBookedPeriodDatePredicate = r -> fromDateToCheck.isEqual(r.getBookedUntil()) || untilDateToCheck.isEqual(r.getBookedFrom());

    private static Predicate<Reservation> checkReservationForIndexPredicate = r -> r.getIndex() == chosenIndex;

    private static Predicate<Reservation> checkAskedDatesAgainstReservedDates =
            checkIfAskedFromDateInsideBookedPeriodPredicate
                    .or(checkIfAskedUntilDateInsideBookedPeriodPredicate)
                    .or(checkIfAskedDatesOverSpanBookedPeriodPredicate)
                    .or(checkIfAskedFromDateIsSameAsAnyBookedPeriodDatePredicate)
                    .or(checkIfAskedUntilDateIsSameAsAnyBookedPeriodDatePredicate);

    private static Predicate<Reservation> checkReservationBeforeUntilDatePredicate = r -> r.getBookedUntil().isBefore(fromDateToCheck);
    private static Predicate<Reservation> checkReservationAfterFromDatePredicate = r -> r.getBookedUntil().isAfter(untilDateToCheck);
    private static Predicate<Reservation> checkIfPersonInPersonsFromReservationPredicate = r -> r.getPersons().contains(searchedPerson);

    private static Comparator<Reservation> sortReservationsByIndexComparator = Comparator.comparingInt(Reservation::getIndex);

    public static Set<Room> getRoomsBookedDuringPeriod(LocalDate fromCheckDate, LocalDate untilCheckDate, Map<String, Reservation> bnbReservationMap) {
        fromDateToCheck = fromCheckDate;
        untilDateToCheck = untilCheckDate;
        Set<Room> bookedRoomSet = new HashSet<>();
        if (bnbReservationMap.values().stream().findFirst().map(Reservation::getRooms).isPresent()) {
            bookedRoomSet = bnbReservationMap.values()
                    .stream()
                    .filter(checkAskedDatesAgainstReservedDates)
                    .map(Reservation::getRooms)
                    .flatMap(Set::stream)
                    .collect(Collectors.toSet());
        }
        return bookedRoomSet;
    }

    public static List<Room> getRoomAvailableDuringPeriod(LocalDate fromCheckDate, LocalDate untilCheckDate, Map<String, Reservation> bnbReservationMap, List<Room> rooms) {
        fromDateToCheck = fromCheckDate;
        untilDateToCheck = untilCheckDate;
        //UserInteraction.display((String.format(LINE_PERIOD_RESULTS_FREE_ROOMS, DATE_TIME_FORMATTER.format(fromCheckDate), DATE_TIME_FORMATTER.format(untilCheckDate))));
        if (bnbReservationMap.size() > 0) {
            Set<Room> roomsBookedDuringPeriod = getRoomsBookedDuringPeriod(fromCheckDate, untilCheckDate, bnbReservationMap);
            rooms.removeAll(roomsBookedDuringPeriod);
        }
        return rooms;
        //rooms.forEach(System.out::println);
    }

    public static List<Room> getRoomAvailableDuringPeriodAndCurrentReservation(LocalDate bookedFrom, LocalDate bookedUntil, Map<String, Reservation> bnbReservationMap,  List<Room> rooms,Reservation currentReservation) {
        List<Room> roomList = getRoomAvailableDuringPeriod(bookedFrom, bookedUntil, bnbReservationMap, rooms);
        if(Objects.nonNull(currentReservation.getRooms())){
            roomList.removeAll(currentReservation.getRooms());
        }
        return roomList;
    }

    public static void getReservations(Map<String, Reservation> bnbReservationMap) {
        UserInteraction.display(LINE_ALL_RESERVATIONS_OVERVIEW.toText());
        bnbReservationMap
                .values()
                .stream()
                .sorted(sortReservationsByIndexComparator)
                .forEach(Reservation::listSummaryOutput);
    }

    public static void getReservations(Person personToSearch, Map<String, Reservation> bnbReservationMap) {
        searchedPerson = personToSearch;
        bnbReservationMap.values()
                .stream()
                .filter(r -> checkIfPersonInPersonsFromReservationPredicate.test(r))
                .forEach(Reservation::prettyOutput2);
    }

    public static Set<Reservation> getReservationsDuringPeriod(LocalDate fromCheckDate, LocalDate untilCheckDate, Map<String, Reservation> bnbReservationMap) {
        fromDateToCheck = fromCheckDate;
        untilDateToCheck = untilCheckDate;
        return bnbReservationMap.values()
                .stream()
                .filter(checkAskedDatesAgainstReservedDates)
                .collect(Collectors.toSet());
    }


    public static boolean checkCapacity(int numberOfPersons, Reservation reservation, Map<String, Reservation> bnbReservationMap, List<Room> rooms) {
        List<Room> availableRooms = getRoomAvailableDuringPeriod(reservation.getBookedFrom(), reservation.getBookedUntil(), bnbReservationMap, rooms);
        int availableCapacity = availableRooms.stream().mapToInt(Room::getCapacity).sum();
        return (numberOfPersons <= availableCapacity);
    }

    public static boolean checkIfEnoughRoomsForPersons(Reservation reservation, int numberOfPersons) {
        int availableCapacity = 0;
        if (!Objects.isNull(reservation.getRooms())) {
            availableCapacity = reservation.getRooms().stream().mapToInt(Room::getCapacity).sum();
        }
        return availableCapacity >= numberOfPersons;
    }

    public static void deleteReservation(int reservationChosen, Map<String, Reservation> bnbReservationMap) {
        chosenIndex = reservationChosen;
        Optional<Reservation> reservationToDelete = bnbReservationMap.values().stream().filter(checkReservationForIndexPredicate).sorted().findFirst();
        if(reservationToDelete.isPresent()){
            Optional<String> key = bnbReservationMap.keySet().stream().filter(k -> bnbReservationMap.get(k).equals(reservationToDelete.get())).findFirst();
            boolean success = bnbReservationMap.remove(key.get(),reservationToDelete.get());
            if(success){
                UserInteraction.deletionSuccess();
            }
        }
    }

    public static Reservation getReservationByIndex(int reservationNumber, Map<String, Reservation> bnbReservationMap) {
        chosenIndex = reservationNumber;
        Optional<Reservation> reservationOptional = bnbReservationMap.values().stream().filter(checkReservationForIndexPredicate).findFirst();
        if(reservationOptional.isPresent()){
            return reservationOptional.get();
        }
        return null;
    }

    public static boolean changeFromDate(LocalDate newFromDate, int reservationChosen, Map<String, Reservation> bnbReservationMap) {
        getReservationByIndex(reservationChosen,bnbReservationMap).setBookedFrom(newFromDate);
        return true;
    }

    public static boolean changeUntilDate(LocalDate newToDate, int reservationChosen, Map<String, Reservation> bnbReservationMap) {
        getReservationByIndex(reservationChosen,bnbReservationMap).setBookedUntil(newToDate);
        return true;
    }
}
