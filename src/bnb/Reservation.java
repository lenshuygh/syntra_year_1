package bnb;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Reservation {
    private Set<Person> persons;
    private Set<Room> rooms;
    private LocalDate bookedFrom;
    private LocalDate bookedUntil;

    public Reservation() {
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public void setPerson(Set<Person> persons) {
        this.persons = persons;
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

    public void addPerson(Person person){
        if(persons == null){
            persons = new HashSet<>();
        }
        this.persons.add(person);
    }

    public void addRoom(Room room){
        if(rooms == null){
            rooms = new HashSet<>();
        }
        this.rooms.add(room);
    }
}
