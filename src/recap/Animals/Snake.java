package recap.Animals;

public class Snake extends Animal {
    public Snake() {
    }

    public Snake(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Snake: " + getName() + " moves.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Snake: " + getName() + " makes noise.");
    }
}
