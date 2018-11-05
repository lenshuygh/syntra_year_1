import java.util.Arrays;
import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int numberAlternative = number;

        //absolute value of number
        number *= (number > 0) ? 1 : -1;

        // 1. how many digits has the number?

        // with Math.pow();
        int digits = 1;
        while(true){
            int compareTo = (int) Math.pow(10,digits);
            if (number + 1 > compareTo) {
                digits++;
            }else {
                break;
            }
        }

        // without Math.pow();
        int digitsAlternative = 0;
        for (int i = 1; i < number; i*=10) {
            if(number > i){
                digitsAlternative++;
            }
        }
        System.out.println("digitsAlternative: " + digitsAlternative);


        System.out.println("number of digits for " + number + " : " + digits);

        // 2. make an array of the digits

        // with Math.pow()
        int[] digitArray = new int[digits];
        int arrayPos = 0;
        for(int i = digits -1;i>=0;i--){
            int pow = (int) Math.pow(10, i);
            digitArray[arrayPos] = number / pow;
            number = number - (digitArray[arrayPos] * pow);
            arrayPos++;
        }

        // without Math.pow()
        int[] digitArrayAlternative = new int[digitsAlternative];
        int arrayIndex = 0;
        for (int i = digitsAlternative; i >= 0; i--) {
            int powAlternative = 0;
            for (int j = 1; j < i; j*=10) {
                powAlternative = j;
                System.out.println("powAlternative (i="+i+")(j="+j+"): "+powAlternative);
            }
            System.out.println(numberAlternative + " / " + powAlternative);
            digitArrayAlternative[arrayIndex] = numberAlternative / powAlternative;
            numberAlternative = numberAlternative - (digitArrayAlternative[arrayIndex] * powAlternative);
            arrayIndex++;
        }
        System.out.println("alt array -> " + Arrays.toString(digitArrayAlternative));



        // 3. use array of strings to match values using the index of the array, can be done using ASCII table too
        String[] stringArray = {"0","1","2","3","4","5","6","7","8","9"};
        String result = "";
        for(int i = 0;i<digits;i++){
            result += stringArray[digitArray[i]];
        }
        System.out.println("type of result -> " + result.getClass());
        System.out.println("result -> " + result);

    }
}
