package bnb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

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
    private static final String ENTRY_ERR_DATE_NOT_18 =
            "-------------------------------------------------------%n" +
            "The booking's person's has to be at least 18 years old.%n" +
            "-------------------------------------------------------%n";

    private static final String QUESTION_PROPOSED_RESERVATION = "Is the proposed reservation ok (y/n)?: ";
    private static final String LINE_PROPOSED_RESERVATION = "Check the proposed reservation below%n";
    private static final String LINE_FEED = "%n";

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static LocalDate formattedDate;

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

    /*public static LocalDate getFromDate() {
        boolean dateOk = false;

        while (!dateOk) {
            String date = getNextInput(QUESTION_STARTING_DATE);
            try {
                formattedDate = LocalDate.parse(date, DATE_TIME_FORMATTER);
            } catch (DateTimeParseException e) {
                display(ENTRY_ERR_DATE_FORMAT);
                display(LINE_FEED);
                continue;
            }
            if (checkDateBetween(formattedDate, LocalDate.now())) {
                dateOk = true;
            } else {
                display(ENTRY_ERR_DATE_IN_PAST);
                display(LINE_FEED);
            }
        }
        return formattedDate;
    }*/

    static DateChecker checkIfDateInFuture = d -> d.isAfter(LocalDate.now());

    public static LocalDate getFromDate(){
        return getDateFromUser(QUESTION_STARTING_DATE,checkIfDateInFuture,ENTRY_ERR_DATE_IN_PAST);
    }

    private static LocalDate getDateFromUser(String questionToUser,DateChecker dateChecker,String errorMassage){
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
            if(dateChecker.dateIsvalid(formattedDate)) {
                dateOk = true;
            }else{
                display(errorMassage);
                display(LINE_FEED);
            }
        }
        return formattedDate;
    }

    public static LocalDate getUntilDate(LocalDate fromDate) {
        boolean dateOk = false;

        while (!dateOk) {
            String date = getNextInput(QUESTION_UNTIL_DATE);
            try {
                formattedDate = LocalDate.parse(date, DATE_TIME_FORMATTER);
            } catch (DateTimeParseException e) {
                display(ENTRY_ERR_DATE_FORMAT);
                display(LINE_FEED);
                continue;
            }
            if (checkDateBetween(formattedDate, fromDate)) {
                dateOk = true;
            } else {
                display(ENTRY_ERR_DATE_BEFORE_BOOKING_START);
                display(LINE_FEED);
            }
        }
        return formattedDate;
    }

    private static boolean checkDateBetween(LocalDate formattedDate, LocalDate now) {
        return formattedDate.isAfter(now);
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
        Person bookingPerson = personEntry();
        return bookingPerson;
    }

    private static Person personEntry(){
        boolean birthDayOK = false;
        while(!birthDayOK) {
            String birthday = getNextInput(QUESTION_PERSON_BIRTHDAY);
            try {
                formattedDate = LocalDate.parse(birthday, DATE_TIME_FORMATTER);
            } catch (DateTimeParseException e) {
                display(ENTRY_ERR_DATE_FORMAT);
                display(LINE_FEED);
                continue;
            }
            if (checkAge(formattedDate, LocalDate.now())) {
                birthDayOK = true;
            } else {
                display(ENTRY_ERR_DATE_NOT_18);
                display(LINE_FEED);
            }
        }
        return new Person("Lens","Huygh",LocalDate.parse("23/06/1980",DATE_TIME_FORMATTER));
    }

    private static boolean checkAge(LocalDate birthDay, LocalDate now) {
        return ChronoUnit.YEARS.between(birthDay,now) >= 18;
    }
}
