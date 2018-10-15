package p82;

import java.util.Scanner;

public class Opdracht14a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter age: ");

        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("you're an adult");
        }
        else if (age >= 10){
            System.out.println("teenager");
        }
        else if (age >= 2){
            System.out.println("child");
        }
        else {
            System.out.println("You're a baby");
        }
        scanner.close();
    }
}
