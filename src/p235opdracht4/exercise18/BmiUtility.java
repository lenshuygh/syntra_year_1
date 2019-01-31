package p235opdracht4.exercise18;

public interface BmiUtility {
    default float calculateBmi(int length, int weight){
        float lengthToMeter = (float)length / 100;
        return weight/(lengthToMeter * lengthToMeter);
    }

    default void printDiagnose(float bmi){
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
