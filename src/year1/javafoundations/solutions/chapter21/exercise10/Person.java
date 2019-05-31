package year1.javafoundations.solutions.chapter21.exercise10;

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
    private static final long serialVersionUID = 5004565115898305224L;
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private transient Timer heartbeat;
    private String birthPlace = "unknown";

    public Person(String firstname, String lastname, LocalDate birthday, String birthPlace) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.birthPlace = birthPlace;
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
                ", birthPlace='" + birthPlace + '\'' +
                '}';
    }

    private class Heartbeat extends TimerTask {
        @Override
        public void run() {
            System.out.print("*");
        }
    }
}