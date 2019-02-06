package year1.javafoundations.solutions.chapter14.exercise2;

/**
 * Created by JonathanSyntra on 12/02/2017.
 */
public class Musician {
    public void play(){
        class Instrument {
            public void playNoise(){
                System.out.println("Typical instrument sound!");
            }
        }
        new Instrument().playNoise();
    }

}
