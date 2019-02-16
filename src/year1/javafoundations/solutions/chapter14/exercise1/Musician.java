package year1.javafoundations.solutions.chapter14.exercise1;

/**
 * Created by JonathanSyntra on 12/02/2017.
 */
public class Musician {
    public void play(){
        new Instrument().makeNoise();
    }

    public class Instrument {
        public void makeNoise(){
            System.out.println("Typical instrument sound!");
        }
    }
}
