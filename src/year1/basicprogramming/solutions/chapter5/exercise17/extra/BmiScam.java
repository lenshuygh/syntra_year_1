package year1.basicprogramming.solutions.chapter5.exercise17.extra;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 22/10/2018.
 */
public class BmiScam {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int agePerson1, agePerson2, agePerson3;
        String namePerson1 = "", namePerson2 = "", namePerson3 = "";
        float weightPerson1, weightPerson2, weightPerson3;
        float lengthPerson1, lengthPerson2, lengthPerson3;
        float bmiPerson1 = 0, bmiPerson2 = 0, bmiPerson3 = 0;

        for(int i = 0; i < 3; i++) {
            int age;
            String name;
            float weight;
            float length;
            float bmi;

            System.out.println("Geef de leeftijd: ");
            age = keyboard.nextInt();
            while (age < 18) {
                System.out.println("Deze app werkt enkel voor personen ouder dan 18!");
                System.out.println("Geef de leeftijd:");
                age = keyboard.nextInt();
            }

            System.out.println("Geef de naam: ");
            keyboard.nextLine();
            name = keyboard.nextLine();

            System.out.println("Geef het gewicht: ");
            weight = keyboard.nextFloat();

            System.out.println("Geef het lengte: ");
            length = keyboard.nextFloat();

            bmi = weight / (length * length);

            if (age >= 50) {
                bmi *= 1.1F;
            } else if (age >= 30) {
                bmi *= 1.05F;
            }

            switch (i){
                case 0:
                    agePerson1 = age;
                    namePerson1 = name;
                    weightPerson1 = weight;
                    lengthPerson1 = length;
                    bmiPerson1 = bmi;
                    break;
                case 1:
                    agePerson2 = age;
                    namePerson2 = name;
                    weightPerson2 = weight;
                    lengthPerson2 = length;
                    bmiPerson2 = bmi;
                    break;
                case 2:
                    agePerson3 = age;
                    namePerson3 = name;
                    weightPerson3 = weight;
                    lengthPerson3 = length;
                    bmiPerson3 = bmi;
                    break;
            }
        }

        System.out.println(namePerson1 + " " + bmiPerson1);
        System.out.println(namePerson2 + " " + bmiPerson2);
        System.out.println(namePerson3 + " " + bmiPerson3);

        String winnerName;
        if(bmiPerson1 < bmiPerson2 && bmiPerson1 < bmiPerson3){
            winnerName = namePerson1;
        } else if(bmiPerson2 < bmiPerson3) {
            winnerName = namePerson2;
        } else {
            winnerName = namePerson3;
        }
        System.out.println("Proficiat " + winnerName + " u hebt 15% korting gewonnen!");

    }
}
