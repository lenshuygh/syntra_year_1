import java.util.Scanner;

public class CoolTricks {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();

        //compare to other String
        System.out.println(input == "hello");

        System.out.println(input.equals("hello"));

        String input2 = "hello";
        System.out.println("hello" == input2);


        //-----------------------
        input = keyboard.nextLine();
        System.out.println(input + 5);

        int num = Integer.parseInt(input);
        System.out.println(num + 5);
    }
}
