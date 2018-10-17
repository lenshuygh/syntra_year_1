package p94opdracht17;

public class C_powersOf11SmallerThan100000 {
    public static void main(String[] args) {
        //my solution has 1 less result !!!!
        /*int pow = 1;
        for (int i = 0;pow<100_000;i++){
            for (int j = 0; j < i; j++) {
                pow *= 11;
            }
            System.out.println((pow<100_000) ? pow : "");
        }*/

        //teacher solution
        for (int i = 1; i < 100_000; i*=11) {
            System.out.println(i);
        }
    }
}
