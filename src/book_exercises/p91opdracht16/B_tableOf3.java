package book_exercises.p91opdracht16;

public class B_tableOf3 {
    public static void main(String[] args) {
        int num = 0;


        while((num += 3)  <50){
            System.out.println(num);
        }


        /*
        while(num < 50){
            num = num + 3;
            if(num < 50){
                System.out.println(num);
            }
        }
        */

        /*
        while(num < 50){
            if((num += 3) < 50){
                System.out.println(num);
            }
        }
        */
    }
}
