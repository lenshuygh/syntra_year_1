package extraexercises.arrays.extra_05_12_18;
/*
Oefening 1 Vul een array met 10 getallen. Druk het aantal even getallen en het aantal oneven getallen af. Bereken ook de som en het gemiddelde van de even en oneven getallen af.
 */
public class Oefening1 {
    public static void main(String[] args) {
        int[] arr = {5,8,6,4,8,14,15,24,1,4};

        int evenCount = 0;
        int unevenCount = 0;
        int evenSum = 0;
        int unevenSum = 0;
        double evenAvg = 0d;
        double unevenAvg = 0d;

        for (int i : arr) {
            if (i % 2 == 0){
                evenCount++;
                evenSum+=i;
            }else{
                unevenCount++;
                unevenSum+=i;
            }
        }
        System.out.println("even getallen: " +  evenCount);
        System.out.println("oneven getallen: " +  unevenCount);

        System.out.println("som even getallen: " + evenSum);
        System.out.println("som oneven getallen: " + unevenSum);

        System.out.println("gemiddelde even getallen: " + (evenSum / (double) evenCount));
        System.out.println("gemiddelde oneven getallen: " +(unevenSum / (double) unevenCount
        ));
    }
}
