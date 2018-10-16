package year1.basicprogramming.solutions.chapter5.exercise15;

import java.io.IOException;

/**
 * Created by JonathanSyntra on 17/10/2016.
 */
public class Scrabble {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a character:");
        char c = (char)System.in.read();
        int value = 0;

        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'l':
            case 'n':
            case 'o':
            case 'r':
            case 's':
            case 't':
            case 'u': value = 1; break;
            case 'd':
            case 'g': value = 2; break;
            case 'b':
            case 'c':
            case 'm':
            case 'p': value = 3; break;
            case 'f':
            case 'h':
            case 'v':
            case 'w':
            case 'y': value = 4; break;
            case 'k': value = 5; break;
            case 'j':
            case 'x': value = 8; break;
            case 'q':
            case 'z': value = 10; break;
            default:
                System.out.println("Ongeldige invoer!");
        }

        if(value != 0){
            System.out.println("De waarde van deze letter is: " + value);
        }
    }
}
