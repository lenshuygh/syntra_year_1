package year1.javafundamentals.solutions.chapter9.exercise1.logo;

import year1.javafundamentals.solutions.chapter9.graphics.Circle;
import year1.javafundamentals.solutions.chapter9.graphics.Rectangle;

/**
 * Created by JonathanSyntra on 6/01/2019.
 */
public class LogoApp {
    public static void main(String[] args) {
        Logo logo = new Logo(new Circle(5), new Rectangle(10,20),"Een tekst");
        printLogo(logo.getText(), logo.getArea());

        Logo logo2 = new Logo("Dit is een tekst");
        printLogo(logo2.getText(), logo2.getArea());

        LogoBis logoBis2 = new LogoBis();
        logoBis2.setCircles(null);
        printLogo(logoBis2.getText(), logoBis2.getArea());

        LogoBis logoBis3 = new LogoBis(null, null, "hahahaha");
        printLogo(logoBis3.getText(), logoBis3.getArea());

        Rectangle[] rectangles = new Rectangle[10];
        Circle[] circles = {new Circle(9)};
        LogoBis logoBis = new LogoBis(circles, rectangles, "Nog eens tekst");
        printLogo(logoBis.getText(), logoBis.getArea());
    }

    public static void printLogo(String text, double area){
        System.out.printf("Area of %s is: %.2f %n", text, area);
    }
}
