package bnb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

import static bnb.BnbCommands.*;
import static bnb.TextOutput.*;

public class UserInteraction {


    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static LocalDate formattedDate;
    private static LocalDate fromDate;
    private static LocalDate untilDate;
    private static Person searchedPerson;
    private static int chosenIndex = -1;
    private static Room room;
    private static int grandTotal = 0;

    private static Predicate<LocalDate> checkIfDateInFuturePredicate = d -> d.isAfter(LocalDate.now());
    private static Predicate<LocalDate> checkIfDateIsAfterPredicate = d -> d.isAfter(fromDate);
    private static Predicate<LocalDate> checkIfDateIsBeforePredicate = d -> d.isBefore(untilDate);
    private static Predicate<LocalDate> checkIfOver18Predicate = d -> ChronoUnit.YEARS.between(d, LocalDate.now()) >= 18;

    private static Predicate<Reservation> checkIfPersonInPersonsFromReservationPredicate = r -> r.getPersons().contains(searchedPerson);
    private static Predicate<Reservation> checkReservationBeforeUntilDatePredicate = r -> r.getBookedUntil().isBefore(untilDate);
    private static Predicate<Reservation> checkReservationAfterFromDatePredicate = r -> r.getBookedUntil().isAfter(fromDate);
    private static Predicate<Reservation> checkReservationForIndexPredicate = r -> r.getIndex() == chosenIndex;
    private static Predicate<Reservation> checkIfRoomInReservationPredicate = r -> r.getRooms().contains(room);

    private static Comparator<Reservation> sortReservationsByIndexComparator = Comparator.comparingInt(Reservation::getIndex);

    private static Predicate<Reservation> checkIfReservationIsBetweenDatesPredicate(LocalDate from, LocalDate to, Function<Reservation, LocalDate> function) {
        Predicate<Reservation> isReservationIsFromAfterFromPredicate = reservation -> function.apply(reservation).isAfter(from);
        Predicate<Reservation> isReservationIsFromBeforeToPredicate = reservation -> function.apply(reservation).isBefore(to);
        return isReservationIsFromAfterFromPredicate.and(isReservationIsFromBeforeToPredicate);
    }

    private static String getNextInput(String questionString) {
        Scanner scanner = new Scanner(System.in);
        display(questionString);
        return scanner.next();
    }

    public static int getMenuChoice(String menuChoices, String entryQuestion, int lowestMenuChoice, int highestMenuChoice) {
        display(menuChoices);
        int choice = -1;
        boolean goodEntry = false;
        while (!goodEntry) {
            String in = getNextInput(entryQuestion);
            try {
                choice = Integer.parseInt(in);
            } catch (NumberFormatException e) {
                display(ENTRY_ERR_NUMBER);
                continue;
            }
            if (!checkInRange(choice, lowestMenuChoice, highestMenuChoice)) {
                display(String.format(ENTRY_ERR_NUMBER_RANGE, lowestMenuChoice, highestMenuChoice));
            } else {
                goodEntry = true;
            }
        }
        return choice;
    }

    public static BnbCommands getMenuEntry() {
        int commandChoice = getMenuChoice(OVERVIEW_MAIN_CHOICES, QUESTION_ENTER_ACTION_NUMBER, 0, 5);
        switch (commandChoice) {
            case 1:
                return CHECK_AVAILABILITY;
            case 2:
                return CHECK_BY_PERSON;
            case 3:
                return BOOK_RESERVATION;
            case 4:
                return CHANGE_RESERVATION;
            case 5:
                return DISPLAY_RESERVATION;
            default:
                return STOP_PROGRAM;
        }
    }

    public static LocalDate getFromDate() {
        return getDateFromUser(QUESTION_STARTING_DATE, checkIfDateInFuturePredicate, ENTRY_ERR_DATE_IN_PAST);
    }

    public static LocalDate getUntilDate(LocalDate localDate) {
        fromDate = localDate;
        return getDateFromUser(QUESTION_UNTIL_DATE, checkIfDateIsAfterPredicate, ENTRY_ERR_DATE_BEFORE_BOOKING_START);
    }

    public static LocalDate getBirthDay() {
        return getDateFromUser(QUESTION_PERSON_BIRTHDAY, checkIfOver18Predicate, ENTRY_ERR_AGE_NOT_18);
    }

    private static LocalDate getDateFromUser(String questionToUser, Predicate<LocalDate> dateCheck, String errorMassage) {
        boolean dateOk = false;

        while (!dateOk) {
            String date = getNextInput(questionToUser);
            try {
                formattedDate = LocalDate.parse(date, DATE_TIME_FORMATTER);
            } catch (DateTimeParseException e) {
                display(ENTRY_ERR_DATE_FORMAT);
                display(LINE_FEED);
                continue;
            }
            if (dateCheck.test(formattedDate)) {
                dateOk = true;
            } else {
                display(errorMassage);
                display(LINE_FEED);
            }
        }
        return formattedDate;
    }

    private static boolean checkInRange(int numberEntered, int lowLimit, int highLimit) {
        return (numberEntered >= lowLimit) && (numberEntered <= highLimit);
    }

    public static Room getRoomWanted(List<Room> rooms, LocalDate fromDate, LocalDate untilDate) {
        String roomOverView = TextOutput.createRoomOverview(rooms);
        //int choice = getMenuChoice(OVERVIEW_ROOMS, QUESTION_ROOM_TO_RESERVE, 0, 4);
        int choice = getMenuChoice(roomOverView,QUESTION_ROOM_TO_RESERVE,0,rooms.size()-1);
        return rooms.get(choice);
    }

    public static void display(String s) {
        System.out.printf(s);
    }

    private static void display(List<Room> rooms) {
        for (int i = 0; i < rooms.size(); i++) {
            display(i + ". " + rooms.get(i) + "%n");
        }
    }

    public static boolean proposeRegistration(LocalDate fromDate, LocalDate untilDate, Room roomToBook) {
        boolean acceptProposal = false;
        boolean acceptEntryOk = false;


        while (!acceptEntryOk) {
            long daysInBetween = getDaysInBetween(fromDate, untilDate);
            display(LINE_FEED);
            display(LINE_PROPOSED_RESERVATION);
            display(roomToBook.toString());
            display(LINE_FEED);
            display("    Period: " +
                    fromDate.format(DATE_TIME_FORMATTER) +
                    " until " + untilDate.format(DATE_TIME_FORMATTER) +
                    " (" + daysInBetween + " days)");
            display(LINE_FEED);
            display("    -----------------------------------------%n");
            display("    Current room cost          : " + calculatedCost(daysInBetween, roomToBook) + " Euro%n");
            display("    -----------------------------------------%n");
            grandTotal += calculatedCost(daysInBetween,roomToBook);
            display("    Grand Total over all rooms : " + grandTotal + " Euro%n");
            display("    -----------------------------------------%n");
            display(LINE_FEED);
            String entry = getNextInput(QUESTION_PROPOSED_RESERVATION);
            if (entry.equals("y") || entry.equals("n")) {
                acceptEntryOk = true;
                acceptProposal = entry.equals("y");
            } else {
                display(ENTRY_ERR_BOOLEAN);
                display(LINE_FEED);
            }
        }
        return acceptProposal;
    }


    private static long calculatedCost(long daysInBetween, Room roomToBook) {
        return roomToBook.getPricePerNight() * daysInBetween;
    }

    private static long getDaysInBetween(LocalDate fromDate, LocalDate untilDate) {
        return ChronoUnit.DAYS.between(fromDate, untilDate);
    }

    public static Person getBookingPerson() {
        LocalDate birthDay = getBirthDay();
        Person bookingPerson = personEntry();
        //bookingPerson.setBirthDay(birthDay);
        return bookingPerson;
    }
    // todo: notnull

    public static Person personEntry() {
        String lastName = getNextInput(QUESTION_PERSON_NAME_LAST);
        String firstName = getNextInput(QUESTION_PERSON_NAME_FIRST);
        return new Person(firstName, lastName);
    }

    public static int getNumberOfPersons(){
        return getMenuChoice("",QUESTION_ENTER_NUMBER_OF_PERSONS,0,22);
    }

    public static int getAfterOverviewChoice() {
        return getMenuChoice(OVERVIEW_CHOOSE_RESERVATION_CHOICES, QUESTION_ENTER_ACTION_NUMBER, 0, 2);
    }

    public static int getReservationToDisplayNumber(Map<String, Reservation> bnbReservationMap) {
        int choice = getMenuChoice("", QUESTION_ENTER_RESERVATION_NUMBER, 0, bnbReservationMap.size());
        return choice;
    }

    public static void displaySingleReservationWithAllDetails(int reservationNumber, Map<String, Reservation> bnbReservationMap) {
        chosenIndex = reservationNumber;
        bnbReservationMap.values().stream().filter(checkReservationForIndexPredicate).forEach(Reservation::singleReservationAllDetails);
    }

    public static void conflictingReservation(Reservation reservation) {
        display(LINE_CONFLICTING_RESERVATION);
        display(reservation.prettyOutput());
        //display(LINE_CONFLICTING_RESERVATION_CANCELED);
    }

    public static int continueReservation() {
        return getMenuChoice(OVERVIEW_RESERVATION_ENTRY, QUESTION_ENTER_ACTION_NUMBER, 0, 3);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int getAfterOverviewEditChoice() {
        return getMenuChoice(OVERVIEW_CHOOSE_EDIT_RESERVATION_CHOICES, QUESTION_ENTER_ACTION_NUMBER, 0, 1);
    }

    public static void conflictAskForOtherRoom() {
        display(LINE_PLEASE_CHOOSE_OTHER_ROOM);
    }

    public static void displayReservations(Person personToSearch, Map<String, Reservation> bnbReservationMap) {
        searchedPerson = personToSearch;
        display(String.format(LINE_PERSON_RESULTS, (searchedPerson.getLastName() + ", " + searchedPerson.getFirstName())));
        ReservationUtils.getReservations(personToSearch,bnbReservationMap);
    }

    public static void displayReservations(LocalDate fromCheckDate, LocalDate untilCheckDate, Map<String, Reservation> bnbReservationMap) {
        fromDate = fromCheckDate;
        untilDate = untilCheckDate;
        display((String.format(LINE_PERIOD_RESULTS, DATE_TIME_FORMATTER.format(fromCheckDate), DATE_TIME_FORMATTER.format(untilCheckDate))));
        ReservationUtils.getReservationsDuringPeriod(fromCheckDate,untilCheckDate,bnbReservationMap).forEach(Reservation::prettyOutput2);
    }

    public static void displayReservationsList(Map<String, Reservation> bnbReservationMap) {
        display(LINE_ALL_RESERVATIONS_OVERVIEW);
        bnbReservationMap
                .values()
                .stream()
                .sorted(sortReservationsByIndexComparator)
                .forEach(Reservation::listSummaryOutput);
    }

    public static void cancelReservationCapacity() {
        display(LINE_CAPACITY_NOT_AVAILABLE);
        display(LINE_CONFLICTING_RESERVATION_CANCELED);
    }

    public static void getRoomsAvailableDuringPeriod(LocalDate fromDate, LocalDate untilDate, Map<String, Reservation> bnbReservationMap, List<Room> rooms) {
        display(LINE_FEED);
        UserInteraction.display((String.format(LINE_PERIOD_RESULTS_FREE_ROOMS, DATE_TIME_FORMATTER.format(fromDate), DATE_TIME_FORMATTER.format(untilDate))));
        ReservationUtils.getRoomAvailableDuringPeriod(fromDate, untilDate, bnbReservationMap, rooms).forEach(s -> System.out.println(s.toOneLineFormattedString()));
        display(LINE_FEED);
    }

    public static void cancelWholeReservation(){
        display(LINE_CONFLICTING_RESERVATION_CANCELED);
    }

    public static int getChangeChoice() {
        return getMenuChoice(OVERVIEW_CHOOSE_PROPERTY_TO_EDIT_CHOICES,QUESTION_ENTER_ACTION_NUMBER,0,6);
    }

    public static int getReservationChoice(int max) {
        return getMenuChoice("",QUESTION_ENTER_RESERVATION_NUMBER_TO_CHANGE,0,max);
    }

    public static int getReservationChoiceDelete(int max) {
        return getMenuChoice("",QUESTION_ENTER_RESERVATION_NUMBER_TO_DELETE,0,max);
    }

    public static boolean okayToDelete() {
        boolean acceptDeletion = false;

        String entry = getNextInput(QUESTION_DELETE_PROPOSED_RESERVATION);
        if (entry.equals("y") || entry.equals("n")) {
            acceptDeletion = entry.equals("y");
        } else {
            display(ENTRY_ERR_BOOLEAN);
            display(LINE_FEED);
        }
        return acceptDeletion;
    }

    public static void deletionSuccess() {
        display(LINE_DELETION_SUCCESS);
    }
}
