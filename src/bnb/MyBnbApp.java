package bnb;

import java.time.LocalDate;
import java.util.*;

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
        UserEntry.displayReservations(bnbReservationMap);
        int choice = UserEntry.getAfterOverviewChoice();
        if(choice == 0) {
            int reservationNumber = UserEntry.getReservationToDisplayNumber(bnbReservationMap);
            UserEntry.displaySingleReservationWithAllDetails(reservationNumber,bnbReservationMap);
        }
    }

    private static void checkByPerson() {
        Person searchedPerson = UserEntry.personEntry();
        UserEntry.displayReservations(searchedPerson,bnbReservationMap);
    }

    private static void checkAvailability() {
        LocalDate fromDate = UserEntry.getFromDate();
        LocalDate untilDate = UserEntry.getUntilDate(fromDate);
        UserEntry.displayReservations(fromDate,untilDate,bnbReservationMap);
    }


    //todo: persons !!! capacity-issues -> persons vs room-capacity, ...
    //todo: check availability during date & room choice
    private static void bookReservation() {
        boolean continueReservation = false;
        if(!continueReservation) {
            Person bookingPerson = UserEntry.getBookingPerson();
            LocalDate fromDate = UserEntry.getFromDate();
            LocalDate untilDate = UserEntry.getUntilDate(fromDate);
            Room roomToBook = UserEntry.getRoomWanted(rooms, fromDate, untilDate);

            //check availability
            boolean reservationConflict = UserEntry.checkAvailability(fromDate,untilDate,roomToBook,bnbReservationMap);
            if(!reservationConflict){

                // check if other rooms will be booked

                //check if a next person is gonna be entered

                continueReservation = UserEntry.proposeRegistration(fromDate,untilDate,roomToBook);
                if(continueReservation){
                    Reservation reservation = new Reservation();
                    reservation.addPerson(bookingPerson);
                    reservation.addRoom(roomToBook);
                    reservation.setBookedFrom(fromDate);
                    reservation.setBookedUntil(untilDate);
                    bnbReservationMap.put(UUID.randomUUID().toString(),reservation);
                }
            }
        }
    }

    private static void changeReservation() {
    }
}
