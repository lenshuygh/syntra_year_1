package year1.javafoundations.solutions.chapter13.exercise4;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 23/10/2016.
 */
public interface KeyboardUtility {
    static int readInt(){
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }
}
