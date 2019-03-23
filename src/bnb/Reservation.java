package bnb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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

    public void addPerson(Person person) {
        if (persons == null) {
            persons = new HashSet<>();
        }
        this.persons.add(person);
    }

    public void addRoom(Room room) {
        if (rooms == null) {
            rooms = new HashSet<>();
        }
        this.rooms.add(room);
    }

    @Override
    public String toString() {
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "\n" +
                "    ---------------------------------------------------------\n" +
                "    Reservation: \n" +
                "       From: " + dateTimeFormatter.format(bookedFrom) +
                "  Until " + dateTimeFormatter.format(bookedUntil) + "\n" +
                "       persons=" + persons + "\n" +
                "       rooms= " + rooms + "\n" +
                "---------------------------------------------------------\n";
    }

    public String prettyOutput() {
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Set<String> myRooms = rooms.stream().map(room -> room.getName()).collect(Collectors.toCollection(HashSet::new));
        Set<String> myPersons = persons.stream().map(person -> person.getLastName()+", " +person.getFirstName()).collect(Collectors.toSet());

        return "\n" +
                "    ---------------------------------------------------------\n" +
                "    Reservation: \n" +
                "       From: " + dateTimeFormatter.format(bookedFrom) +
                "  Until: " + dateTimeFormatter.format(bookedUntil) + "\n" +
                "       rooms: " + myRooms + "\n" +
                "       persons: " + myPersons + "\n" +
                "---------------------------------------------------------\n";
    }

    public void prettyOutput2(){
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("--------------------------------------------------%n");
        System.out.printf("Reservation:%n");
        System.out.printf("     From: %s     Until:%s:%n",dateTimeFormatter.format(bookedFrom),dateTimeFormatter.format(bookedUntil));
        System.out.printf("         Room(s):%n");
        Set<Room> roomSet = getRooms();
        roomSet.forEach(s -> System.out.printf("               %s%n",s.getName()));
        System.out.printf("         People:%n");
        Set<Person> personSet = getPersons();
        personSet.forEach(s-> System.out.printf("               %s%n",s.getLastName() + ", " + s.getFirstName()));
        System.out.printf("--------------------------------------------------%n");
    }


}
