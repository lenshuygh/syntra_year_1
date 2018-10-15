package p86opdracht15;

import java.util.Scanner;

public class Opdracht15_A {
    public static void main(String[] args) {

        int month;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter month: ");
            month = scanner.nextInt();
            if(month == 0){
                break;
            }
            int days = 0;

            switch (month) {
                default:
                    days = 0;
                    break;
                case 2:
                    days = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;

            }
            System.out.println("days -> " + days);
        }
    }
}
