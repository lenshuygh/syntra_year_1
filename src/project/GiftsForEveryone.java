package project;

import java.util.Scanner;

public class GiftsForEveryone {
    public static void main(String[] args) {
        addGift();
    }

    private static void addGift() {

        CadeauArray cadeauArray = new CadeauArray();
        Scanner keyboard = new Scanner(System.in);
        boolean filledIn = true ;
        do {

            System.out.println("What is your name : ");
            String name = keyboard.nextLine();
            if (name.equals("") || (name.equalsIgnoreCase("stop"))){
                filledIn=false;
            }
            else {
                System.out.println("What is your present : ");
                String present = keyboard.nextLine();

                Cadeau cadeau = new Cadeau(name, present);
                cadeauArray.addCadeau(cadeau);
            }

        } while (filledIn) ;


        for (Cadeau cadeau : cadeauArray.getCadeauArray()) {
            System.out.println(cadeau.getGiver());
        }

        for (Cadeau cadeau : cadeauArray.getCadeauArray()) {
            System.out.println(cadeau.getGiver());
            System.out.println(cadeau.getGift());
        }
    }
}
