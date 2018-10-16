package year1.basicprogramming.solutions.chapter5.exercise14;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 15/10/2016.
 *
 * Weight in kg and Length in m
 * BMI calculation = Weight / (Length * Length)
 */
public class BMI {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your weight:");
        int weight = keyboard.nextInt();
        keyboard.reset();

        System.out.println("Enter your length:");
        float length = keyboard.nextFloat();
        keyboard.reset();

        float bmi = weight/(length * length);

        if(bmi > 40){
            System.out.println("Extreem overgewicht");
        } else if (bmi >= 30) {
            System.out.println("Obesitas");
        } else if (bmi >= 25){
            System.out.println("Overgewicht");
        } else if (bmi >= 20){
            System.out.println("OK");
        } else {
            System.out.println("Ondergewicht");
        }
        System.out.println("Het BMI is " + bmi);

        keyboard.close();
    }
}
