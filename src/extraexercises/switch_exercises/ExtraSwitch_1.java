package extraexercises.switch_exercises;

import java.util.Scanner;

public class ExtraSwitch_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("daynumber: ");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("maandag");
                break;
            case 2:
                System.out.println("dinsdag");
                break;
            case 3:
                System.out.println("woensdag");
                break;
            case 4:
                System.out.println("donderdag");
                break;
            case 5:
                System.out.println("vrijdag");
                break;
            case 6:
                System.out.println("zaterdag");
                break;
            case 7:
                System.out.println("zondag");
                break;


        }
    }
}
