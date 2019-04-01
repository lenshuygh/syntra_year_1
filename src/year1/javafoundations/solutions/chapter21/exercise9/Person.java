package year1.javafoundations.solutions.chapter21.exercise9;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 3180626697202652256L;
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private transient Timer heartbeat;
    private String birthPlace;

    public Person(String firstname, String lastname, LocalDate birthday) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        setNewHeartBeat();
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

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    private void setNewHeartBeat(){
        heartbeat = new Timer(true);
        heartbeat.scheduleAtFixedRate(new Heartbeat(),0,1000);
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        setNewHeartBeat();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    private class Heartbeat extends TimerTask {
        @Override
        public void run() {
            System.out.print("*");
        }
    }
}
