package extraexercises.arrays.extra_05_12_18;
/*
new int[]{5, 6, 8}
new int[]{9,12,20,5103,3513,513,1,3,81,7,33}
new int[]{9,12,20,8,9}

Maak een methode dat een x-aantal arrays combineert naar 1 array. Deze methode geeft de nieuwe Array terug.
Zorg ervoor dat in deze nieuwe array de waarden van alle arrays in zitten. De array mag niet groter zijn dan
het aantal elementen! Voor deze oefening hoef je geen rekening te houden met eventuele default waarden van een int
 */
public class Oefening2 {
    public static void main(String[] args) {
        int[] arrA ={5, 6, 8};
        int[] arrB ={9,12,20,5103,3513,513,1,3,81,7,33};
        int[] arrC ={9,12,20,8,9};

        int combinedLength = 0;
        combinedLength = getCombinedLength(arrA,arrB,arrC);

        int[] combinedArray = new int[combinedLength];

        System.out.println(combinedLength);

        combinedArray = combineArrays(combinedLength,arrA,arrB,arrC);

        for (int i : combinedArray) {
            System.out.print(i+",");
        }
    }

    private static int getCombinedLength(int[] ... arrays) {
        int counter = 0;
        for (int[] array : arrays) {
            counter+=array.length;
        }
        return counter;
    }

    private static int[] combineArrays(int size,int[] ... arrays) {
        int[] combinedArray = new int[size];
        int i = 0;
        for (int[] array : arrays) {
            for (int j : array) {
                combinedArray[i++] = j;
            }
        }
        return combinedArray;
    }
}
