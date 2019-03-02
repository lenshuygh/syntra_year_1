package recap.nestedClasses.p237ex01;

public class MusicianApp {
    public static void main(String[] args) {
        new Musician().play();

        Musician musician = new Musician();
        Musician.Instrument musicianInstrument = musician.new Instrument();
        musicianInstrument.makeSound();
    }
}
