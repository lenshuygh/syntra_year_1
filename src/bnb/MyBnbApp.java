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
        switch (choice) {
            case 1:
                int reservationNumber = UserInteraction.getReservationToDisplayNumber(bnbReservationMap);
                UserInteraction.displaySingleReservationWithAllDetails(reservationNumber, bnbReservationMap);
                break;
            case 2:
                LocalDate fromDate = UserInteraction.getFromDate();
                LocalDate untilDate = UserInteraction.getUntilDate(fromDate);
                UserInteraction.displayReservations(fromDate, untilDate, bnbReservationMap);
                break;
            default:
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
        boolean changed = false;
        UserInteraction.displayReservationsList(bnbReservationMap);
        int reservationChosen = UserInteraction.getReservationChoice(bnbReservationMap.size());
        UserInteraction.displaySingleReservationWithAllDetails(reservationChosen, bnbReservationMap);
        int editChoice = UserInteraction.getChangeChoice();
        if (editChoice != 5) {
            UserInteraction.displaySingleReservationWithAllDetails(reservationChosen, bnbReservationMap);

            switch (editChoice) {
                case 1:
                    // Change reservation startdate.%n" +
                    UserInteraction.displayStartDateToChange(reservationChosen, bnbReservationMap);
                    LocalDate newFromDate = UserInteraction.getChangedFromDate(reservationChosen,bnbReservationMap);
                    changed = ReservationUtils.changeFromDate(newFromDate,reservationChosen,bnbReservationMap);
                    UserInteraction.changedSuccess(changed);
                    break;
                case 2:
                    // Change reservation enddate.%n" +
                    UserInteraction.displayEndDateToChange(reservationChosen, bnbReservationMap);
                    LocalDate newToDate = UserInteraction.getChangedUntilDate(reservationChosen,bnbReservationMap);
                    changed = ReservationUtils.changeUntilDate(newToDate,reservationChosen,bnbReservationMap);
                    UserInteraction.changedSuccess(changed);
                    break;
                case 3:
                    // Change rooms.%n" +
                    UserInteraction.displaySingleReservationWithAllDetails(reservationChosen,bnbReservationMap);
                    UserInteraction.changeRooms(reservationChosen, bnbReservationMap,rooms);
                    break;
                case 4:
                    // Change persons.%n" +
                    UserInteraction.displaySingleReservationWithAllDetails(reservationChosen,bnbReservationMap);
                    UserInteraction.changePerson(reservationChosen,bnbReservationMap);
                    break;
                case 5:
                    // Delete reservation.%n" +
                    if (UserInteraction.okayToDelete()) {
                        ReservationUtils.deleteReservation(reservationChosen, bnbReservationMap);
                    }
                    break;
                default:
            }
        }
    }


}
