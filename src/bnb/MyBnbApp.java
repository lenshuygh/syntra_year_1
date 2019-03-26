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
            } else {
                UserInteraction.cancelWholeReservation();
            }
        }
    }

    private static void changeReservation() {
        int editChoice = UserInteraction.getChangeChoice();
        if (editChoice != 5) {
            UserInteraction.displayReservationsList(bnbReservationMap);


            switch (editChoice) {
                case 0:
                    // "0.  Change reservation startdate.%n" +
                        int reservationChosen = UserInteraction.getReservationChoiceChangeDate(bnbReservationMap.size());
                        UserInteraction.displaySingleReservationWithAllDetails(reservationChosen, bnbReservationMap);

                    break;
                case 1:
                    // "1.  Change reservation enddate.%n" +
                    break;
                case 2:
                    // "2.  Change rooms.%n" +
                    break;
                case 3:
                    // "3.  Change persons.%n" +
                    break;
                case 4:
                    // "4.  Delete reservation.%n" +
                    int reservationChosen = UserInteraction.getReservationChoiceDelete(bnbReservationMap.size());
                    UserInteraction.displaySingleReservationWithAllDetails(reservationChosen, bnbReservationMap);
                    if(UserInteraction.okayToDelete()){
                        ReservationUtils.deleteReservation(reservationChosen,bnbReservationMap);
                    }
                    break;
                case 5:
                    // "5.  Cancel change and return to main menu.%n" +
                    break;
                default:
                    // "6.  Save changes and return to main menu.%n" +

            }
        }
    }


}
