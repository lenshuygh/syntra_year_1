package year1.javafundamentals.solutions.chapter6.exercise5;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class MeterToFeetApp {
    //1 meter = 3,2808399 feet
    public static void main(String[] args) {
        for (float meter = 1; meter <= 20; meter += 0.5F) {
            float feet = meter * 3.2808399F;
            System.out.printf("%-5.2f meter is %-5.2f feet %n", meter, feet);
        }
    }
}
