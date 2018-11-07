package year1.basicprogramming.solutions.chapter5.exercise18;

/**
 * Created by JonathanSyntra on 23/10/2016.
 */
public class BmiUtility {
    public static float calculateBmi(int length, int weight){
        float lengthToMeter = (float)length / 100;
        return weight/(lengthToMeter * lengthToMeter);
    }

    public static void printDiagnose(float bmi){
        if(bmi > 40){
            System.out.println("Extreem overgewicht");
        } else if (bmi >= 30) {
            System.out.println("Obesitas");
        } else if (bmi >= 25){
            System.out.println("Overgewicht");
        } else if (bmi >= 20){
            System.out.println("OK");
        } else {
            System.out.println("Ondergewicht");
        }
    }
}
