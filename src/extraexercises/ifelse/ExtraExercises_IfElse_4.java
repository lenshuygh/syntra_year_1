package extraexercises.ifelse;

import java.util.Scanner;

public class ExtraExercises_IfElse_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Number2 : ");
        int num2 = scanner.nextInt();
        System.out.print("Number3 : ");
        int num3 = scanner.nextInt();
        System.out.print("Smallest -> ");
        if ((num1 < num2) && (num1 < num3)) {
            System.out.println(num1);
        }else{
            if((num2 < num1) && (num2 < num3)){
                System.out.println(num2);
            }else{
                System.out.println(num3);
            }
        }

        //teacher
        /*
        if((num1 < num2) && (num1 <  num3)){

        }
        */
        scanner.close();

        /* bubbleSort

        int[] nums = {num1,num2,num3};

        int smallest = nums[i];
        for(int i = 0;i <= 3;i++){

        }
         */
    }
}
