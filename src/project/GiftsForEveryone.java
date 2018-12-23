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
        int giftsGiven = 0;
        for (int i = 0; i < cadeauArray.getCadeauArray().length; i++) {
            boolean readyToGive = true;
            System.out.println("current cadeau that needs a receiver : ");
            System.out.println(cadeauArray.getCadeauArray()[i]);
            System.out.println("*****************************");
            int loopCount = 0;
            do {
                readyToGive = true;
                loopCount++;
                //get a random cadeau to use its 'person' and set it into the current cadeau as receiver
                int randomIndex = random.nextInt(max);
                Cadeau randomCadeauToUseItsPerson = cadeauArray.getCadeauAtIndex(randomIndex);
                System.out.println("    trying cadeau -> ");
                System.out.println("    " + randomCadeauToUseItsPerson);
                System.out.println("    -----------------------------");
                //check if the random cadeau's person we got isn't the person of the current cadeau
                if (cadeauArray.getCadeauArray()[i].getPerson().equalsIgnoreCase(randomCadeauToUseItsPerson.getPerson())) {
                    System.out.println("    same cadeau");
                    readyToGive = false;
                    System.out.println("loopCount: " + loopCount);
                    //if the last cadeau is the last one to get a receiver we get an infinite loop
                    if ((giftsGiven == i) && (i == (max - 1)) && (loopCount > max * 3)) {
                        System.out.println("----- INFINILOOP ------");
                        //go back a step in to for-i loop
                        //unassign that gift
                        //try from here again
                        i--;
                        cadeauArray.getCadeauArray()[i].setReceiver("");
                        i--;
                        break;
                    }
                }
                //check if receiver is already assigned to a cadeau
                if (cadeauArray.checkIfReceiverWasUsed(randomCadeauToUseItsPerson)) {
                    System.out.println("    person is already a receiver");
                    readyToGive = false;
                }

                if (readyToGive) {
                    giftsGiven++;
                    loopCount = 0;
                    System.out.println("\nOK TO GIVE\n");
                    cadeauArray.setReceiver(randomCadeauToUseItsPerson.getPerson(), i);
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } while (!readyToGive);
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
