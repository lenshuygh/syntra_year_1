package bnb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static bnb.BnbCommands.*;
import static java.util.stream.Collectors.toCollection;

public class UserEntry {
    private static final String OVERVIEW_MAIN_CHOICES =
            "-----------------------------------------------------%n" +
                    "0.  Quit Program.%n" +
                    "1.  Check room availability for a given period.%n" +
                    "2.  Check reservations by client.%n" +
                    "3.  Book a reservation.%n" +
                    "4.  Change a reservation.%n" +
                    "5.  Print reservation data.%n" +
                    "-----------------------------------------------------%n";
    private static final String OVERVIEW_ROOMS =
            "------------------------------------------------------------%n" +
                    "0.  Room: Big Room Of Fun (cap: 6, price: 350 Eur/night)%n" +
                    "1.  Room: OCMW (cap: 8, price: 120 Eur/night)%n" +
                    "2.  Room: Family Room (cap: 4, price: 250 Eur/night)%n" +
                    "3.  Room: The Dungeon (cap: 2, price: 220 Eur/night)%n" +
                    "4.  Room: The Honeymoon (cap: 2, price: 180 Eur/night)%n" +
                    "------------------------------------------------------------%n";
    private static final String OVERVIEW_RESERVATION_ENTRY =
            "    -------------------------------------------------------%n" +
                    "0.  Add attending person.%n" +
                    "1.  Add another room to your reservation.%n" +
                    "2.  Complete current reservation.%n" +
                    "3.  Cancel current reservation and return to the main menu.%n" +
                    "    -------------------------------------------------------%n";

    private static final String OVERVIEW_CHOOSE_RESERVATION_CHOICES =
            "    -------------------------%n" +
                    "0.  Choose a reservation.%n" +
                    "1.  Go back to the main menu.%n" +
                    "    -------------------------%n";


    private static final String QUESTION_ENTER_ACTION_NUMBER = "    Enter the number of the action u want to perform: ";
    private static final String QUESTION_STARTING_DATE = "    Please provide the starting date (DD/MM/YYYY): ";
    private static final String QUESTION_UNTIL_DATE = "    Please provide the ending date (DD/MM/YYYY): ";
    private static final String QUESTION_ROOM_TO_RESERVE = "    Please enter the number of the room you want to reserve: ";
    private static final String QUESTION_PERSON_NAME_LAST = "    Please enter person's last name: ";
    private static final String QUESTION_PERSON_NAME_FIRST = "    Please enter person's first name: ";
    private static final String QUESTION_PERSON_BIRTHDAY = "    Please enter the booking person's birthday (DD/MM/YYYY): ";
    private static final String QUESTION_PROPOSED_RESERVATION = "    Is the proposed reservation ok (y/n)?: ";
    private static final String QUESTION_ENTER_RESERVATION_NUMBER = "    Please enter the reservation to display's number: ";
    private static final String QUESTION_ENTER_NUMBER_OF_PERSONS = "    Please enter the number of persons that you want to book for (excluding the booking person): ";

    private static final String ENTRY_ERR_NUMBER =
            "----------------------%n" +
                    "Please enter a number.%n" +
                    "----------------------%n";
    private static String ENTRY_ERR_NUMBER_RANGE =
            "----------------------------------%n" +
                    "Please enter a number from %d to %d.%n" +
                    "----------------------------------%n";
    private static final String ENTRY_ERR_DATE_FORMAT =
            "------------------------------------------------%n" +
                    "Please format your date correctly eg: 06/12/2020%n" +
                    "------------------------------------------------%n";
    private static final String ENTRY_ERR_DATE_IN_PAST =
            "----------------------------------------------------------------------------%n" +
                    "Please enter a date in the future, you cannot make a reservation in the past%n" +
                    "----------------------------------------------------------------------------%n";
    private static final String ENTRY_ERR_DATE_BEFORE_BOOKING_START =
            "-----------------------------------------------------------------------------------%n" +
                    "Please enter a correct date that is later then the starting date of the reservation%n" +
                    "-----------------------------------------------------------------------------------%n";
    private static final String ENTRY_ERR_BOOLEAN =
            "---------------------------------------------------------------------%n" +
                    "Please enter the character 'y' for yes or 'n' for no (without quotes)%n" +
                    "---------------------------------------------------------------------%n";
    private static final String ENTRY_ERR_AGE_NOT_18 =
            "---------------------------------------------------------%n" +
                    "The booking's person has to be at least 18 years old.%n" +
                    "Please give the birthday of an adult person in the group.%n" +
                    "---------------------------------------------------------%n";

    private static final String LINE_PROPOSED_RESERVATION = "    Check the proposed reservation below%n" +
            "    ------------------------------------%n";

    private static final String LINE_PERSON_RESULTS =
            "Reservations for: '%s'%n" +
                    "---------------------------------------------%n";
    private static final String LINE_PERIOD_RESULTS =
            "Reservations between: %s and %s%n" +
                    "--------------------------------------------------%n";
    private static final String LINE_PERIOD_RESULTS_FREE_ROOMS =
            "Free rooms between: %s and %s%n" +
                    "--------------------------------------------------%n";


    private static final String LINE_ALL_RESERVATIONS_OVERVIEW =
            "Reservations overview:%n" +
                    "----------------------------------%n";

    private static final String LINE_CONFLICTING_RESERVATION =
            "Conflicting reservation found";

    private static final String LINE_CONFLICTING_RESERVATION_CANCELED =
            "Current reservation is canceled%n";

    private static final String LINE_FEED = "%n";

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static LocalDate formattedDate;
    private static LocalDate fromDate;
    private static LocalDate untilDate;
    private static Person searchedPerson;
    private static int chosenIndex = -1;
    private static Room room;

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
        //todo: make overview generated in stead of static
        int choice = getMenuChoice(OVERVIEW_ROOMS, QUESTION_ROOM_TO_RESERVE, 0, 4);
        return rooms.get(choice);
    }

    private static void display(String s) {
        System.out.printf(s);
    }

    private static void display(List<Room> rooms) {
        for (int i = 0; i < rooms.size(); i++) {
            display(i + ". " + rooms.get(i) + "%n");
        }
    }

    //todo: check if can be replaced by detail method from Reservation class
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
            display("    TOTAL COST: " + calculatedCost(daysInBetween, roomToBook) + " Euro%n");
            display("    --------------------------------------");
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
        bookingPerson.setBirthDay(birthDay);
        return bookingPerson;
    }
    // todo: notnull

    public static Person personEntry() {
        String lastName = getNextInput(QUESTION_PERSON_NAME_LAST);
        String firstName = getNextInput(QUESTION_PERSON_NAME_FIRST);
        return new Person(firstName, lastName);
    }

    public static void displayReservations(Person personToSearch, Map<String, Reservation> bnbReservationMap) {
        searchedPerson = personToSearch;
        display(String.format(LINE_PERSON_RESULTS, (searchedPerson.getLastName() + ", " + searchedPerson.getFirstName())));
        bnbReservationMap.values()
                .stream()
                .filter(r -> checkIfPersonInPersonsFromReservationPredicate.test(r))
                .forEach(Reservation::prettyOutput2);
    }

    public static void displayReservations(LocalDate fromCheckDate, LocalDate untilCheckDate, Map<String, Reservation> bnbReservationMap) {
        fromDate = fromCheckDate;
        untilDate = untilCheckDate;
        display((String.format(LINE_PERIOD_RESULTS, DATE_TIME_FORMATTER.format(fromCheckDate), DATE_TIME_FORMATTER.format(untilCheckDate))));
        bnbReservationMap.values()
                .stream()
                .filter(r -> checkReservationBeforeUntilDatePredicate.test(r))
                .filter(r -> checkReservationAfterFromDatePredicate.test(r))
                .forEach(Reservation::prettyOutput2);
    }

    public static void displayRoomAvailability(LocalDate fromCheckDate, LocalDate untilCheckDate, Map<String, Reservation> bnbReservationMap,List<Room> rooms) {
        fromDate = fromCheckDate;
        untilDate = untilCheckDate;
        display((String.format(LINE_PERIOD_RESULTS_FREE_ROOMS, DATE_TIME_FORMATTER.format(fromCheckDate), DATE_TIME_FORMATTER.format(untilCheckDate))));
        Set<Room> bookedRoomSet = new HashSet<>();
        bookedRoomSet = bnbReservationMap.values()
                .stream()
                .filter(r -> checkReservationBeforeUntilDatePredicate.test(r))
                .filter(r -> checkReservationAfterFromDatePredicate.test(r))
                .map(Reservation::getRooms)
                .flatMap(Set::stream)
                .collect(Collectors.toSet());
        rooms.removeAll(bookedRoomSet);
        rooms.forEach(System.out::println);
    }

    public static void displayReservations(Map<String, Reservation> bnbReservationMap) {
        display(LINE_ALL_RESERVATIONS_OVERVIEW);
        bnbReservationMap
                .values()
                .stream()
                .sorted(sortReservationsByIndexComparator)
                .forEach(Reservation::listSummaryOutput);
    }

    public static int getNumberOfPersons(){
        return getMenuChoice("",QUESTION_ENTER_NUMBER_OF_PERSONS,0,22);
    }

    public static int getAfterOverviewChoice() {
        return getMenuChoice(OVERVIEW_CHOOSE_RESERVATION_CHOICES, QUESTION_ENTER_ACTION_NUMBER, 0, 1);
    }

    public static int getReservationToDisplayNumber(Map<String, Reservation> bnbReservationMap) {
        int choice = getMenuChoice("", QUESTION_ENTER_RESERVATION_NUMBER, 0, bnbReservationMap.size());
        return choice;
    }

    public static void displaySingleReservationWithAllDetails(int reservationNumber, Map<String, Reservation> bnbReservationMap) {
        chosenIndex = reservationNumber;
        bnbReservationMap.values().stream().filter(checkReservationForIndexPredicate).forEach(Reservation::singleReservationAllDetails);
    }

    public static boolean checkAvailability(LocalDate fromDateToCheck, LocalDate untilDateToCheck, Room roomToBookToCheck, Map<String, Reservation> bnbReservationMap) {
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

    public static int continueReservation() {
        return getMenuChoice(OVERVIEW_RESERVATION_ENTRY, QUESTION_ENTER_ACTION_NUMBER, 0, 3);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
