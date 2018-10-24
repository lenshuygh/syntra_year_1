package p101opdracht18;

public class Opdracht18p101Methods {
    public static void main(String[] args) {
        System.out.print("Enter your length (cm): ");
        int height = KeyboardUtility.readInt();
        System.out.print("Enter your weigth (kg): ");
        int weight = KeyboardUtility.readInt();
        float bmi = BmiUtility.calculateBmi(weight,height);
        BmiUtility.printDiagnose(bmi);

    }
}
