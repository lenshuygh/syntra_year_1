package extraexercises.WhileForOefening_BMI;

import java.util.Scanner;

public class BmiExtraEx {
    public static void main(String[] args) {

        //data input
        Scanner scanner = new Scanner(System.in);

        String name1 = "";
        String name2 = "";
        String name3 = "";

        float bmi1 = 0.0F;
        float bmi2 = 0.0F;
        float bmi3 = 0.0F;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name:");
            String name = scanner.nextLine();
            int age = 0;
            do {
                System.out.print("Enter age: ");
                age = scanner.nextInt();
                if (age < 18) {
                    System.out.println("18+ only !!!! Please enter again...");
                }
            } while (age < 18);
            System.out.print("Enter weight: ");
            int weight = scanner.nextInt();
            System.out.print("Length (in m.): ");
            float length = scanner.nextFloat();
            scanner.nextLine();

            //the BMI
            float bmi = weight / (length * length);

            //the scam
            if (age >= 50) {
                bmi *= 1.1;
            } else if (age >= 30) {
                bmi *= 1.05;
            }

            switch (i) {
                case 0:
                    System.out.println("case 0");
                    name1 = name;
                    bmi1 = bmi;
                    break;
                case 1:
                    System.out.println("case 1");
                    name2 = name;
                    bmi2 = bmi;
                    break;
                case 2:
                    System.out.println("case 2");
                    name3 = name;
                    bmi3 = bmi;
                    break;
            }
        }


        System.out.println(name1 + " ,Bmi: " + bmi1);
        System.out.println(name2 + " ,Bmi: " + bmi2);
        System.out.println(name3 + " ,Bmi: " + bmi3);


        String lowest = "";
        if ((bmi1 < bmi2) && (bmi1 < bmi3)) {
            lowest = name1;
        } else if ((bmi2 < bmi1) && (bmi2 < bmi3)) {
            lowest = name2;
        } else {
            lowest = name3;
        }

        System.out.println(lowest + " ---> 15% off for lowest BMI!!");
        scanner.close();
    }
}
