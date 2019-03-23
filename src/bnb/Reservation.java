package bnb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Reservation {
    private Set<Person> persons;
    private Set<Room> rooms;
    private LocalDate bookedFrom;
    private LocalDate bookedUntil;
    private int index;
    private static int count;

    public Reservation() {
        this.count++;
        this.index = count;
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

    public int getIndex() {
        return index;
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

    public void listSummaryOutput(){
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Set<Room> roomSet = getRooms();
        System.out.printf("%d:       %d persons%n         %s - %s%n",getIndex(),persons.size(),dateTimeFormatter.format(bookedFrom),dateTimeFormatter.format(bookedUntil));
        roomSet.forEach(r -> System.out.printf("         %s%n",r.getName()));
        System.out.printf("------------------------------------------%n");
    }

    public void singleReservationAllDetails(){
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Set<Room> roomSet = getRooms();
        Set<Person> personSet = getPersons();
        long daysBooked = ChronoUnit.DAYS.between(bookedFrom, bookedUntil);
        int totalPrice = 0;

        for (Room room : rooms) {
            totalPrice += room.getPricePerNight() * daysBooked;
        }
        System.out.printf("       %s - %s (%d nights)%n",dateTimeFormatter.format(bookedFrom),dateTimeFormatter.format(bookedUntil), daysBooked);
        System.out.printf("       Rooms:%n");
        roomSet.forEach(r -> System.out.printf("         %s - Capacity: %d - Price/night: %d%n",r.getName(),r.getCapacity(),r.getPricePerNight()));
        System.out.printf("       Persons:%n");
        personSet.forEach(p -> System.out.printf("         %s, %s%n",p.getLastName(),p.getFirstName()));
        System.out.printf("------------------------------------------%n");
        System.out.printf("       Total price: %d%n",totalPrice);
        System.out.printf("------------------------------------------%n");
    }

}
