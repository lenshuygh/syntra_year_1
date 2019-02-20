package playground.codewars;

public class Tripples {

    public static void main(String[] args) {
        Tripples t = new Tripples();
        Long a = 451999277L;
        Long b = 41177722899L;
        System.out.println(t.Tripples(a,b));

    }

    private int Tripples(Long num1, Long num2) {
        char[] charsNum1 = String.valueOf(num1).toCharArray();
        char[] charsNum2 = String.valueOf(num2).toCharArray();
        char tripple = ' ';
        for(int i = 0;i < charsNum1.length - 2;i++){
            if((charsNum1[i] == charsNum1[i+1]) && (charsNum1[i] == charsNum1[i+ 2])){
                tripple = charsNum1[i];
                for(int j = 0;j < charsNum2.length - 1;j++){
                    if((tripple == charsNum2[j]) && (tripple == charsNum2[j+1])){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }


}
