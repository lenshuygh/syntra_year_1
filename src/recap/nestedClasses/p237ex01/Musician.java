package recap.nestedClasses.p237ex01;

public class Musician {
    public void play(){
        Instrument instrument = new Instrument();
        instrument.makeSound();
    }
    class Instrument{
        public void makeSound(){
            System.out.println("Instrument class -> makeSound()");
        }
    }
}
