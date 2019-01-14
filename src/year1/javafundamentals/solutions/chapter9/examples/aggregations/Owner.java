package year1.javafundamentals.solutions.chapter9.examples.aggregations;

/**
 * Created by JonathanSyntra on 6/01/2019.
 */
public class Owner {
    private String name;
    private Pet pet;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
