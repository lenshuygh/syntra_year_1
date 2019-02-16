package playground.leetCode;

public class FindFirstUniqueLetterOccurence {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aadadaad"));
        System.out.println(firstUniqChar("teetcode"));
/*        String a = "testje";
        System.out.println(a.indexOf("t"));
        StringBuilder sb = new StringBuilder(a);
        System.out.println("first: " + sb.indexOf("e"));
        System.out.println("last: " + sb.lastIndexOf("e"));*/
    }

    public static int firstUniqChar(String s) {
            char[] chars = s.toCharArray();
            for (char aChar : s.toCharArray()) {
                if(s.indexOf(aChar) == s.lastIndexOf(aChar)){
                    return s.indexOf(aChar);
                }
            }
        return -1;

    }
}

