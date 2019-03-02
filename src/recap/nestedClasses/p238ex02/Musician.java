package recap.nestedClasses.p238ex02;

public class Musician {
    public void play() {

        class Instrument {
            public void makeSound() {
                System.out.println("Instrument class -> makeSound()");
            }
        }
        /*
        Instrument instrument = new Instrument();
        instrument.makeSound();
        */

        new Instrument().makeSound();
    }
}
