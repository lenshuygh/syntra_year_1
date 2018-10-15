package extraexercises.ifelse;

import java.util.Scanner;

public class ExtraExercises_IfElse_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();
        if(num1 == num2){
            System.out.println("EQUAL");
        }else{
            System.out.println("NOT EQUAL");
        }

        //teacher
        //System.out.println(num1 == num2 ? "equal" : "not equal");

        scanner.close();
    }
}
