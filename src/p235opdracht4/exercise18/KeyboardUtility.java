package p235opdracht4.exercise18;

import java.util.Scanner;

public interface KeyboardUtility {
    default int readInt(){
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }
}
