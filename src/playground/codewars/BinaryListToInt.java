package playground.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryListToInt {
    public static void main(String[] args) {
        System.out.println(convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
        System.out.println(conv(new ArrayList<>(Arrays.asList(1,1,1,1))));
    }

    public static int convertBinaryArrayToInt(List<Integer> binary) {
        int out = 0;
        int pow = 0;
        for(int i = binary.size()-1;i>=0;i--){
            int bit = binary.get(i);
            if(bit !=0) {
                out += Math.pow(2, pow);
            }
            pow++;
        }
        return out;
    }

    public static int conv(List<Integer> binary){
        String out = "";
        for (Integer integer : binary) {
            out+=integer;
        }
        return Integer.parseInt(out,2);
    }
}
