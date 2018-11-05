package extraexercises.methods2;
//Extra Method Oefeningen.pdf
public class UtilityClass {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int mb = kiloBytes / 1024;
        int kb = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
    }

    public static boolean bark(boolean barking, int hourOfTheDay) {
        if ((!barking) || (hourOfTheDay < 0) || (hourOfTheDay > 23)){
            return false;
        }else if ((hourOfTheDay < 8) || (hourOfTheDay > 22)){
            return true;
        }
        return false;
    }

    public static boolean isLeapYear(int year) {
        if((year > 0) && (year < 9999)){
            if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
                return true;
            }
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double v1, double v2) {
        v1 *=1000;
        v2 *=1000;
        double difference =  v1 - v2;
        difference = (difference < 0) ? difference *= -1 : difference;
        return (difference < 1 );
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        return (a + b == c);
    }
}
