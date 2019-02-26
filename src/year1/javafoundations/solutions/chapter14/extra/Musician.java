package year1.javafoundations.solutions.chapter14.extra;

import inclass.nestedclasses.Instrument;

public class Musician {
    public void play(){
        new CoolInstrument().makeNoise();

        class ImplementedInstrument implements Instrument {

            @Override
            public void makeNoise() {
                System.out.println("Noise");
            }
        }

        new ImplementedInstrument().makeNoise();

        new Instrument(){
            @Override
            public void makeNoise() {
                System.out.println("Noise");
            }
        }.makeNoise();
    }

    public class CoolInstrument implements Instrument {

        @Override
        public void makeNoise() {
            System.out.println("Cool Noise");
        }
    }

}
