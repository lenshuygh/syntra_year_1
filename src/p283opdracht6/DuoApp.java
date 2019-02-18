package p283opdracht6;

import p272opdracht1.Duo;

public class DuoApp {
    public static void main(String[] args) {
        Duo<String> stringDuo = new Duo<>("One","Two");
        Duo<String> stringDuo1 = new Duo<>("Three","Four");


        DuoUtility.printDuo(stringDuo);
        DuoUtility.printDuo(stringDuo1);
        DuoUtility.swapFirst(stringDuo,stringDuo1);
        DuoUtility.printDuo(stringDuo);
        DuoUtility.printDuo(stringDuo1);
    }
}
