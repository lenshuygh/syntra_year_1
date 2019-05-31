package year1.javafoundations.solutions.chapter21.exercise11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by JonathanSyntra on 19/04/2017.
 */
public class ApplicationProperties {
    private String fileName;
    private Properties props = new Properties();
    private final String X = "x";
    private final String Y = "y";
    private final String WIDTH = "width";
    private final String HEIGHT = "height";

    public ApplicationProperties(String fileName){
        this.fileName = fileName;
    }

    public int getX() {
        return Integer.valueOf(props.getProperty(X,"0"));
    }

    public void setX(int x) {
        props.setProperty(X,Integer.toString(x));
    }

    public int getY() {
        return Integer.valueOf(props.getProperty(Y, "0"));
    }

    public void setY(int y) {
        props.setProperty(Y,Integer.toString(y));
    }

    public int getWidth() {
        return Integer.valueOf(props.getProperty(WIDTH,"500"));
    }

    public void setWidth(int width) {
        props.setProperty(WIDTH,Integer.toString(width));
    }

    public int getHeight() {
        return Integer.valueOf(props.getProperty(HEIGHT,"500"));
    }

    public void setHeight(int height) {
        props.setProperty(HEIGHT,Integer.toString(height));
    }

    public void load() throws IOException {
        try(FileInputStream in = new FileInputStream(fileName)){
            props.load(in);
        }
    }

    public void store() throws IOException {
        try(FileOutputStream out = new FileOutputStream(fileName)){
            props.store(out,"Application properties");
        }
    }
}