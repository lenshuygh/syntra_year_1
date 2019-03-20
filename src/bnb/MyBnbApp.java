package bnb;

import java.time.LocalDate;
import java.util.Set;

public class MyBnbApp {

    public static void main(String[] args) {
        Set<Room> rooms = Room.createRooms();
        BnbCommands bnbCommand;
        do {
            bnbCommand = UserEntry.getMenuEntry();
            switch (bnbCommand) {
                case BOOK_RESERVATION:
                    bookReservation();
                    break;
                case CHANGE_RESERVATION:
                    changeReservation();
                    break;
                case CHECK_AVAILABILITY:
                    checkAvailability();
                    break;
                case CHECK_BY_PERSON:
                    checkByPerson();
                    break;
                case DISPLAY_RESERVATION:
                    displayReservation();
                    break;
                default:
            }
        } while (bnbCommand != BnbCommands.STOP_PROGRAM);
    }

    private static void displayReservation() {
    }

    private static void checkByPerson() {
    }

    private static void checkAvailability() {
    }

    private static void bookReservation() {
        LocalDate fromDate = UserEntry.getFromDate();
        System.out.println(fromDate);
    }

    private static void changeReservation() {
    }
}
