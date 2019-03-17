package recap.sets;

import java.util.Objects;

public class Pet implements Comparable{
    private String name;
    private int age;
    private float weight;
    private Gender gender;

    public Pet() {
    }

    public Pet(String name, int age, float weight, Gender gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public enum Gender {
        MALE, FEMALE;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Object o) {
        return this.getName().compareTo(((Pet) o).getName());
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return name.equals(pet.name) &&
                gender == pet.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }
}
