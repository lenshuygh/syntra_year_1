package bnb;

import java.util.Collection;

public class Room {
    private String name;
    private int capacity;
    private int pricePerNight;

    public Room(String name, int capacity, int pricePerNight) {
        this.name = name;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity + "Persons" +
                ", pricePerNight=" + pricePerNight + "Eur" +
                '}';
    }

    public static Collection<Room> createRooms() {
        Collection<Room> rooms = new Set
        Room bigRoomOfFunRoom = new Room("Big Room Of Fun", 6, 350);
        Room ocmwRoom = new Room("OCMW", 8, 120);
        Room familyRoom = new Room("Family Room", 4, 250);
        Room theDungeonRoom = new Room("The Dungeon", 2, 220);
        Room theHoneymoonRoom = new Room("The Honeymoon",2,180);
    }
}
