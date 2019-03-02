package playground.nestedClasses.p239ex03;

public class Musician {
    public void play() {

        new Instrument(){
            @Override
            public void makeSound() {
                System.out.println("makeSound() from anonymousInnerClass");
            }
        }.makeSound();
    }

    /*public void play() {

        ((Instrument) () -> System.out.println("makeSound() from anonymousInnerClass")).makeSound();
    }*/
}
