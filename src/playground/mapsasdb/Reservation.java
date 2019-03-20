package playground.mapsasdb;

import java.time.LocalDate;
import java.util.Collection;

public class Reservation {
    private Collection<Room> rooms;
    private LocalDate from;


    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public Collection<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Collection<Room> rooms) {
        this.rooms = rooms;
    }
}
