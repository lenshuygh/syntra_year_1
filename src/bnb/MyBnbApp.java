package bnb;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class MyBnbApp {
    private static List<Room> rooms = Room.createRooms();
    private static Map<String,Reservation> bnbReservationMap = new HashMap<>();

    public static void main(String[] args) {
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


    //todo: persons !!! check age of booker, capacity-issues -> persons vs room-capacity, ...
    private static void bookReservation() {
        boolean continueReservation = false;
        if(!continueReservation) {
            Reservation reservation = new Reservation();
            Person bookingPerson = UserEntry.getBookingPerson();
            LocalDate fromDate = UserEntry.getFromDate();
            LocalDate untilDate = UserEntry.getUntilDate(fromDate);
            Room roomToBook = UserEntry.getRoomWanted(rooms, fromDate, untilDate);
            continueReservation = UserEntry.proposeRegistration(fromDate,untilDate,roomToBook);
            if(continueReservation){
                reservation.addPerson(bookingPerson);
                reservation.addRoom(roomToBook);
                reservation.setBookedFrom(fromDate);
                reservation.setBookedUntil(untilDate);
                bnbReservationMap.put(UUID.randomUUID().toString(),reservation);
            }
        }
    }

    private static void changeReservation() {
    }
}
