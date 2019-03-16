package year1.javafoundations.solutions.chapter20.exercise5;

/**
 * Created by JonathanSyntra on 26/03/2017.
 */
public class BurgerOrder {
    private String name;
    private int number;

    public BurgerOrder() {
    }

    public BurgerOrder(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BurgerOrder that = (BurgerOrder) o;

        if (number != that.number) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "BurgerOrder{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
