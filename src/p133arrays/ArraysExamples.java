package p133arrays;

import java.util.Random;

public class ArraysExamples {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        String word = "Hello";
        char c = word.charAt(2);
        System.out.println("c:" + ""+ c);

        int number = numbers[2];
        System.out.println(number);
        System.out.println(numbers[2]);

        new StringBuilder(word).setCharAt(2,'Z');

        numbers[2] = 8;
        for(int i = 0;i < numbers.length;i++){
            System.out.println(numbers[i]);
        }

        // filling an array

        numbers = new int[]{25,20,3,1,18,44,55,66,88,49,4,6,66,2,0};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+",");
        }
        System.out.println();

        // filling an array with randoms

        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(100);
        }

        System.out.println("********");
        for (int i : numbers) {
            System.out.print(numbers[i]+",");
        }

        System.out.println();


        // array of Strings

        String[] strings = new String[]{"Hello","Hi",new String("World"),new StringBuilder("Hello").toString(),"Mars".substring(1,2)};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i].toUpperCase());
        }

        // array of strings with NULL elements
        String[] strings2 = new String[3];
        strings2[0] = "Hello";
        strings2[2] = "World";
        for (int i = 0; i < strings2.length; i++) {
            System.out.println(strings2[i]);
        }

        for (int i = 0; i < strings2.length; i++) {
            if(strings2[i] == null){    // <= element number 2 (element on position 2) = empty, this is a null-value and cannot be converted to uppercase
                continue;
            }
            System.out.println(strings2[i].toUpperCase());
        }

        for (String s : strings2) {
            System.out.println(s);
        }
    }
}
