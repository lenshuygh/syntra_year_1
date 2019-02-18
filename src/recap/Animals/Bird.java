package recap.Animals;

public class Bird extends Animal {
    public Bird(){

    }

    public Bird(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Bird: " + getName() + " moves.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bird: " + getName() + " makes noise.");
    }
}

