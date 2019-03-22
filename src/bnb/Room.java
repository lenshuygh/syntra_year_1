package bnb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        return "Room: " +
                name +
                " (cap: " + capacity +
                ", price: " + pricePerNight + " Eur/night)";
    }

    public static List<Room> createRooms() {
        List<Room> rooms = new ArrayList<>();
        rooms.add( new Room("Big Room Of Fun", 6, 350));
        rooms.add( new Room("OCMW", 8, 120));
        rooms.add( new Room("Family Room", 4, 250));
        rooms.add( new Room("The Dungeon", 2, 220));
        rooms.add( new Room("The Honeymoon",2,180));
        return rooms;
    }
}
