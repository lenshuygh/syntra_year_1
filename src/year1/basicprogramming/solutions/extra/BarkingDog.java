package year1.basicprogramming.solutions.extra;

/**
 * Created by JonathanSyntra on 29/10/2018.
 */
public class BarkingDog {
    public static void main(String[] args) {
        System.out.println("Should I wake up? true, 19");
        System.out.println(bark(true, 19));
        System.out.println("Should I wake up? false, 23");
        System.out.println(bark(false, 23));
        System.out.println("Should I wake up? true, 7");
        System.out.println(bark(true, 7));
        System.out.println("Should I wake up? true, 25");
        System.out.println(bark(true, 25));
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        /*return barking && hourOfDay >= 0 && hourOfDay <= 23 && (hourOfDay < 8 || hourOfDay > 22);*/
        if(!barking){
            return false;
        } else if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else if(hourOfDay < 8 || hourOfDay > 22){
            return true;
        } else {
            return false;
        }
    }
}
