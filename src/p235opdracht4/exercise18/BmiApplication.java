package p235opdracht4.exercise18;

public interface BmiApplication {
    default void main(String[] args) {
        System.out.println("Enter your length (cm):");
        int length = KeyboardUtility.readInt();
        System.out.println("Enter your weight (kg):");
        int weight = KeyboardUtility.readInt();
        float bmi = BmiUtility.calculateBmi(length, weight);
        BmiUtility.printDiagnose(bmi);
    }
}
