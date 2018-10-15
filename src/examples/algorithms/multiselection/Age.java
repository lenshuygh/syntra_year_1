package examples.algorithms.multiselection;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
       while (true) {
           System.out.print("Enter age: ");
           int age = scanner.nextInt();
           if (age == 0)
               break;

           if (age >= 18) {
               System.out.println("adult");
           } else {
               if (age >= 10) {
                   System.out.println("Teenager");
               } else {
                   if (age >= 2) {
                       System.out.println("Child");
                   } else {
                       System.out.println("Baby");
                   }
               }
           }
       }
    }
}
