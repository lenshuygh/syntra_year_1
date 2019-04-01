package year1.javafoundations.solutions.chapter21.exercise8;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class Person implements Serializable {
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private transient Timer heartbeat;
    private String birthPlace;

    public Person(String firstname, String lastname, LocalDate birthday) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        heartbeat = new Timer(true);
        heartbeat.scheduleAtFixedRate(new Heartbeat(),0,1000);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    private class Heartbeat extends TimerTask {
        @Override
        public void run() {
            System.out.print("*");
        }
    }
}
