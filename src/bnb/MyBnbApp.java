package bnb;

import java.time.LocalDate;
import java.util.*;

public class MyBnbApp {
    private static List<Room> rooms = Room.createRooms();
    private static Map<String, Reservation> bnbReservationMap = new HashMap<>();

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
        UserInteraction.displayReservationsList(bnbReservationMap);
        int choice = UserInteraction.getAfterOverviewChoice();
        if (choice == 0) {
            int reservationNumber = UserInteraction.getReservationToDisplayNumber(bnbReservationMap);
            UserInteraction.displaySingleReservationWithAllDetails(reservationNumber, bnbReservationMap);
        } else if (choice == 1) {
            LocalDate fromDate = UserInteraction.getFromDate();
            LocalDate untilDate = UserInteraction.getUntilDate(fromDate);
            UserInteraction.displayReservations(fromDate, untilDate, bnbReservationMap);
        }
    }

    private static void checkByPerson() {
        Person searchedPerson = UserInteraction.personEntry();
        UserInteraction.displayReservations(searchedPerson, bnbReservationMap);
    }

    private static void checkAvailability() {
        LocalDate fromDate = UserInteraction.getFromDate();
        LocalDate untilDate = UserInteraction.getUntilDate(fromDate);
        UserInteraction.getRoomsAvailableDuringPeriod(fromDate, untilDate, bnbReservationMap, rooms);
    }


    private static void bookReservation() {
        int numberOfPersons = 1;
        boolean continueReservation = true;

        Reservation reservation = new Reservation();
        reservation.addPerson(UserInteraction.getBookingPerson());
        reservation.setBookedFrom(UserInteraction.getFromDate());
        reservation.setBookedUntil(UserInteraction.getUntilDate(reservation.getBookedFrom()));
        numberOfPersons += UserInteraction.getNumberOfPersons();

        //check available rooms for period and see if total capacity is ok against numberOfPersons
        boolean capacityOk = ReservationUtils.checkCapacity(numberOfPersons, reservation, bnbReservationMap, rooms);
        if (!capacityOk) {
            UserInteraction.cancelReservationCapacity();
            continueReservation = false;
        }
        if (continueReservation) {
            for (int i = 1; i < numberOfPersons; i++) {
                reservation.addPerson(UserInteraction.personEntry());
            }
            while (!ReservationUtils.checkIfEnoughRoomsForPersons(reservation, numberOfPersons)) {
                List<Room> availableRooms = ReservationUtils.getRoomAvailableDuringPeriodAndCurrentReservation(reservation.getBookedFrom(), reservation.getBookedUntil(), bnbReservationMap, rooms, reservation);
                Room roomWanted = UserInteraction.getRoomWanted(availableRooms, reservation.getBookedFrom(), reservation.getBookedUntil());
                continueReservation = UserInteraction.proposeRegistration(reservation.getBookedFrom(), reservation.getBookedUntil(), roomWanted);
                reservation.addRoom(roomWanted);
            }
            if (continueReservation) {
                bnbReservationMap.put(UUID.randomUUID().toString(), reservation);
            }
        }



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
