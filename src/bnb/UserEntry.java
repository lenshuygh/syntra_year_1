package bnb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import static bnb.BnbCommands.*;

public class UserEntry {
    private static final String OVERVIEW_MAIN_CHOICES =
            "Please choose one of the following commands by typing the number in front of the action:%n" +
                    "1.  Check room availability for a given period.%n" +
                    "2.  Check reservations by client.%n" +
                    "3.  Book a reservation.%n" +
                    "4.  Change a reservation.%n" +
                    "5.  Print reservation data.%n" +
                    "0.  Quit Program.%n" +
                    "----------------------------------------------------------------------------------------%n";

    private static final String QUESTION_STARTING_DATE = "Please provide the starting date of the reservation (DD/MM/YYYY): ";
    private static final String QUESTION_ENTER_ACTION_NUMBER = "Enter the number of the action u want to perform: ";
    private static final String QUESTION_UNTIL_DATE = "Please provide the ending date of the reservation (DD/MM/YYYY): ";
    private static final String QUESTION_ROOM_TO_RESERVE = "Please enter the number of the room you want to reserve: ";
    private static final String QUESTION_PERSON_NAME_LAST = "Please enter person's last name: ";
    private static final String QUESTION_PERSON_NAME_FIRST = "Please enter person's first name: ";
    private static final String QUESTION_PERSON_BIRTHDAY = "Please enter person's birthday: ";

    private static final String ENTRY_ERR_NUMBER =
            "----------------------%n" +
                    "Please enter a number.%n" +
                    "----------------------%n";
    private static final String ENTRY_ERR_NUMBER_RANGE_0_5 =
            "----------------------------------%n" +
                    "Please enter a number from 0 to 5.%n" +
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

    private static final String QUESTION_PROPOSED_RESERVATION = "Is the proposed reservation ok (y/n)?: ";
    private static final String LINE_PROPOSED_RESERVATION = "Check the proposed reservation below%n";
    private static final String LINE_FEED = "%n";

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static LocalDate formattedDate;
    private static LocalDate fromDate;

    private static Predicate<LocalDate> checkIfDateInFuture = d -> d.isAfter(LocalDate.now());
    private static Predicate<LocalDate> checkIfDateIsAfter = d -> d.isAfter(fromDate);
    private static Predicate<LocalDate> checkIfOver18 = d -> ChronoUnit.YEARS.between(d,LocalDate.now()) >= 18;

    private static String getNextInput(String questionString) {
        Scanner scanner = new Scanner(System.in);
        display(questionString);
        return scanner.next();
    }

    public static BnbCommands getMenuEntry() {
        display(OVERVIEW_MAIN_CHOICES);
        int commandChoice = -1;
        boolean goodEntry = false;

        while (!goodEntry) {
            String stringInput = getNextInput(QUESTION_ENTER_ACTION_NUMBER);
            try {
                commandChoice = Integer.parseInt(stringInput);
            } catch (NumberFormatException e) {
                display(ENTRY_ERR_NUMBER);
                continue;
            }
            if (!checkInRange(commandChoice, 0, 5)) {
                display(ENTRY_ERR_NUMBER_RANGE_0_5);
                display(OVERVIEW_MAIN_CHOICES);
            } else {
                goodEntry = true;
            }
        }
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

    public static LocalDate getFromDate(){
        return getDateFromUser(QUESTION_STARTING_DATE,checkIfDateInFuture,ENTRY_ERR_DATE_IN_PAST);
    }

    public static LocalDate getUntilDate(LocalDate localDate){
        fromDate = localDate;
        return getDateFromUser(QUESTION_UNTIL_DATE, checkIfDateIsAfter,ENTRY_ERR_DATE_BEFORE_BOOKING_START);
    }

    public static LocalDate getBirthDay(){
        return getDateFromUser(QUESTION_PERSON_BIRTHDAY,checkIfOver18, ENTRY_ERR_AGE_NOT_18);
    }

    private static LocalDate getDateFromUser(String questionToUser,Predicate<LocalDate> dateCheck,String errorMassage){
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
            if(dateCheck.test(formattedDate)) {
                dateOk = true;
            }else{
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
        boolean roomNumberOk = false;
        int roomChoice = -1;
        while (!roomNumberOk) {
            display(rooms);
            String roomNumber = getNextInput(QUESTION_ROOM_TO_RESERVE);
            try {
                roomChoice = Integer.parseInt(roomNumber);
            } catch (NumberFormatException e) {
                display(ENTRY_ERR_NUMBER);
                continue;
            }
            if (checkInRange(roomChoice, 0, 5)) {
                roomNumberOk = true;
            } else {
                display(ENTRY_ERR_NUMBER_RANGE_0_5);
                display(LINE_FEED);
            }
        }
        return rooms.get(roomChoice);
    }

    private static void display(String s) {
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

            display(LINE_PROPOSED_RESERVATION);
            display(roomToBook.toString());
            display(LINE_FEED);
            display("Period: " +
                    fromDate.format(DATE_TIME_FORMATTER) +
                    " until " + untilDate.format(DATE_TIME_FORMATTER) +
                    " (" + daysInBetween + " days)");
            display(LINE_FEED);
            display("TOTAL COST: "+ calculatedCost(daysInBetween,roomToBook) + " Euro");
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
        LocalDate birtDay = getBirthDay();
        Person bookingPerson = personEntry();
        bookingPerson.setBirthDay(birtDay);
        return bookingPerson;
    }

    private static Person personEntry(){
        String lastName = getNextInput(QUESTION_PERSON_NAME_LAST);
        String firstName = getNextInput(QUESTION_PERSON_NAME_FIRST);
        return new Person(firstName,lastName);
    }

}
