package year1.javafoundations.solutions.chapter11.exercise1;

public class PlanetApp {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println(planet);
        }
    }
}
