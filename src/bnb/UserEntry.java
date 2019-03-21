package bnb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import static bnb.BnbCommands.*;

public class UserEntry {
    public static BnbCommands getMenuEntry() {
        printCommandChoices();
        String stringInput = "";
        int commandChoice = -1;
        boolean goodEntry = false;
        Scanner scanner = new Scanner(System.in);

        while (!goodEntry) {
            System.out.print("Enter the number of the action u want to perform:");
            stringInput = scanner.next();
            try {
                commandChoice = Integer.parseInt(stringInput);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
                continue;
            }
            if ((commandChoice < 0) || (commandChoice > 5)) {
                System.out.println("Please enter a number from 0 to 5.");
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

    public static void printCommandChoices() {
        System.out.println("Please choose on of the following commands:");
        System.out.println("1.  Check room availability for a given period.");
        System.out.println("2.  Check reservations by client.");
        System.out.println("3.  Book a reservation.");
        System.out.println("4.  Change a reservation.");
        System.out.println("5.  Print reservation data.");
        System.out.println("0.  Quit Program.");
    }

    public static LocalDate getFromDate(){
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        String date = "";
        LocalDate formattedDate = LocalDate.now();
        boolean dateOk = false;


        while(!dateOk) {
            System.out.print("Starting date of reservation (DD/MM/YYYY): ");
            date = scanner.next();
            try {
                formattedDate = LocalDate.parse(date, myFormatter);
            } catch (DateTimeParseException e) {
                System.out.println("Please format your date correctly eg: 06/12/2020");
                System.out.println();
                continue;
            }
            dateOk = true;
        }

        return formattedDate;
    }
}
