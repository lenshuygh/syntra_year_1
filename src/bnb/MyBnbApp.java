package bnb;

import java.time.LocalDate;
import java.util.*;

public class MyBnbApp {
    private static List<Room> rooms = Room.createRooms();
    private static Map<String,Reservation> bnbReservationMap = new HashMap<>();

    public static void main(String[] args) {
        BnbCommands bnbCommand;
        do {
            bnbCommand = UserInteraction.getMenuEntry();
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
        UserInteraction.displayReservations(bnbReservationMap);
        int choice = UserInteraction.getAfterOverviewChoice();
        if(choice == 0) {
            int reservationNumber = UserInteraction.getReservationToDisplayNumber(bnbReservationMap);
            UserInteraction.displaySingleReservationWithAllDetails(reservationNumber,bnbReservationMap);
        }
    }

    private static void checkByPerson() {
        Person searchedPerson = UserInteraction.personEntry();
        UserInteraction.displayReservations(searchedPerson,bnbReservationMap);
    }
    //todo: reverse this, now it shows the booked rooms instead of the free rooms
    private static void checkAvailability() {
        LocalDate fromDate = UserInteraction.getFromDate();
        LocalDate untilDate = UserInteraction.getUntilDate(fromDate);
        UserInteraction.displayRoomAvailability(fromDate,untilDate,bnbReservationMap,rooms);
    }


    //todo: capacity-issues -> persons vs room-capacity, ...
    //todo: check availability during date & room choice
    private static void bookReservation() {

        Reservation reservation = new Reservation();
        reservation.addPerson(UserInteraction.getBookingPerson());
        reservation.setBookedFrom(UserInteraction.getFromDate());
        reservation.setBookedUntil(UserInteraction.getUntilDate(reservation.getBookedFrom()));
        Room roomWanted = UserInteraction.getRoomWanted(rooms, reservation.getBookedFrom(), reservation.getBookedUntil());
        System.out.println("checking");
        System.out.println(ReservationUtils.checkAvailabilityRoomToPeriod(roomWanted,reservation,bnbReservationMap));
        reservation.addRoom(roomWanted);
        bnbReservationMap.put(UUID.randomUUID().toString(), reservation);



/*        Reservation reservation = new Reservation();
        Set<Person> personSet = new HashSet<>();
        Set<Room> roomSet = new HashSet<>();

        Person bookingPerson = UserInteraction.getBookingPerson();
        LocalDate fromDate = UserInteraction.getFromDate();
        LocalDate untilDate = UserInteraction.getUntilDate(fromDate);
        Room roomToBook = UserInteraction.getRoomWanted(rooms, fromDate, untilDate);

        boolean reservationConflict = UserInteraction.checkAvailability(fromDate,untilDate,roomToBook,bnbReservationMap);*/


/*
        boolean continueReservation = false;
        if(!continueReservation) {
            Person bookingPerson = UserInteraction.getBookingPerson();
            LocalDate fromDate = UserInteraction.getFromDate();
            LocalDate untilDate = UserInteraction.getUntilDate(fromDate);
            Room roomToBook = UserInteraction.getRoomWanted(rooms, fromDate, untilDate);
            Reservation reservation = new Reservation();
            Set<Person> personSet = new HashSet<>();
            Set<Room> roomSet = new HashSet<>();


            boolean reservationConflict = UserInteraction.checkAvailability(fromDate,untilDate,roomToBook,bnbReservationMap);
            if(!reservationConflict){
                continueReservation = UserInteraction.proposeRegistration(fromDate,untilDate,roomToBook);
                if(continueReservation){
                    boolean finishReservation = false;
                    boolean cancelReservation = false;
                    while(!finishReservation) {
                        int choice = UserInteraction.continueReservation();
                        switch (choice) {
                            case 0:
                                Person person = UserInteraction.personEntry();
                                //boolean roomsCapacityReached = UserInteraction.checkCapacity()
                                personSet.add(person);
                                break;
                            case 1:
                                Room room = UserInteraction.getRoomWanted(rooms,fromDate,untilDate);
                                reservationConflict = UserInteraction.checkAvailability(fromDate,untilDate,roomToBook,bnbReservationMap);
                                if(!reservationConflict){
                                    roomSet.add(room);
                                }
                                break;
                            case 2:
                                finishReservation = true;
                                personSet.forEach(p ->reservation.addPerson(p));
                                roomSet.forEach(r -> reservation.addRoom(r));
                                break;
                            default:
                                finishReservation = true;
                                cancelReservation = true;
                        }

                    }
                    if(!cancelReservation) {
                        reservation.addPerson(bookingPerson);
                        reservation.addRoom(roomToBook);
                        reservation.setBookedFrom(fromDate);
                        reservation.setBookedUntil(untilDate);
                        bnbReservationMap.put(UUID.randomUUID().toString(), reservation);
                    }
                }
            }
        }
        */
    }

    private static void changeReservation() {
    }
}
