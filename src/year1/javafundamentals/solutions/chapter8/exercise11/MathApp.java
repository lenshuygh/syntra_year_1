package year1.javafundamentals.solutions.chapter8.exercise11;

import static java.lang.Math.*;

/**
 * Created by JonathanSyntra on 14/01/2017.
 */
public class MathApp {
    public static void main(String[] args) {
        for(float i = 0; i < 2*PI; i += 0.1f){
            System.out.println("Radian: " + i + " degrees: " + toDegrees(i) + " cosinus: " + cos(i));
        }
    }
}
