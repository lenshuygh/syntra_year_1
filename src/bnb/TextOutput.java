package bnb;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class TextOutput {
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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
