package book_exercises.p237opdracht1;

public class Musician {
    public class Instrument {
        void makeSound(){
            System.out.println("instrument making a sound");
        }
    }

    public void play(){
        Instrument instrument = new Instrument();
        instrument.makeSound();
    }
}
