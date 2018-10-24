package p101opdracht18;

public class BmiUtility {
    public static float calculateBmi(int weight, int height) {
        float length = height / 100F;
        return weight / (length * length);
    }

    public static void printDiagnose(float bmi) {
        System.out.println("The BMI is " + bmi);
    }
}
