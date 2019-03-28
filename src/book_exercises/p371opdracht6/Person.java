package book_exercises.p371opdracht6;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private LocalDate birtDay;

    public Person(String firstName, String lastName, LocalDate birtDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtDay = birtDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirtDay() {
        return birtDay;
    }
}
