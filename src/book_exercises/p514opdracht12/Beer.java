package book_exercises.p514opdracht12;

import java.io.Serializable;

public class Beer implements Serializable {
    private int id;
    private String name;
    private float price;
    private int stock;
    private float alchohol;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getAlchohol() {
        return alchohol;
    }

    public void setAlchohol(float alchohol) {
        this.alchohol = alchohol;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", alchohol=" + alchohol +
                '}';
    }
}
