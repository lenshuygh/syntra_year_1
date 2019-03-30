package bnb;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class TextOutput {
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static String createRoomOverview(List<Room> rooms){
        StringBuilder sb =  new StringBuilder();
        sb.append("-----------------------------------------------------%n");
        for (int i = 0; i < rooms.size(); i++) {
            sb.append(i);
            sb.append(".  ");
            sb.append(rooms.get(i).getName());
            sb.append("          (");
            sb.append(rooms.get(i).getCapacity());
            sb.append(" persons -");
            sb.append(" ");
            sb.append(rooms.get(i).getPricePerNight());
            sb.append(" Eur/Night).");
            sb.append("%n");
        }
        sb.append("-----------------------------------------------------%n");
        return sb.toString();
    }

    public static String createPeopleOverview(List<Person> persons) {
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------------------%n");
        sb.append("Persons from current reservation:%n");
        sb.append("---------------------------------%n");
        for (int i = 0; i < persons.size(); i++) {
            sb.append(i).append(".  ").append(persons.get(i).getLastName()).append(", ").append(persons.get(i).getFirstName()).append("%n");
        }
        sb.append("---------------------------------%n");
        return sb.toString();
    }
}
