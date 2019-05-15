package year1.javafoundations.solutions.chapter21.exercise11;

import java.io.IOException;

/**
 * Created by JonathanSyntra on 19/04/2017.
 */
public class ReadApplicartionProperties {
    public static void main(String[] args) {
        ApplicationProperties applicationProperties = new ApplicationProperties(CreateApplicationProperties.PATH);
        try {
            applicationProperties.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Height: " + applicationProperties.getHeight());
        System.out.println("Width: " + applicationProperties.getWidth());
        System.out.println("X: " + applicationProperties.getX());
        System.out.println("Y: " + applicationProperties.getY());
    }
}
