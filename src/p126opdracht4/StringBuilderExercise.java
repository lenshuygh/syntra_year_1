package p126opdracht4;

public class StringBuilderExercise {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("This  is the first line of text.");
        StringBuilder sb2 = new StringBuilder("Stringbuilder line ttwo.");

        System.out.println("sb1 -> " + sb1);
        System.out.println("sb2 -> " + sb2);

        sb1.append(" With an added piece of text now.");
        sb2.reverse();

        System.out.println("sb1 -> " + sb1);
        System.out.println("sb2 -> " + sb2);

        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) == ' '){
                sb1.deleteCharAt(i--);
            }
        }
/*
        //int end = sb2.length();
        for (int i = 0; i < sb2.length(); i++) {
            if(sb2.charAt(i) == 't'){
                sb2.replace(i,i+1,"tt");
                    //end++;
                    i++;
            }
        }
*/
        for (int i = 0; i < sb2.length(); i++) {
            if(sb2.charAt(i) == 't'){
                sb2.insert(i++,"t");
            }
        }

        System.out.println("sb1 -> " + sb1);
        System.out.println("sb2 -> " + sb2);
    }
}
