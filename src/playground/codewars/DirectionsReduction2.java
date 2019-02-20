package playground.codewars;

public class DirectionsReduction2 {
    public static void main(String[] args) {
        String[] strings = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        for (String s : dirReduc(strings)) {
            System.out.println(s);
        }
    }

    public static String[] dirReduc(String[] arr) {
        int originalLength = arr.length;
        int newLength = 0;
        String[] strArray = arr;
        while(originalLength != newLength){
            originalLength = strArray.length;
            strArray = redStrings(strArray);
            newLength = strArray.length;
        }
        return strArray;
    }

    private static String[] redStrings(String[] arr) {
        int outCount = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            switch (arr[i]){
                case "NORTH":
                    outCount = findDirectionToNull(arr, i, "SOUTH",outCount);
                    break;
                case "EAST":
                    outCount = findDirectionToNull(arr, i, "WEST",outCount);
                    break;
                case "SOUTH":
                    outCount = findDirectionToNull(arr, i, "NORTH",outCount);
                    break;
                case "WEST":
                    outCount = findDirectionToNull(arr, i, "EAST",outCount);
                    break;
            }
        }
        String[] out = new String[outCount];
        int count = 0;
        for (String s : arr) {
            if(!s.equals("null")){
                out[count++] = s;
            }
        }
        return out;
    }

    private static int findDirectionToNull(String[] arr, int i, String direction,int outCount) {
        if(arr[i+1].equals(direction)){
            arr[i] = "null";
            arr[i+1] = "null";
            outCount -= 2;
        }
        return outCount;
    }
}


/*
"\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\""
 */