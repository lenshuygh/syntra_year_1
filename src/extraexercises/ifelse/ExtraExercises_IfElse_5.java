package extraexercises.ifelse;

import java.util.Scanner;

public class ExtraExercises_IfElse_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Number1 : ");
            int num1 = scanner.nextInt();
            if(num1 == -1){
                break;
            }
            System.out.print("Number2 : ");
            int num2 = scanner.nextInt();
            if(num2 == -1){
                break;
            }


            String out = "Bijna OK";

            if ((num1 <= 2) | (num2 <= 2)) {
                out = "Not OK";
            }else if ((num1 >= 8) | (num2 >= 8)) {
                out = "OK";
            }
            System.out.println("---------");
            System.out.println(out);
            System.out.println("---------");
        }
    }
}

