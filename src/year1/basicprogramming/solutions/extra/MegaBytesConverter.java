package year1.basicprogramming.solutions.extra;

/**
 * Created by JonathanSyntra on 29/10/2018.
 */
public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value!");
        } else {
            int kiloBytesToMegaByteRatio = 1024;
            System.out.println(kiloBytes + " KB = " + kiloBytes/kiloBytesToMegaByteRatio
                    + " MB and " + kiloBytes%kiloBytesToMegaByteRatio + " KB");
        }
    }
}
