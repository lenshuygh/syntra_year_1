package bnb;

import java.time.LocalDate;
import java.util.*;

public class MyBnbApp {
    private static List<Room> rooms = Room.createRooms();
    private static Map<String, Reservation> bnbReservationMap = new HashMap<>();

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
        if (choice == 0) {
            int reservationNumber = UserEntry.getReservationToDisplayNumber(bnbReservationMap);
            UserEntry.displaySingleReservationWithAllDetails(reservationNumber, bnbReservationMap);
        }
    }

    private static void checkByPerson() {
        Person searchedPerson = UserEntry.personEntry();
        UserEntry.displayReservations(searchedPerson, bnbReservationMap);
    }

    //todo: reverse this, now it shows the booked rooms instead of the free rooms
    private static void checkAvailability() {
        LocalDate fromDate = UserEntry.getFromDate();
        LocalDate untilDate = UserEntry.getUntilDate(fromDate);
        //UserEntry.displayReservations(fromDate,untilDate,bnbReservationMap);
        UserEntry.displayRoomAvailability(fromDate, untilDate, bnbReservationMap, rooms);
    }


    //todo: capacity-issues -> persons vs room-capacity, ...
    //todo: check availability during date & room choice
    private static void bookReservation() {
/*        Reservation reservation = new Reservation();
        Set<Person> personSet = new HashSet<>();
        Set<Room> roomSet = new HashSet<>();

        Person bookingPerson = UserEntry.getBookingPerson();
        LocalDate fromDate = UserEntry.getFromDate();
        LocalDate untilDate = UserEntry.getUntilDate(fromDate);
        Room roomToBook = UserEntry.getRoomWanted(rooms, fromDate, untilDate);

        boolean reservationConflict = UserEntry.checkAvailability(fromDate,untilDate,roomToBook,bnbReservationMap);*/


        boolean continueReservation = false;
        if (!continueReservation) {
            Person bookingPerson = UserEntry.getBookingPerson();
            LocalDate fromDate = UserEntry.getFromDate();
            LocalDate untilDate = UserEntry.getUntilDate(fromDate);
            Room roomToBook = UserEntry.getRoomWanted(rooms, fromDate, untilDate);
            Reservation reservation = new Reservation();
            Set<Person> personSet = new HashSet<>();
            Set<Room> roomSet = new HashSet<>();


            boolean reservationConflict = UserEntry.checkAvailability(fromDate, untilDate, roomToBook, bnbReservationMap);
            if (!reservationConflict) {
                continueReservation = UserEntry.proposeRegistration(fromDate, untilDate, roomToBook);
                if (continueReservation) {
                    boolean finishReservation = false;
                    boolean cancelReservation = false;
                    while (!finishReservation) {
                        int choice = UserEntry.continueReservation();
                        switch (choice) {
                            case 0:
                                Person person = UserEntry.personEntry();
                                //boolean roomsCapacityReached = UserEntry.checkCapacity()
                                personSet.add(person);
                                break;
                            case 1:
                                Room room = UserEntry.getRoomWanted(rooms, fromDate, untilDate);
                                reservationConflict = UserEntry.checkAvailability(fromDate, untilDate, roomToBook, bnbReservationMap);
                                if (!reservationConflict) {
                                    roomSet.add(room);
                                }
                                break;
                            case 2:
                                finishReservation = true;
                                personSet.forEach(p -> reservation.addPerson(p));
                                roomSet.forEach(r -> reservation.addRoom(r));
                                break;
                            default:
                                finishReservation = true;
                                cancelReservation = true;
                        }

                    }
                    if (!cancelReservation) {
                        reservation.addPerson(bookingPerson);
                        reservation.addRoom(roomToBook);
                        reservation.setBookedFrom(fromDate);
                        reservation.setBookedUntil(untilDate);
                        bnbReservationMap.put(UUID.randomUUID().toString(), reservation);
                    }
                }
            }
        }
    }

    private static void changeReservation() {
        UserEntry.displayReservations(bnbReservationMap);
        int choice = UserEntry.getAfterOverviewEditChoice();
        if (choice == 0) {
            int reservationNumber = UserEntry.getReservationToDisplayNumber(bnbReservationMap);
            UserEntry.displaySingleReservationWithAllDetails(reservationNumber, bnbReservationMap);
        }
        choice = UserEntry.getPropertyToEdit();
        /*
                    "0.  Change reservation startdate.%n" +
                    "1.  Change reservation enddate.%n" +
                    "2.  Change rooms.%n" +
                    "3.  Change persons.%n" +
                    "4.  Cancel change and return to menu.%n" +
         */
        switch (choice) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;

        }
    }
}
