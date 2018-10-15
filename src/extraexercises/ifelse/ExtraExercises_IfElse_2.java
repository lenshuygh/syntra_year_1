package extraexercises.ifelse;

import java.util.Scanner;

public class ExtraExercises_IfElse_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number (50-99) : ");
        int num = scanner.nextInt();
        if((num >= 50) && (num < 100)){
            System.out.println("OK");
        }else{
            System.out.println("NOT OK");
        }
        scanner.close();
    }
}
