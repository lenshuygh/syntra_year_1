package p170opdracht11;

import static java.lang.Math.PI;
import static java.lang.Math.toDegrees;

public class Opdracht11 {
    public static void main(String[] args) {
        for (double i = 0; i < PI*2; i += 0.1f) {
            System.out.println("cosine: " + Math.cos(i));
            System.out.println("angle in degrees: " + toDegrees(i));
        }
    }

}
