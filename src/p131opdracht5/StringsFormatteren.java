package p131opdracht5;

public class StringsFormatteren {
    public static void main(String[] args) {
        final float VOET = 3.2808399F;
        float ft = 0F;
        for (float i = 1; i <= 20; i+=0.5) {
            ft = i + VOET;
            System.out.printf("%5.2f meter = %5.2f feet%n",i,ft);
        }
    }
}
