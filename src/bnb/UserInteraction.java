package bnb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Predicate;


import static bnb.BnbCommands.*;
import static bnb.TextMessages.*;
import static bnb.TextOutput.*;

public class UserInteraction {


    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static LocalDate formattedDate;
    private static LocalDate fromDate;
    private static LocalDate untilDate;
    private static LocalDate oldUntilDate;
    private static LocalDate oldFromDate;
    private static Person searchedPerson;
    private static int chosenIndex = -1;
    private static Room room;
    private static int grandTotal = 0;

    private static Predicate<LocalDate> checkIfDateInFuturePredicate = d -> d.isAfter(LocalDate.now());
    private static Predicate<LocalDate> checkIfDateIsAfterPredicate = d -> d.isAfter(fromDate);
    private static Predicate<LocalDate> checkIfOver18Predicate = d -> ChronoUnit.YEARS.between(d, LocalDate.now()) >= 18;
    private static Predicate<LocalDate> newDateFromCheck = d -> d.isAfter(LocalDate.now()) && d.isBefore(oldUntilDate);
    private static Predicate<LocalDate> newDateUntilCheck = d -> d.isAfter(LocalDate.now()) && d.isAfter(oldFromDate);

    private static Predicate<Reservation> checkReservationForIndexPredicate = r -> r.getIndex() == chosenIndex;

    private static Comparator<Reservation> sortReservationsByIndexComparator = Comparator.comparingInt(Reservation::getIndex);


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
                display(ENTRY_ERR_NUMBER.toText());
                continue;
            }
            if (!checkInRange(choice, lowestMenuChoice, highestMenuChoice)) {
                display(String.format(ENTRY_ERR_NUMBER_RANGE.toText(), lowestMenuChoice, highestMenuChoice));
            } else {
                goodEntry = true;
            }
        }
        return choice;
    }

    public static int getMenuChoice(String menuChoices, String entryQuestion, List<Integer> choicesList) {
        display(menuChoices);
        int choice = -1;
        boolean goodEntry = false;
        while (!goodEntry) {
            String in = getNextInput(entryQuestion);
            try {
                choice = Integer.parseInt(in);
            } catch (NumberFormatException e) {
                display(ENTRY_ERR_NUMBER.toText());
                continue;
            }
            if (!checkInRange(choice, choicesList)) {
                display(ENTRY_ERR_NUMBER_CHOICE.toText());
            } else {
                goodEntry = true;
            }
        }
        return choice;
    }

    public static BnbCommands getMenuEntry() {
        int commandChoice = getMenuChoice(OVERVIEW_MAIN_CHOICES.toText(), QUESTION_ENTER_ACTION_NUMBER.toText(), 0, 5);
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
        return getDateFromUser(QUESTION_STARTING_DATE.toText(), checkIfDateInFuturePredicate, ENTRY_ERR_DATE_IN_PAST.toText());
    }

    public static LocalDate getUntilDate(LocalDate localDate) {
        fromDate = localDate;
        return getDateFromUser(QUESTION_UNTIL_DATE.toText(), checkIfDateIsAfterPredicate, ENTRY_ERR_DATE_BEFORE_BOOKING_START.toText());
    }

    public static LocalDate getBirthDay() {
        return getDateFromUser(QUESTION_PERSON_BIRTHDAY.toText(), checkIfOver18Predicate, ENTRY_ERR_AGE_NOT_18.toText());
    }

    private static LocalDate getDateFromUser(String questionToUser, Predicate<LocalDate> dateCheck, String errorMassage) {
        boolean dateOk = false;

        while (!dateOk) {
            String date = getNextInput(questionToUser);
            try {
                formattedDate = LocalDate.parse(date, DATE_TIME_FORMATTER);
            } catch (DateTimeParseException e) {
                display(ENTRY_ERR_DATE_FORMAT.toText());
                display(LINE_FEED.toText());
                continue;
            }
            if (dateCheck.test(formattedDate)) {
                dateOk = true;
            } else {
                display(errorMassage);
                display(LINE_FEED.toText());
            }
        }
        return formattedDate;
    }

    private static boolean checkInRange(int numberEntered, int lowLimit, int highLimit) {
        return (numberEntered >= lowLimit) && (numberEntered <= highLimit);
    }

    private static boolean checkInRange(int choice, List<Integer> choicesList) {
        return choicesList.contains(choice);
    }

    public static Room getRoomWanted(List<Room> rooms, LocalDate fromDate, LocalDate untilDate) {
        String roomOverView = TextOutput.createRoomOverview(rooms);
        int choice = getMenuChoice(roomOverView, QUESTION_ROOM_TO_RESERVE.toText(), 0, rooms.size() - 1);
        return rooms.get(choice);
    }

    public static void display(String s) {
        System.out.printf(s);
    }

    public static boolean proposeRegistration(LocalDate fromDate, LocalDate untilDate, Room roomToBook) {
        boolean acceptProposal = false;
        boolean acceptEntryOk = false;


        while (!acceptEntryOk) {
            long daysInBetween = getDaysInBetween(fromDate, untilDate);
            display(LINE_FEED.toText());
            display(LINE_PROPOSED_RESERVATION.toText());
            display(roomToBook.toString());
            display(LINE_FEED.toText());
            display("    Period: " +
                    fromDate.format(DATE_TIME_FORMATTER) +
                    " until " + untilDate.format(DATE_TIME_FORMATTER) +
                    " (" + daysInBetween + " days)");
            display(LINE_FEED.toText());
            display("    -----------------------------------------%n");
            display("    Current room cost          : " + calculatedCost(daysInBetween, roomToBook) + " Euro%n");
            display("    -----------------------------------------%n");
            grandTotal += calculatedCost(daysInBetween, roomToBook);
            display("    Grand Total over all rooms : " + grandTotal + " Euro%n");
            display("    -----------------------------------------%n");
            display(LINE_FEED.toText());
            String entry = getNextInput(QUESTION_PROPOSED_RESERVATION.toText());
            if (entry.equals("y") || entry.equals("n")) {
                acceptEntryOk = true;
                acceptProposal = entry.equals("y");
            } else {
                display(ENTRY_ERR_BOOLEAN.toText());
                display(LINE_FEED.toText());
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
        return bookingPerson;
    }

    public static Person personEntry() {
        display(LINE_ENTER_PERSON.toText());
        String lastName = getNextInput(QUESTION_PERSON_NAME_LAST.toText());
        String firstName = getNextInput(QUESTION_PERSON_NAME_FIRST.toText());
        return new Person(firstName, lastName);
    }

    public static int getNumberOfPersons() {
        return getMenuChoice("", QUESTION_ENTER_NUMBER_OF_PERSONS.toText(), 0, 22);
    }

    public static int getAfterOverviewChoice() {
        return getMenuChoice(OVERVIEW_CHOOSE_RESERVATION_CHOICES.toText(), QUESTION_ENTER_ACTION_NUMBER.toText(), 0, 2);
    }

    public static int getReservationChoice(Map<String, Reservation> bnbReservationMap) {
        return getMenuChoice("", QUESTION_ENTER_RESERVATION_NUMBER_TO_CHANGE.toText(), ReservationUtils.getAvailableIndexChoices(bnbReservationMap));
    }

    public static int getReservationToDisplayNumber(Map<String, Reservation> bnbReservationMap) {
        return getMenuChoice("", QUESTION_ENTER_RESERVATION_NUMBER.toText(), ReservationUtils.getAvailableIndexChoices(bnbReservationMap));
    }

    public static void displaySingleReservationWithAllDetails(int reservationNumber, Map<String, Reservation> bnbReservationMap) {
        chosenIndex = reservationNumber;
        bnbReservationMap.values().stream().filter(checkReservationForIndexPredicate).forEach(Reservation::singleReservationAllDetails);
    }

    public static void displayReservations(Person personToSearch, Map<String, Reservation> bnbReservationMap) {
        searchedPerson = personToSearch;
        display(String.format(LINE_PERSON_RESULTS.toText(), (searchedPerson.getLastName() + ", " + searchedPerson.getFirstName())));
        ReservationUtils.getReservations(personToSearch, bnbReservationMap);
    }

    public static void displayReservations(LocalDate fromCheckDate, LocalDate untilCheckDate, Map<String, Reservation> bnbReservationMap) {
        fromDate = fromCheckDate;
        untilDate = untilCheckDate;
        display((String.format(LINE_PERIOD_RESULTS.toText(), DATE_TIME_FORMATTER.format(fromCheckDate), DATE_TIME_FORMATTER.format(untilCheckDate))));
        ReservationUtils.getReservationsDuringPeriod(fromCheckDate, untilCheckDate, bnbReservationMap).forEach(Reservation::prettyOutput);
    }

    public static void displayReservationsList(Map<String, Reservation> bnbReservationMap) {
        display(LINE_ALL_RESERVATIONS_OVERVIEW.toText());
        bnbReservationMap
                .values()
                .stream()
                .sorted(sortReservationsByIndexComparator)
                .forEach(Reservation::listSummaryOutput);
    }

    public static void cancelReservationCapacity() {
        display(LINE_CAPACITY_NOT_AVAILABLE.toText());
        display(LINE_CONFLICTING_RESERVATION_CANCELED.toText());
    }

    public static void getRoomsAvailableDuringPeriod(LocalDate fromDate, LocalDate untilDate, Map<String, Reservation> bnbReservationMap, List<Room> rooms) {
        display(LINE_FEED.toText());
        UserInteraction.display((String.format(LINE_PERIOD_RESULTS_FREE_ROOMS.toText(), DATE_TIME_FORMATTER.format(fromDate), DATE_TIME_FORMATTER.format(untilDate))));
        ReservationUtils.getRoomAvailableDuringPeriod(fromDate, untilDate, bnbReservationMap, rooms).forEach(s -> System.out.println(s.toOneLineFormattedString()));
        display(LINE_FEED.toText());
    }

    public static void cancelWholeReservation() {
        display(LINE_CONFLICTING_RESERVATION_CANCELED.toText());
    }

    public static int getChangeChoice() {
        return getMenuChoice(OVERVIEW_CHOOSE_PROPERTY_TO_EDIT_CHOICES.toText(), QUESTION_ENTER_ACTION_NUMBER.toText(), 0, 5);
    }

    public static boolean okayToDelete() {
        boolean acceptDeletion = false;

        String entry = getNextInput(QUESTION_DELETE_PROPOSED_RESERVATION.toText());
        if (entry.equals("y") || entry.equals("n")) {
            acceptDeletion = entry.equals("y");
        } else {
            display(ENTRY_ERR_BOOLEAN.toText());
            display(LINE_FEED.toText());
        }
        return acceptDeletion;
    }

    public static void deletionSuccess() {
        display(LINE_DELETION_SUCCESS.toText());
    }

    public static void displayStartDateToChange(int reservationNumber, Map<String, Reservation> bnbReservationMap) {
        chosenIndex = reservationNumber;
        bnbReservationMap.values().stream().filter(checkReservationForIndexPredicate).forEach(Reservation::singleReservationStartDate);
    }

    public static LocalDate getChangedFromDate(int reservationNumber, Map<String, Reservation> bnbReservationMap) {
        Reservation currentReservation = ReservationUtils.getReservationByIndex(reservationNumber, bnbReservationMap);
        oldUntilDate = currentReservation.getBookedUntil();
        display(LINE_FEED.toText());
        return getDateFromUser(QUESTION_CHANGED_STARTING_DATE.toText(), newDateFromCheck, ENTRY_ERR_DATE_BEFORE_OLD_BOOKING_END.toText());
    }

    public static void changedSuccess(boolean changed) {
        if (changed) {
            display(LINE_CHANGE_SUCCES.toText());
        } else {
            display(LINE_CHANGE_NO_SUCCESS.toText());
        }
    }

    public static void displayEndDateToChange(int reservationChosen, Map<String, Reservation> bnbReservationMap) {
        chosenIndex = reservationChosen;
        bnbReservationMap.values().stream().filter(checkReservationForIndexPredicate).forEach(Reservation::singleReservationEndDate);
    }

    public static LocalDate getChangedUntilDate(int reservationChosen, Map<String, Reservation> bnbReservationMap) {
        Reservation currentReservation = ReservationUtils.getReservationByIndex(reservationChosen, bnbReservationMap);
        oldFromDate = currentReservation.getBookedFrom();
        display(LINE_FEED.toText());
        return getDateFromUser(QUESTION_CHANGED_ENDING_DATE.toText(), newDateUntilCheck, ENTRY_ERR_DATE_AFTER_OLD_BOOKING_START.toText());
    }

    public static void changePerson(int reservationChosen, Map<String, Reservation> bnbReservationMap) {
        int personChosen = 0;
        Reservation currentReservation = ReservationUtils.getReservationByIndex(reservationChosen, bnbReservationMap);
        List<Person> personListToChange = new ArrayList<>(currentReservation.getPersons());
        int choice = getMenuChoice(CHOICE_CHOOSE_PERSON_CHANGE.toText(), QUESTION_TYPE_PERSON_CHANGE.toText(), 0, 3);
        switch (choice) {
            case 1:
                //"1.  Add a person to the reservation.%n" +
                int neededCapacity = currentReservation.getPersons().size();
                int reservedCapacity = currentReservation.getRooms().stream().mapToInt(Room::getCapacity).sum();

                if (neededCapacity + 1 <= reservedCapacity) {
                    display(LINE_ADD_PERSON_TO_RESERVATION.toText());
                    Person person = personEntry();
                    currentReservation.addPerson(person);
                    changedSuccess(true);
                } else {
                    display(ERR_PERSON_ADD_NOT_ENOUCH_CAPACITY.toText());
                }
                break;
            case 2:
                //"2.  Remove a person from the reservation%n" +
                display(LINE_REMOVE_PERSON_FROM_RESERVATION.toText());
                personChosen = getMenuChoice(createPeopleOverview(personListToChange), QUESTION_PERSON_TO_REMOVE.toText(), 0, personListToChange.size() - 1);
                currentReservation.removePerson(personListToChange.get(personChosen));
                changedSuccess(true);
                break;
            case 3:
                //"3.  Change name of a person from the reservation%n" +
                personChosen = getMenuChoice(createPeopleOverview(personListToChange), QUESTION_PERSON_TO_CHANGE.toText(), 0, personListToChange.size() - 1);
                Person personToChange = personListToChange.get(personChosen);
                Person newPerson = personEntry();
                personToChange.setLastName(newPerson.getLastName());
                personToChange.setFirstName(newPerson.getFirstName());
                changedSuccess(true);
                break;
            default:
                //"0.  Go back to the main menu.%n" +
                break;
        }
    }


    public static void changeRooms(int reservationChosen, Map<String, Reservation> bnbReservationMap, List<Room> rooms) {
        Reservation currentReservation = ReservationUtils.getReservationByIndex(reservationChosen, bnbReservationMap);
        int choice = getMenuChoice(CHOICE_CHOOSE_ROOM_CHANGE.toText(), QUESTION_TYPE_ROOM_CHANGE.toText(), 0, 2);
        switch (choice) {
            case 1:
                //"1.  Add a room to the reservation.%n" +
                List<Room> availableRooms = ReservationUtils.getRoomAvailableDuringPeriodAndCurrentReservation(currentReservation.getBookedFrom(), currentReservation.getBookedUntil(), bnbReservationMap, rooms, currentReservation);
                display(LINE_AVAILABLE_ROOMS.toText());
                int roomToAddIndex = getMenuChoice(createRoomOverview(availableRooms), QUESTION_CHANGE_RESERVATION_ADD_ROOM.toText(), 0, availableRooms.size() - 1);
                currentReservation.addRoom(availableRooms.get(roomToAddIndex));
                changedSuccess(true);
                break;
            case 2:
                //"2.  Remove a room from the reservation%n" +
                List<Room> bookedRooms = new LinkedList<>(currentReservation.getRooms());
                int neededCapacity = currentReservation.getPersons().size();
                int reservedCapacity = currentReservation.getRooms().stream().mapToInt(Room::getCapacity).sum();

                int roomToDeleteIndex = getMenuChoice(createRoomOverview(bookedRooms), QUESTION_ROOM_TO_REMOVE.toText(), 0, bookedRooms.size() - 1);
                reservedCapacity -= bookedRooms.get(roomToDeleteIndex).getCapacity();
                if (neededCapacity <= reservedCapacity) {
                    currentReservation.removeRoom(bookedRooms.get(roomToDeleteIndex));
                    changedSuccess(true);
                } else {
                    display(ERR_ROOM_REMOVE_NOT_ENOUCH_CAPACITY.toText());
                }
                break;
            default:
        }
    }

    public static void resetGrandTotal() {
        grandTotal = 0;
    }
}
