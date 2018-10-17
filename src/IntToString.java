import java.util.Arrays;
import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        //absolute value of number
        number *= (number > 0) ? 1 : -1;

        // 1 how many digits has the number?

        int digits = 1;
        while(true){
            int compareTo = (int) Math.pow(10,digits);
            if (number + 1 > compareTo) {
                digits++;
            }else {
                break;
            }
        }
        System.out.println("number of digits for " + number + " : " + digits);

        // make an array of the digits
        int[] digitArray = new int[digits];
        int rest = 0;
        int arrayPosition = 0;
        int tempNum = number;
        for(int i = digits-1;i>=0;i--){
            System.out.println("i = " + i);
            int divider = (int) Math.pow(10,i);
            System.out.println("divider = " + divider);
            digitArray[arrayPosition] = tempNum / divider;
            rest = tempNum % divider;
            System.out.println("rest -> " + rest);
            tempNum = tempNum - (digitArray[arrayPosition] * divider);
            arrayPosition++;
        }
        System.out.println("array -> " + Arrays.toString(digitArray));

        System.out.println("----------------");
        //better digits to array
        int[] intArray = new int[digits];
        int arrayPos = 0;
        for(int i = digits -1;i>=0;i--){
            int pow = (int) Math.pow(10, i);
            intArray[arrayPos] = number / pow;
            number = number - (intArray[arrayPos] * pow);
            arrayPos++;
        }
        System.out.println("array of ints: "+ Arrays.toString(intArray));


        System.out.println("-----------------");

        // use array of strings to match values using the index of the array, can be done using ASCII table too
        String[] stringArray = {"0","1","2","3","4","5","6","7","8","9"};
        String result = "";
        for(int i = 0;i<digits;i++){
            result += stringArray[digitArray[i]];
        }
        System.out.println("type of result -> " + result.getClass());
        System.out.println("result -> " + result);

    }
}
