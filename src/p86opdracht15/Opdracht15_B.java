package p86opdracht15;

import java.io.IOException;

public class Opdracht15_B {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.print("Enter character: ");
            char c = (char) System.in.read();
            System.out.println();
            if (c == '0') {
                break;
            }
            int value = 0;

            switch (c) {
                case 'A':
                case 'E':
                case 'I':
                case 'L':
                case 'N':
                case 'O':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                    value = 1;
                    break;

                case 'D':
                case 'G':
                    value = 2;
                    break;

                case 'B':
                case 'C':
                case 'M':
                case 'P':
                    value = 3;
                    break;

                case 'F':
                case 'H':
                case 'V':
                case 'W':
                case 'Y':
                    value = 4;
                    break;

                case 'K':
                    value = 5;
                    break;

                case 'J':
                case 'X':
                    value = 8;
                    break;
                case 'Q':
                case 'Z':
                    value = 10;
                    break;
                default:
                    break;

            }
            System.out.println("value -> " + value);

        }
    }
}

