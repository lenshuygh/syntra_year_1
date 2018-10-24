package extraexercises.methods;

public class Ex9 {
    public static void main(String[] args) {
        int value1 = 0;
        int value2 = 0;
        int value3 = 0;
        int value4 = 0;
        int value5 = 0;
        int value6 = 0;

        for (int i = 0; i < 1_000_000; i++) {
            switch (UtilityClass.rollDice()) {
                case 1:
                    value1++;
                    break;
                case 2:
                    value2++;
                    break;
                case 3:
                    value3++;
                    break;
                case 4:
                    value4++;
                    break;
                case 5:
                    value5++;
                    break;
                case 6:
                    value6++;
                    break;
            }
        }
        System.out.println("percentage 1's -> " + getPercentageOnMillion(value1) + " %");
        System.out.println("percentage 2's -> " + getPercentageOnMillion(value2) + " %");
        System.out.println("percentage 3's -> " + getPercentageOnMillion(value3) + " %");
        System.out.println("percentage 4's -> " + getPercentageOnMillion(value4) + " %");
        System.out.println("percentage 5's -> " + getPercentageOnMillion(value5) + " %");
        System.out.println("percentage 6's -> " + getPercentageOnMillion(value6) + " %");


    }

    public static float getPercentageOnMillion(int value){
        return value / 10_000F;
    }
}
