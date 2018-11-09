package oo;

public class ColoredCat extends Cat {
    String color;

    public ColoredCat(String color) {
        this.color = color;
    }

    public ColoredCat(int age, String color) {
        super(age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
