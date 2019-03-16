package year1.javafoundations.solutions.chapter19.exercise4;

/**
 * Created by JonathanSyntra on 11/03/2017.
 */
public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private float weight;
    private float length;

    public Person() {
    }

    public Person(String firstName, Gender gender) {
        this.firstName = firstName;
        this.gender = gender;
    }

    public Person(String firstName, String lastName, Gender gender, int age, float weight, float length) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.length = length;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", weight=" + weight +
                ", length=" + length +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.firstName.compareTo(o.firstName);
    }

    public enum Gender {
        MALE,FEMALE
    }
}
