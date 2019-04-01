package book_exercises.p375opdracht9;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

public class Person implements Serializable {
    private static final long serialVersionUID = -1553876970869984950L;
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private transient Timer heartbeat;


    public Person(String firstName, String lastName, LocalDate birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        heartbeat = new Timer(true);
        heartbeat.scheduleAtFixedRate(new Heartbeat(), 0, 1000);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    private class Heartbeat extends TimerTask {
        @Override
        public void run() {
            System.out.println("*");
        }
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        heartbeat = new Timer(true);
        heartbeat.scheduleAtFixedRate(new Heartbeat(), 0, 1000);
    }

    public void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
    }
}
