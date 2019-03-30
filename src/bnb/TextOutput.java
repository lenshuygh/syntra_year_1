package bnb;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class TextOutput {
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static final String OVERVIEW_MAIN_CHOICES =
            "-----------------------------------------------------%n" +
                    "0.  Quit Program.%n" +
                    "1.  Check room availability for a given period.%n" +
                    "2.  Check reservations by client.%n" +
                    "3.  Book a reservation.%n" +
                    "4.  Change a reservation.%n" +
                    "5.  Print reservation data.%n" +
                    "-----------------------------------------------------%n";
    public static final String OVERVIEW_ROOMS =
            "------------------------------------------------------------%n" +
                    "0.  Room: Big Room Of Fun (cap: 6, price: 350 Eur/night)%n" +
                    "1.  Room: OCMW (cap: 8, price: 120 Eur/night)%n" +
                    "2.  Room: Family Room (cap: 4, price: 250 Eur/night)%n" +
                    "3.  Room: The Dungeon (cap: 2, price: 220 Eur/night)%n" +
                    "4.  Room: The Honeymoon (cap: 2, price: 180 Eur/night)%n" +
                    "------------------------------------------------------------%n";
    public static final String OVERVIEW_RESERVATION_ENTRY =
            "    -------------------------------------------------------%n" +
                    "0.  Add attending person.%n" +
                    "1.  Add another room to your reservation.%n" +
                    "2.  Complete current reservation.%n" +
                    "3.  Cancel current reservation and return to the main menu.%n" +
                    "    -------------------------------------------------------%n";

    public static final String OVERVIEW_CHOOSE_RESERVATION_CHOICES =
            "    -------------------------%n" +
                    "0.  Choose a reservation.%n" +
                    "1.  Specify a period.%n" +
                    "2.  Go back to the main menu.%n" +
                    "    -------------------------%n";

    public static final String OVERVIEW_CHOOSE_EDIT_RESERVATION_CHOICES =
            "    -----------------------------%n" +
                    "0.  Choose a reservation to edit.%n" +
                    "1.  Go back to the main menu.%n" +
                    "    -----------------------------%n";
    public static final String OVERVIEW_CHOOSE_PROPERTY_TO_EDIT_CHOICES =
            "    ---------------------------------%n" +
                    "0.  Change reservation startdate.%n" +
                    "1.  Change reservation enddate.%n" +
                    "2.  Change rooms.%n" +
                    "3.  Change persons.%n" +
                    "4.  Delete reservation.%n" +
                    "5.  Cancel change and return to main menu.%n" +
                    "6.  Save changes and return to main menu.%n" +
                    "    ---------------------------------%n";
    public static final String CHOICE_CHOOSE_OTHER_TO_EDIT =
            "    ---------------------------%n" +
                    "0.  Edit above reservation.%n" +
                    "1.  Choose another reservation.%n" +
                    "2.  Go back to the main menu.%n" +
                    "    ---------------------------%n";


    public static final String QUESTION_ENTER_ACTION_NUMBER = "    Enter the number of the action u want to perform: ";
    public static final String QUESTION_STARTING_DATE = "    Please provide the starting date (DD/MM/YYYY): ";
    public static final String QUESTION_UNTIL_DATE = "    Please provide the ending date (DD/MM/YYYY): ";
    public static final String QUESTION_ROOM_TO_RESERVE = "    Please enter the number of the room you want to reserve: ";
    public static final String QUESTION_PERSON_NAME_LAST = "    Please enter person's last name: ";
    public static final String QUESTION_PERSON_NAME_FIRST = "    Please enter person's first name: ";
    public static final String QUESTION_PERSON_BIRTHDAY = "    Please enter the booking person's birthday (DD/MM/YYYY): ";
    public static final String QUESTION_PROPOSED_RESERVATION = "    Is the proposed reservation ok (y/n)?: ";
    public static final String QUESTION_ENTER_RESERVATION_NUMBER = "    Please enter the reservation to display's number: ";
    public static final String QUESTION_ENTER_RESERVATION_NUMBER_TO_CHANGE = "    Please enter the number of the reservation to change: ";
    public static final String QUESTION_ENTER_RESERVATION_NUMBER_TO_DELETE = "    Please enter the number of the reservation to delete: ";
    public static final String QUESTION_ENTER_NUMBER_OF_PERSONS = "    Please enter the number of persons that you want to book for (excluding the booking person): ";
    public static final String QUESTION_DELETE_PROPOSED_RESERVATION = "    Are you sure you want to delete the reservation above? (y/n)?: ";
    public static final String QUESTION_CHANGED_STARTING_DATE = "    Please provide the new starting date (DD/MM/YYYY): ";

    public static final String ENTRY_ERR_NUMBER =
            "----------------------%n" +
                    "Please enter a number.%n" +
                    "----------------------%n";
    public static String ENTRY_ERR_NUMBER_RANGE =
            "----------------------------------%n" +
                    "Please enter a number from %d to %d.%n" +
                    "----------------------------------%n";
    public static final String ENTRY_ERR_DATE_FORMAT =
            "------------------------------------------------%n" +
                    "Please format your date correctly eg: 06/12/2020%n" +
                    "------------------------------------------------%n";
    public static final String ENTRY_ERR_DATE_IN_PAST =
            "----------------------------------------------------------------------------%n" +
                    "Please enter a date in the future, you cannot make a reservation in the past%n" +
                    "----------------------------------------------------------------------------%n";
    public static final String ENTRY_ERR_DATE_BEFORE_BOOKING_START =
            "-----------------------------------------------------------------------------------%n" +
                    "Please enter a correct date that is later then the starting date of the reservation%n" +
                    "-----------------------------------------------------------------------------------%n";
    public static final String ENTRY_ERR_DATE_BEFORE_OLD_BOOKING_END =
            "-----------------------------------------------------------------------------------%n" +
                    "Please enter a correct date that is before then the ending date of the reservation%n" +
                    "-----------------------------------------------------------------------------------%n";
    public static final String ENTRY_ERR_BOOLEAN =
            "---------------------------------------------------------------------%n" +
                    "Please enter the character 'y' for yes or 'n' for no (without quotes)%n" +
                    "---------------------------------------------------------------------%n";
    public static final String ENTRY_ERR_AGE_NOT_18 =
            "---------------------------------------------------------%n" +
                    "The booking's person has to be at least 18 years old.%n" +
                    "Please give the birthday of an adult person in the group.%n" +
                    "---------------------------------------------------------%n";

    public static final String LINE_PROPOSED_RESERVATION = "    Check the proposed reservation below%n" +
            "    ------------------------------------%n";

    public static final String LINE_PERSON_RESULTS =
            "Reservations for: '%s'%n" +
                    "---------------------------------------------%n";
    public static final String LINE_PERIOD_RESULTS =
            "Reservations between: %s and %s%n" +
                    "--------------------------------------------------%n";
    public static final String LINE_PERIOD_RESULTS_FREE_ROOMS =
            "Free rooms between: %s and %s%n" +
                    "--------------------------------------------------%n";


    public static final String LINE_ALL_RESERVATIONS_OVERVIEW =
            "Reservations overview:%n" +
                    "----------------------------------%n";

    public static final String LINE_CONFLICTING_RESERVATION =
            "Conflicting reservation found";

    public static final String LINE_CONFLICTING_RESERVATION_CANCELED =
            "-------------------------------%n" +
                    "Current reservation is canceled%n";

    public static final String LINE_PLEASE_CHOOSE_OTHER_ROOM =
            "Please choose another room for your reservation%n";

    public static final String LINE_CAPACITY_NOT_AVAILABLE =
            "We're sorry but we cannot accommodate that many persons during the given period.%n";

    public static final String LINE_DELETION_SUCCESS =
            "The chosen reservation was successfuly removed from the system.%n";

    public static final String LINE_FEED = "%n";

    //todo: replace with return new StringBuilder().append.......toString();
    public static String createRoomOverview(List<Room> rooms) {
        String out = "";
        out = out.concat("-----------------------------------------------------%n");
        for (int i = 0; i < rooms.size(); i++) {
            out = out.concat(String.valueOf(i));
            out = out.concat(".  ");
            out = out.concat(rooms.get(i).getName());
            out = out.concat("          (");
            out = out.concat(String.valueOf(rooms.get(i).getCapacity()));
            out = out.concat(" persons -");
            out = out.concat(" ");
            out = out.concat(String.valueOf(rooms.get(i).getPricePerNight()));
            out = out.concat(" Eur/Night).");
            out = out.concat("%n");
        }
        out = out.concat("-----------------------------------------------------%n");
        return out;
    }
}
