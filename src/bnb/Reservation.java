package bnb;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;

public class Reservation {
    private Person person;
    private Set<Room> rooms;
    private LocalDate bookedFrom;
    private LocalDate bookedUntil;

    public Reservation(Person person, Set<Room> rooms, LocalDate bookedFrom, LocalDate bookedUntil) {
        this.person = person;
        this.rooms = rooms;
        this.bookedFrom = bookedFrom;
        this.bookedUntil = bookedUntil;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    public LocalDate getBookedFrom() {
        return bookedFrom;
    }

    public void setBookedFrom(LocalDate bookedFrom) {
        this.bookedFrom = bookedFrom;
    }

    public LocalDate getBookedUntil() {
        return bookedUntil;
    }

    public void setBookedUntil(LocalDate bookedUntil) {
        this.bookedUntil = bookedUntil;
    }
}
