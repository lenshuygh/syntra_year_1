package p176opdracht1;

import year1.javafundamentals.solutions.chapter8.exercise12.graphics.Circle;
import year1.javafundamentals.solutions.chapter8.exercise12.graphics.Rectangle;

public class LogoApp {
    public static void main(String[] args) {
        Logo logo = new Logo(new Rectangle(10,20),new Circle(5),"This is the logo app");
        System.out.printf("%.2f\n",logo.getArea());

        Logo logo2 = new Logo("This is the logo app with only text passed to the constructor");
        System.out.printf("%.2f\n",logo2.getArea());

        LogoBis logoBis = new LogoBis(null,null,null);
        System.out.printf("%.2f\n",logoBis.getArea());

        LogoBis logoBis2 = new LogoBis(null,null,null);
        System.out.printf("%.2f\n",logoBis2.getArea());
    }
}
