package p234opdracht4;

public interface BmiApplication {
    static void main(String[] args) {
        System.out.println("Enter your length (cm):");
        int length = KeyboardUtility.readInt();
        System.out.println("Enter your weight (kg):");
        int weight = KeyboardUtility.readInt();
        float bmi = BmiUtility.calculateBmi(length, weight);
        BmiUtility.printDiagnose(bmi);
    }
}
