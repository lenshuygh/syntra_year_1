package bnb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import static bnb.BnbCommands.*;

public class UserEntry {
    private static final String OVERVIEW_MAIN_CHOICES =
            "Please choose on of the following commands:%n" +
                    "1.  Check room availability for a given period.%n" +
                    "2.  Check reservations by client.%n" +
                    "3.  Book a reservation.%n" +
                    "4.  Change a reservation.%n" +
                    "5.  Print reservation data.%n" +
                    "0.  Quit Program.%n";

    private static final String QUESTION_STARTING_DATE = "Please provide the starting date of reservation (DD/MM/YYYY): ";
    private static final String QUESTION_ENTER_ACTION_NUMBER = "Enter the number of the action u want to perform: ";

    private static final String ENTRY_ERR_NUMBER =
            "---------------------.%n" +
                    "Please enter a number.%n" +
                    "---------------------.%n";
    private static final String ENTRY_ERR_NUMBER_RANGE_0_5 =
            "----------------------------------%n" +
                    "Please enter a number from 0 to 5.%n" +
                    "----------------------------------%n";
    private static final String ENTRY_ERR_DATE_FORMAT =
            "------------------------------------------------%n" +
                    "Please format your date correctly eg: 06/12/2020%n" +
                    "------------------------------------------------%n";

    private static final String LINE_FEED = "%n";

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static LocalDate formattedDate = null;

    private static InputCheckers inputCheckers;

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
            if (!checkInRange(commandChoice,0,5)) {
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

    private static boolean checkInRange(int numberEntered, int lowLimit, int highLimit) {
        return (numberEntered >= lowLimit) && (numberEntered <= highLimit);
    }

    public static LocalDate getFromDate() {
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
            if(InputCheckers.isDateInFuture(formattedDate)
            dateOk = true;
        }
        return formattedDate;
    }

    private static void display(String s) {
        System.out.printf(s);
    }
}
