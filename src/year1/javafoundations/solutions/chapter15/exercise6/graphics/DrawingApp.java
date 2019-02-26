package year1.javafoundations.solutions.chapter15.exercise6.graphics;

import java.util.Iterator;

/**
 * Created by JonathanSyntra on 22/01/2017.
 */
public class DrawingApp {
    public static void main(String[] args) {

        Drawing drawing = new Drawing();

        for(int i = 0; i < 100; i++){
            try {
                drawing.addDrawable(new Circle(i));
            } catch (NegativeSizeException e) {
                e.printStackTrace();
            }
        }

        Iterator iterator = drawing.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //System.out.println(iterator.next());


/*        for (Object drawable : drawing) {
            System.out.println(drawable);
        }*/
    }
}
