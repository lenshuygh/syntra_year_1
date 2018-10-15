package extraexercises.ifelse;

import java.util.Scanner;

public class ExtraExercises_IfElse_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Number : ");
            int num = scanner.nextInt();
            if(num == 0){
                break;
            }
            if (num % 2 == 0) {
                System.out.println("EVEN");
            } else {
                System.out.println("oneven");
            }

            //teacher
            //System.out.println(num % 2 == 0 ? "even" : "oneven");
        }
        scanner.close();
    }
}
