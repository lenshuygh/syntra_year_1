package simpler_project;

import java.util.Random;
import java.util.Scanner;

public class GiftsForEveryOne {
    static Cadeau[] cadeauArray = new Cadeau[3];

    public static void main(String[] args) {
        enterNamesAndGifts();
        //shuffleCadeaus_Without_Controls();
        //shuffleCadeaus_With1control();
        //shuffleCadeaus_With2controls();
        shuffleCadeaus_WithAllControls();
        printCadeaus();
    }

    private static void enterNamesAndGifts() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < cadeauArray.length) {
            System.out.print("Give your name; ");
            String buyer = scanner.nextLine();
            System.out.print("What did you buy: ");
            String gift = scanner.nextLine();
            System.out.println("***********************");
            Cadeau cadeau = new Cadeau(buyer, gift);
            cadeauArray[counter] = cadeau;
            counter++;
        }
        scanner.close();
    }

    public static void printCadeaus() {
        for (Cadeau cadeau : cadeauArray) {
            String buyer = cadeau.getBuyer();
            String gift = cadeau.getGift();
            String receiver = cadeau.getReceiver();
            System.out.println(buyer + " gives " + gift + " to " + receiver);
        }
    }

    public static void shuffleCadeaus_Without_Controls() {
        int maxRandom = cadeauArray.length;
        Random random = new Random();
        for (int i = 0; i < cadeauArray.length; i++) {
            int myRandom = random.nextInt(maxRandom);
            Cadeau cadeauFromWichToGetPerson = cadeauArray[myRandom];
            String receiver = cadeauFromWichToGetPerson.getBuyer();
            cadeauArray[i].setReceiver(receiver);
        }
    }

    public static void shuffleCadeaus_With1control() {
        int maxRandom = cadeauArray.length;
        Random random = new Random();
        int[] usedRandomArray = new int[cadeauArray.length];
        //set all values to -1 otherwise they are 0 and we need to be able to check if a value here is not 0
        // don't use a for-each to assign values to an array, this doesn't work
        for (int i = 0; i < usedRandomArray.length; i++) {
            usedRandomArray[i] = -1;
        }
        int usedRandomArrayCounter = 0;
        for (int i = 0; i < cadeauArray.length; i++) {
            //find a good randomNumber that is not in the usedRandomArray
            boolean randomNumberIsAlreadyUsed = true;
            int myRandom = -1;
            while (randomNumberIsAlreadyUsed) {
                randomNumberIsAlreadyUsed = false;
                myRandom = random.nextInt(maxRandom);
                for (int usedRandomNumber : usedRandomArray) {
                    if (myRandom == usedRandomNumber) {
                        randomNumberIsAlreadyUsed = true;
                        break;
                    }
                }
            }
            // found a good randomNumber that was not used already, so we put it in the array of used numbers
            // and we use its buyer and assign that as a receiver
            usedRandomArray[usedRandomArrayCounter++] = myRandom;
            String foundReceiver = cadeauArray[myRandom].getBuyer();
            cadeauArray[i].setReceiver(foundReceiver);
        }
    }

    public static void shuffleCadeaus_With2controls() {
        int maxRandom = cadeauArray.length;
        Random random = new Random();
        int[] usedRandomArray = new int[cadeauArray.length];
        //set all values to -1 otherwise they are 0 and we need to be able to check if a value here is not 0
        // don't use a for-each to assign values to an array, this doesn't work
        for (int i = 0; i < usedRandomArray.length; i++) {
            usedRandomArray[i] = -1;
        }
        int usedRandomArrayCounter = 0;
        for (int i = 0; i < cadeauArray.length; i++) {

            boolean randomNumberIsAlreadyUsed = true;
            boolean randomNumberIsSameAsIndex = true;
            int myRandom = -1;

            //find a good randomNumber
            while (randomNumberIsAlreadyUsed || randomNumberIsSameAsIndex) {
                randomNumberIsAlreadyUsed = false;
                myRandom = random.nextInt(maxRandom);

                // check if the random is not the same as the current index
                // can not give the gift to yourself
                // of it is different we go to the next check
                if (myRandom != i) {
                    randomNumberIsSameAsIndex = false;
                    //check if it is already used
                    for (int usedRandomNumber : usedRandomArray) {
                        if (myRandom == usedRandomNumber) {
                            randomNumberIsAlreadyUsed = true;
                            break;
                        }
                    }
                }else{
                    randomNumberIsSameAsIndex = true;
                }
            }
            // found a good randomNumber that was not used already, so we put it in the array of used numbers
            // and we use its buyer and assign that as a receiver
            usedRandomArray[usedRandomArrayCounter++] = myRandom;
            String foundReceiver = cadeauArray[myRandom].getBuyer();
            cadeauArray[i].setReceiver(foundReceiver);
        }
    }

    public static void shuffleCadeaus_WithAllControls() {
        int maxRandom = cadeauArray.length;
        Random random = new Random();
        int[] usedRandomArray = new int[cadeauArray.length];
        //set all values to -1 otherwise they are 0 and we need to be able to check if a value here is not 0
        // don't use a for-each to assign values to an array, this doesn't work
        for (int i = 0; i < usedRandomArray.length; i++) {
            usedRandomArray[i] = -1;
        }
        int usedRandomArrayCounter = 0;
        for (int i = 0; i < cadeauArray.length; i++) {

            boolean randomNumberIsAlreadyUsed = true;
            boolean randomNumberIsSameAsIndex = true;
            int myRandom = -1;

            //find a good randomNumber
            while (randomNumberIsAlreadyUsed || randomNumberIsSameAsIndex) {
                randomNumberIsAlreadyUsed = false;
                myRandom = random.nextInt(maxRandom);

                // check if the random is not the same as the current index
                // can not give the gift to yourself
                // of it is different we go to the next check

                // EXTRA: if it is the last element and it is the same there would be an infinite loop
                if (myRandom != i) {
                    randomNumberIsSameAsIndex = false;
                    //check if it is already used
                    for (int usedRandomNumber : usedRandomArray) {
                        if (myRandom == usedRandomNumber) {
                            randomNumberIsAlreadyUsed = true;
                            break;
                        }
                    }
                }else{
                    if(usedRandomArrayCounter == maxRandom - 1) {
                        System.out.println("*****************loop***************");
                    }
                    randomNumberIsSameAsIndex = true;
                }
            }
            // found a good randomNumber that was not used already, so we put it in the array of used numbers
            // and we use its buyer and assign that as a receiver
            usedRandomArray[usedRandomArrayCounter++] = myRandom;
            String foundReceiver = cadeauArray[myRandom].getBuyer();
            cadeauArray[i].setReceiver(foundReceiver);
        }
    }
}
