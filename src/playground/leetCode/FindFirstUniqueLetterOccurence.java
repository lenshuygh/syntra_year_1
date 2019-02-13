package playground.leetCode;

public class FindFirstUniqueLetterOccurence {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aadadaad"));
    }

    public static int firstUniqChar(String s) {
        char[] found = new char[s.length()];
        int foundCounter = 0;
        if(s.length() > 0){}
        char c;
        for(int i = 0;i<s.length();i++){
            c = s.charAt(i);
            boolean unique = true;
            for (char c1 : found) {
                if (c1 == c){
                    unique = false;
                    continue;
                }
            }
            System.out.println(c);
            for(int j = i + 1;j < s.length();j++){
                char c2 = s.charAt(j);
                System.out.println("Checking -> " + c2);
                if(c == c2){
                    System.out.println("MATCH");
                    //add to found array of chars, but check if it isn't there already
                    boolean addChar = true;
                    for (char c1 : found) {
                        if(c2 == c1){
                            addChar = false;
                            break;
                        }
                    }
                    if(addChar) {
                        found[foundCounter++] = c2;
                    }
                    unique = false;
                }
            }
            if (unique){
                return i;
            }
        }
        return -1;
    }
}

