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
        int[] assignedReceivers = new int[max];
        for (int i = 0; i < assignedReceivers.length; i++) {
            assignedReceivers[i] = -1;
        }
        int assignedReceiverCounter = 0;
        for (int i = 0; i < cadeauArray.getCadeauArray().length; i++) {
            boolean receiverOk;
            do {
                receiverOk = true;
                int randomReceiverNumber = random.nextInt(max);
                //check if the number was already assigned
                for (int assignedReceiver : assignedReceivers) {
                    if (assignedReceiver == randomReceiverNumber) {
                        receiverOk = false;
                    }
                }
                //check if the number is the same
                if (i == randomReceiverNumber) {
                    //if the last cadeau is left and the last number is the same there's an endless loop of trying to assign it
                    //restart the while if and reassign -1 to the array of found randoms
                    if (i == (max - 1) && (assignedReceivers.length == max) && (receiverOk)) {
                        for (int j = 0; j < assignedReceivers.length; j++) {
                            assignedReceivers[j] = -1;
                        }
                        // assign -1 to i to get the big for i loop to start again from 0
                        // after the 'break' below we exit the do-while
                        // the for-i will be continued, first thing it does is the 'i++' statement
                        // so the first value that i refers to will be 0 now (i++ after i = -1)
                        // assignedReceiverCounter is set to 0 because we start the whole process again
                        i = -1;
                        assignedReceiverCounter = 0;
                        break;
                    }
                    receiverOk = false;
                }
                if (receiverOk) {
                    assignedReceivers[assignedReceiverCounter++] = randomReceiverNumber;
                    // all checks were ok so we can assign a receiver to the current gift
                    // we get the random gift (to use this gift's receiver) by getting the cadeauArray at the random element then
                    // we get the person (to assign to the current gift as receiver) by using the method getPerson on the random gift
                    // the 'person' from the randomly found gift is then set as the receiver in the current gift by the method
                    // 'setReceiver' this method sends the 'person' and index to the cadeauArray-class to set
                    // the random person as a receiver for the gist at the specified index
                    cadeauArray.setReceiver(cadeauArray.getCadeauArray()[randomReceiverNumber].getPerson(), i);
                }
            } while (!receiverOk);


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
