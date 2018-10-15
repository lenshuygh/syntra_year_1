package p82;

import java.util.Scanner;

public class Opdracht14b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("gewicht: ");
        int gewicht = scanner.nextInt();
        //System.out.println();
        System.out.print("Lengte (in m.): ");
        double lengte = scanner.nextDouble();
        System.out.println();

        double bmi = gewicht / (lengte * lengte);
        /*
        teacher solution

        float length = scanner.nextFloat();
        float bmi = gewich / (length * length)

         */
        String result;
        if(bmi < 20){
            result = " ondergewicht";
        }else if (bmi < 25){
            result = " ok";
        }else if (bmi < 30){
            result = " overgewicht";
        }else if (bmi < 40){
            result = " obesitas";
        }else{
            result = " don't ask";
        }
        System.out.println(bmi +" => " + result);
    }
}
