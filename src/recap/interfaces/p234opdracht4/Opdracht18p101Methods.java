package recap.interfaces.p234opdracht4;

import p101opdracht18.BmiUtility;
import p101opdracht18.KeyboardUtility;

public interface Opdracht18p101Methods {
    static void main(String[] args) {
        System.out.print("Enter your length (cm): ");
        int height = KeyboardUtility.readInt();
        System.out.print("Enter your weigth (kg): ");
        int weight = KeyboardUtility.readInt();
        float bmi = BmiUtility.calculateBmi(weight,height);
        BmiUtility.printDiagnose(bmi);

    }
}
