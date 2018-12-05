package extraexercises.algoritme_oefening;

public class AlgoritmeOefening {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 12));
        System.out.println(canPack(-3, 2, 12));
        System.out.println();
        System.out.println(canPack(2, 0, 9));
        System.out.println(canPack(1, 5, 9));
        System.out.println(canPack(7, 5, 9));

    }

    private static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        } else {
            while ((goal >= 5)&&(bigCount>0)) {
                goal -= 5;
                bigCount--;
            }
            return (goal<=smallCount);
        }
    }
}
