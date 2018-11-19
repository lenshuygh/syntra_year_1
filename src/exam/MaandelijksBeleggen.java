package exam;

import java.util.Scanner;

public class MaandelijksBeleggen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our monthly savings calculator!");
        System.out.println("For each montly deposit you will have to pay a deposit fee of 4.5%");
        System.out.println("You'll pay a monthly maintenance fee of 0.08% on the total amount saved (including the current months deposit");
        System.out.println("Each year you'll receive an interest rate of 6%");
        System.out.println("How much would you like to save each month?");
        double amount = scanner.nextDouble();

        System.out.println("How many years will you be saving?");
        int years = scanner.nextInt();

        System.out.println("If we save " + amount + " each month for " + years + " years, at the end of all those years we'll have:");
        System.out.println("€"+computeTotalAmount(amount,years));

        scanner.close();
    }

    private static double computeTotalAmount(double amount, int years) {
        final double STARTUP_MULTIPLIER = 0.955F;
        final double MAINTENANCE_FEE_MULTIPLIER = 0.9992F;
        final double YEARLY_INTEREST_MULTIPLIER = 1.06F;

        double capitalSaved = 0F;

        //find amount of months
        int totalMonths = years * 12;

        // calculate for eacht month until totalMoths
        for (int i = 1; i <= totalMonths; i++) {
            //add amount minus instapkost
            capitalSaved += amount * STARTUP_MULTIPLIER;

            //deduct the onderhoudskost from whole capital
            capitalSaved *=  MAINTENANCE_FEE_MULTIPLIER;

            // yearly interst payment if months add up to one year
            if(i % 12 == 0){
                capitalSaved *= YEARLY_INTEREST_MULTIPLIER;
            }
            System.out.println(i+" -> "+capitalSaved);
        }

        return capitalSaved;
    }
}