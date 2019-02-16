package p238opdracht2;

public class Musician {


    public void play(){
        class Instrument {
            public void makeSound(){
                System.out.println("instrument making a sound");
            }
        }
        new Instrument().makeSound();
    }
}
