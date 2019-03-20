package playground.mapsasdb;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class BnbTool {
    public static void main(String[] args) {
        Collection<Reservation> reservations = new LinkedList<>();

        reservations.stream()
            .filter(reservation -> LocalDate.now().isBefore(reservation.getFrom()))
            .flatMap(reservation -> reservation.getRooms().stream());

        //i have the reservation but i want the rooms , not a stream of collections of rooms, i want a stream of rooms
        //this needs to return a stream...
    }
}
