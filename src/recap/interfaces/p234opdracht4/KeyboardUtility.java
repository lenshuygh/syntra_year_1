package recap.interfaces.p234opdracht4;

import java.util.Scanner;

public interface KeyboardUtility {
    static int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
