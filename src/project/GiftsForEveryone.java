package project;

import java.util.Random;
import java.util.Scanner;

public class GiftsForEveryone {
    public static void main(String[] args) {
        CadeauArray cadeauArray = new CadeauArray();

        addGift(cadeauArray);

        assignRandomReceivers(cadeauArray);

        printGifts(cadeauArray);
    }


    private static void addGift(CadeauArray cadeauArray) {


        Scanner keyboard = new Scanner(System.in);
        boolean filledIn = true;
        do {

            System.out.print("What is your name : ");
            String name = keyboard.nextLine();
            if (name.equals("") || (name.equalsIgnoreCase("stop"))) {
                filledIn = false;
            } else {
                System.out.print("What is your present : ");
                String present = keyboard.nextLine();

                Cadeau cadeau = new Cadeau(name, present);
                cadeauArray.addCadeau(cadeau);
            }

        } while (filledIn);
    }

    private static void assignRandomReceivers(CadeauArray cadeauArray) {
        int max = cadeauArray.getSize();
        Random random = new Random();
        for (Cadeau cadeau : cadeauArray.getCadeauArray()) {
            System.out.println(cadeau);

        }
    }

    private static void printGifts(CadeauArray cadeauArray) {
        for (Cadeau cadeau : cadeauArray.getCadeauArray()) {
            System.out.print(cadeau.getPerson());
            System.out.print(" gifts ");
            System.out.print(cadeau.getGift());
            System.out.println(" to " + cadeau.getReceiver());
        }
    }
}
