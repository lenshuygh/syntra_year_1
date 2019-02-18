package recap.Animals;

public class Cat extends Animal {
    public Cat(){

    }

    public Cat(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Cat: "+getName()+" moves");
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat: "+getName()+" makes noise");
    }
}
