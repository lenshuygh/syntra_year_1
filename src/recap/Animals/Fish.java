package recap.Animals;

public class Fish extends Animal {
    public Fish(){

    }

    public Fish(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Fish: " + getName() + " moves.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Fish: " + getName() + " makes noise");
    }
}
