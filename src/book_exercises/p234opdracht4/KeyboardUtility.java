package book_exercises.p234opdracht4;

import java.util.Scanner;

public interface KeyboardUtility {
    static int readInt(){
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }
}
