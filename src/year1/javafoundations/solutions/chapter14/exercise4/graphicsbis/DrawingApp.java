package year1.javafoundations.solutions.chapter14.exercise4.graphicsbis;

import java.util.Iterator;

/**
 * Created by JonathanSyntra on 22/01/2017.
 */
public class DrawingApp {
    public static void main(String[] args) {

        Drawing drawing = new Drawing();

        for(int i = 0; i < 100; i++){
            drawing.addDrawable(new Circle(i));
        }

        Iterator iterator = drawing.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

/*        for (Object drawable : drawing) {
            System.out.println(drawable);
        }*/
    }
}
