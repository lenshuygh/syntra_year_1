package bnb;

public enum TextMessages {
    OVERVIEW_MAIN_CHOICES(
            "-----------------------------------------------------%n" +
                    "0.  Quit Program.%n" +
                    "1.  Check room availability for a given period.%n" +
                    "2.  Check reservations by client.%n" +
                    "3.  Book a reservation.%n" +
                    "4.  Change a reservation.%n" +
                    "5.  Print reservation data.%n" +
                    "-----------------------------------------------------%n"),

    OVERVIEW_ROOMS(
            "------------------------------------------------------------%n" +
                    "0.  Room: Big Room Of Fun (cap: 6, price: 350 Eur/night)%n" +
                    "1.  Room: OCMW (cap: 8, price: 120 Eur/night)%n" +
                    "2.  Room: Family Room (cap: 4, price: 250 Eur/night)%n" +
                    "3.  Room: The Dungeon (cap: 2, price: 220 Eur/night)%n" +
                    "4.  Room: The Honeymoon (cap: 2, price: 180 Eur/night)%n" +
                    "------------------------------------------------------------%n"),

    OVERVIEW_RESERVATION_ENTRY(
            "    --------------------------------------%n" +
                    "0.  Return to the main menu.%n" +
                    "1.  Add another person to the reservation.%n" +
                    "2.  Add another room to the reservation.%n" +
                    "3.  Complete current reservation.%n" +
                    "    --------------------------------------%n"),
    OVERVIEW_CHOOSE_RESERVATION_CHOICES(
            "    -------------------------%n" +
                    "0.  Return to the main menu.%n" +
                    "1.  Choose a reservation.%n" +
                    "2.  Specify a period.%n" +
                    "    -------------------------%n"),

    OVERVIEW_CHOOSE_EDIT_RESERVATION_CHOICES(
            "    -----------------------------%n" +
                    "0.  Return to main menu.%n" +
                    "1.  Choose a reservation to edit.%n" +
                    "    -----------------------------%n"),

    OVERVIEW_CHOOSE_PROPERTY_TO_EDIT_CHOICES(
            "    -----------------------------%n" +
                    "0.  Return to main menu.%n" +
                    "1.  Change reservation startdate.%n" +
                    "2.  Change reservation enddate.%n" +
                    "3.  Change rooms.%n" +
                    "4.  Change persons.%n" +
                    "5.  Delete reservation.%n" +
                    "    -----------------------------%n"),
    CHOICE_CHOOSE_OTHER_TO_EDIT(
            "    ---------------------------%n" +
                    "0.  Return to the main menu.%n" +
                    "1.  Edit above reservation.%n" +
                    "2.  Choose another reservation.%n" +
                    "    ---------------------------%n"),

    CHOICE_CHOOSE_ROOM_CHANGE(
            "    ---------------------------%n" +
                    "0.  Return to the main menu.%n" +
                    "1.  Add a room to the reservation.%n" +
                    "2.  Remove a room from the reservation%n" +
                    "    ---------------------------%n"),

    CHOICE_CHOOSE_PERSON_CHANGE(
            "    --------------------------------------------%n" +
                    "0.  Go back to the main menu.%n" +
                    "1.  Add a person to the reservation.%n" +
                    "2.  Remove a person from the reservation%n" +
                    "3.  Change name of a person from the reservation%n" +
                    "    --------------------------------------------%n"),


    QUESTION_ENTER_ACTION_NUMBER("    Enter the number of the action u want to perform: "),
    QUESTION_STARTING_DATE("    Please provide the starting date (DD/MM/YYYY): "),
    QUESTION_UNTIL_DATE("    Please provide the ending date (DD/MM/YYYY): "),
    QUESTION_ROOM_TO_RESERVE("    Please enter the number of the room you want to reserve: "),
    QUESTION_PERSON_NAME_LAST("    Please enter person's last name: "),
    QUESTION_PERSON_NAME_FIRST("    Please enter person's first name: "),
    QUESTION_PERSON_BIRTHDAY("    Please enter the booking person's birthday (DD/MM/YYYY): "),
    QUESTION_PROPOSED_RESERVATION("    Is the proposed reservation ok (y/n)?: "),
    QUESTION_ENTER_RESERVATION_NUMBER("    Please enter the reservation to display's number: "),
    QUESTION_ENTER_RESERVATION_NUMBER_TO_CHANGE("    Please enter the number of the reservation to change: "),
    QUESTION_ENTER_RESERVATION_NUMBER_TO_DELETE("    Please enter the number of the reservation to delete: "),
    QUESTION_ENTER_NUMBER_OF_PERSONS("    Please enter the number of persons that you want to book for (excluding the booking person): "),
    QUESTION_DELETE_PROPOSED_RESERVATION("    Are you sure you want to delete the reservation above? (y/n)?: "),
    QUESTION_CHANGED_STARTING_DATE("    Please provide the new starting date (DD/MM/YYYY): "),
    QUESTION_CHANGED_ENDING_DATE("    Please provide the new ending date (DD/MM/YYYY): "),
    QUESTION_PERSON_TO_CHANGE("    Please provide number of the person to change: "),
    QUESTION_PERSON_TO_REMOVE("    Please provide number of the person to remove: "),
    QUESTION_ROOM_TO_CHANGE("    Please provide number of the room to change: "),
    QUESTION_TYPE_ROOM_CHANGE("    Please provide number of the type of change: "),
    QUESTION_CHANGE_RESERVATION_ADD_ROOM("    Please provide number of the room to add to the reservation: "),
    QUESTION_ROOM_TO_REMOVE("    Please provide number of the room to remove from the reservation: "),
    QUESTION_TYPE_PERSON_CHANGE("    Please provide number of the type of change: "),

    ENTRY_ERR_NUMBER(
            "----------------------%n" +
                    "Please enter a number.%n" +
                    "----------------------%n"),
    ENTRY_ERR_NUMBER_RANGE(
            "----------------------------------%n" +
                    "Please enter a number from %d to %d.%n" +
                    "----------------------------------%n"),

    ENTRY_ERR_NUMBER_CHOICE(
            "--------------------------------------------------------------------%n" +
                    "Please enter a number that corresponds with an item in the overview.%n" +
                    "--------------------------------------------------------------------%n"),
    ENTRY_ERR_DATE_FORMAT(
            "------------------------------------------------%n" +
                    "Please format your date correctly eg: 06/12/2020%n" +
                    "------------------------------------------------%n"),
    ENTRY_ERR_DATE_IN_PAST(
            "----------------------------------------------------------------------------%n" +
                    "Please enter a date in the future, you cannot make a reservation in the past%n" +
                    "----------------------------------------------------------------------------%n"),
    ENTRY_ERR_DATE_BEFORE_BOOKING_START(
            "-----------------------------------------------------------------------------------%n" +
                    "Please enter a correct date that is later then the starting date of the reservation%n" +
                    "-----------------------------------------------------------------------------------%n"),
    ENTRY_ERR_DATE_BEFORE_OLD_BOOKING_END(
            "---------------------------------------------------------------------------------------%n" +
                    "Please enter a correct date that is before the ending date of the reservation to change%n" +
                    "---------------------------------------------------------------------------------------%n"),

    ENTRY_ERR_DATE_AFTER_OLD_BOOKING_START(
            "----------------------------------------------------------------------------------------%n" +
                    "Please enter a correct date that is after the starting date of the reservation to change%n" +
                    "----------------------------------------------------------------------------------------%n"),
    ENTRY_ERR_BOOLEAN(
            "---------------------------------------------------------------------%n" +
                    "Please enter the character 'y' for yes or 'n' for no (without quotes)%n" +
                    "---------------------------------------------------------------------%n"),
    ENTRY_ERR_AGE_NOT_18(
            "---------------------------------------------------------%n" +
                    "The booking's person has to be at least 18 years old.%n" +
                    "Please give the birthday of an adult person in the group.%n" +
                    "---------------------------------------------------------%n"),
    ERR_ROOM_REMOVE_NOT_ENOUCH_CAPACITY(
            "--------------------------------------------------------------------%n" +
                    "Removing this room with not accomodate booked persons, canceling....%n" +
                    "--------------------------------------------------------------------%n"),

    ERR_PERSON_ADD_NOT_ENOUCH_CAPACITY(
            "--------------------------------------------------------------------%n" +
                    "Adding this person will exceed reservation's capacity, canceling....%n" +
                    "--------------------------------------------------------------------%n"),

    LINE_PROPOSED_RESERVATION("    Check the proposed reservation below%n" +
            "    ------------------------------------%n"),

    LINE_PERSON_RESULTS(
            "Reservations for: '%s'%n" +
                    "---------------------------------------------%n"),
    LINE_PERIOD_RESULTS(
            "Reservations between: %s and %s%n" +
                    "--------------------------------------------------%n"),
    LINE_PERIOD_RESULTS_FREE_ROOMS(
            "Free rooms between: %s and %s%n" +
                    "--------------------------------------------------%n"),


    LINE_ALL_RESERVATIONS_OVERVIEW(
            "----------------------------------%n" +
            "Reservations overview:%n" +
                    "----------------------------------%n"),

    LINE_CHANGE_PERSON(
            "Enter new person details:%n" +
                    "----------------------------------%n"),

    LINE_CONFLICTING_RESERVATION(
            "Conflicting reservation found"),

    LINE_CONFLICTING_RESERVATION_CANCELED(
            "-------------------------------%n" +
                    "Current reservation is canceled%n"),

    LINE_PLEASE_CHOOSE_OTHER_ROOM(
            "Please choose another room for your reservation%n"),

    LINE_CAPACITY_NOT_AVAILABLE(
            "We're sorry but we cannot accommodate that many persons during the given period.%n"),

    LINE_DELETION_SUCCESS(
            "The chosen reservation was successfuly removed from the system.%n"),

    LINE_CHANGE_SUCCES(
            "------------------------------------------------%n" +
                    "The chosen reservation was successfully changed.%n" +
                    "------------------------------------------------%n"),

    LINE_ADD_PERSON_TO_RESERVATION(
            "----------------------------------------%n" +
                    "Add a person to the current reservation.%n" +
                    "----------------------------------------%n"),

    LINE_REMOVE_PERSON_FROM_RESERVATION(
            "---------------------------------------------%n" +
                    "Remove a person from the current reservation.%n" +
                    "---------------------------------------------%n"),

    LINE_CHANGE_NO_SUCCESS(
            "The chosen reservation was not changed due to an error.%n"),

    LINE_AVAILABLE_ROOMS(
            "The rooms available for this reservation.%n"),

    LINE_ENTER_PERSON(
            "%n    Enter the name of the person to add to the reservation.%n"
    ),

    LINE_FEED("%n");

    private final String text;

    TextMessages(final String text) {
        this.text = text;
    }

    public String toText() {
        return text;
    }
}
