package year1.javafundamentals.solutions.chapter7.exercise1;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class Sorter {
    public static void main(String[] args) {
        int[] numbers = {4, 1, 6, 2, 9, 10, 3, 5, 7, 8};
        for (int i = 0; i < numbers.length; i++) {
            for(int position = 1; position < numbers.length-i; position++){
                if(numbers[position-1] > numbers[position]){
                    int temp = numbers[position];
                    numbers[position] = numbers[position-1];
                    numbers[position-1] = temp;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
