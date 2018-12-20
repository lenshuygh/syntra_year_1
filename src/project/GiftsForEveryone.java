package project;

import java.util.Random;
import java.util.Scanner;

public class GiftsForEveryone {
    public static void main(String[] args) {
        CadeauArray cadeauArray = new CadeauArray();

        addGift(cadeauArray);

        shuffleGifts(cadeauArray);

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

    private static void shuffleGifts(CadeauArray cadeauArray) {
        int max = cadeauArray.getSize();
        Random random = new Random();
        Cadeau[] giftsWithReceiver = new Cadeau[max];
        for (int i = 0; i < cadeauArray.getCadeauArray().length; i++) {
            Cadeau cadeauInNeedOfReceiver = cadeauArray.getCadeauArray()[i];
            boolean giftOK = false;
            int c = 0;
            do{
                Cadeau randomGift = cadeauArray.getCadeauArray()[random.nextInt(max)];
                System.out.println();
                System.out.println(cadeauInNeedOfReceiver.getGift());
                System.out.println("---------------------");
                System.out.println("trying for -> " + randomGift.getGift());
                if(randomGift.getReceiver() != null){
                    System.out.println(randomGift.getGift() +" already given");
                    continue;
                }
                if(cadeauInNeedOfReceiver.getGiver().equalsIgnoreCase(randomGift.getGiver())){
                    System.out.println("giver = giver");
                    continue;
                }
                giftOK = true;
                if(giftOK){
                    cadeauArray.setReceiver(randomGift.getGiver(),i);
                }
                System.out.println('#'+(c++));
            } while(!giftOK);
        }
    }

    private static void printGifts(CadeauArray cadeauArray) {
        for (Cadeau cadeau : cadeauArray.getCadeauArray()) {
            System.out.print(cadeau.getGiver());
            System.out.print(" gifts ");
            System.out.print(cadeau.getGift());
            System.out.println(" to " + cadeau.getReceiver());
        }
    }
}
