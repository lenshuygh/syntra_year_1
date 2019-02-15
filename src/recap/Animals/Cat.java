package recap.Animals;

public class Cat extends Animal {
    public Cat(){

    }

    public Cat(String name){
        setName(name);
    }

    @Override
    public void move() {
        System.out.println("Cat moves");
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat makes noise");
    }
}
