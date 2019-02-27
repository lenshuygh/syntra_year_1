package recap.interfaces.p234opdracht4;

public interface BmiUtility {
    static float calculateBmi(int weight, int height) {
        float length = height / 100F;
        return weight / (length * length);
    }

    static void printDiagnose(float bmi) {
        System.out.println("The BMI is " + bmi);
    }
}
