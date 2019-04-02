package book_exercises.p378opdracht11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationProperties {
    private Properties properties = new Properties();
    private String fileName;

    public ApplicationProperties(String fileName) {
        this.fileName = fileName;

    }

    public int getX() {
        return Integer.valueOf(properties.getProperty("x", "0"));
    }

    public void setX(int x) {
        properties.setProperty("x", String.valueOf(x));
    }

    public int getY() {
        return Integer.valueOf(properties.getProperty("y", "0"));
    }

    public void setY(int y) {
        properties.setProperty("y", String.valueOf(y));
    }

    public int getHeight() {
        return Integer.valueOf(properties.getProperty("height", "0"));
    }

    public void setHeight(int height) {
        properties.setProperty("height", String.valueOf(height));
    }

    public int getWidth() {
        return Integer.valueOf(properties.getProperty("width", "0"));
    }

    public void setWidth(int width) {
        properties.setProperty("width", String.valueOf(width));
    }

    public void load() throws IOException {
        try (FileInputStream in = new FileInputStream(fileName)) {
            properties.load(in);
        }
    }

    public void store() throws IOException {
        try (FileOutputStream out = new FileOutputStream(fileName)){
                properties.store(out,"application Properties");
            }
        }
    }
