package extraexercises.ProjectEurlerDotNet;

public class Problem09_SpecialPythagoreanTriplet {
    /*
        A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
        a² + b² = c²

        For example, 3² + 4² = 9 + 16 = 25 = 5².

        There exists exactly one Pythagorean triplet for which a + b + c = 1000.
        Find the product abc.
     */

    public static void main(String[] args) {
        // a + b + c = 1000 AND a < b < c
        for (int c = 997; c > 3 ; c--) {
            for (int b = c; b > 2 ; b--) {
                for (int a = b; a > 1; a--) {
                    if(((a < b)&&(b<c)) && ((a + b + c) == 1000)&&(checkTriplet(a,b,c))){
                        System.out.println("candidates -> a:" + a + ",b:" + b + ",c:"+c);
                        System.out.println("product abc: " + a*b*c);
                    }
                }
            }
        }
    }

    private static boolean checkTriplet(int a, int b, int c) {
        return (a*a) + (b*b) == (c*c);
    }

    private static int getRoot(int i) {
        return (int) Math.sqrt(i);
    }
}
