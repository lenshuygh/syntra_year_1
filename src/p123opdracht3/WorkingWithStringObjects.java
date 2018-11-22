package p123opdracht3;

import java.util.Scanner;

public class WorkingWithStringObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("give a sentence:");
        String text = scanner.nextLine();

        System.out.println(text);
        System.out.println(text.length());

        System.out.println();

        System.out.println(text.toUpperCase());

        System.out.println();

        System.out.println(text.replace('a','o'));

        System.out.println();
        int counter = 0;
        for (int i = 0; i < text.length()-1; i++) {
            if(text.substring(i,i+1).equals("e")){
                counter++;
            }
        }
        System.out.println("letter 'e' occurs: " + counter + " times. (subString()");

        int counter2 = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'e'){
                counter2++;
            }
        }
        System.out.println("letter 'e' occurs: " + counter + " times. (charAt()");


        System.out.println();

        System.out.print("give string 1: ");
        String t1 = scanner.next();
        System.out.println();
        System.out.print("give string 2: ");
        String t2 = scanner.next();
        System.out.println();
        System.out.println("equal? -> " + t1.equals(t2));

        System.out.println();
        String r = (t1.compareTo(t2) < 0)? t1:t2;
        System.out.println("first alphabeticaly: " + r);

        //System.out.println();
        System.out.println("enter string with whitespace (leading & trailing): ");
        scanner.nextLine();
        String s = scanner.nextLine();
        System.out.println("The string without whitespace: |"+s.trim()+"|");


        scanner.close();
    }
}
