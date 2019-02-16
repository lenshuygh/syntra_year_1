package playground.codewars;

public class WichAreIn {

    public static void main(String[] args) {
        String r[] = new String[] { "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] sArr = inArray(b,r);
    }

    public static String[] inArray(String[] b, String[] r) {
        String[] newArr = new String[r.length];
        for (String s : b) {
            for (String s1 : r) {
                if(s.contains(s1)){

                }
            }
        }
        return newArr;
    }
}
