package book_exercises.p257opdracht6;

/**
 * Created by JonathanSyntra on 22/01/2017.
 */
public class DrawingApp {
    public static void main(String[] args) {
        //try {
            Rectangle rect = new Rectangle(10, 5, 9, 7);
        /*} catch (NegativeSizeException e){

        } */
        Circle circle = new Circle(12);
        Triangle triangle = new Triangle(13,12,5);

        Drawable[] drawables = {rect,circle,triangle};
/*        for (Drawable drawable : drawables) {
            System.out.println(drawable);
            drawable.scaleHalf();
            System.out.println(drawable);
        }*/


        Drawing drawing = new Drawing();
        drawing.addDrawable(rect);
        drawing.addDrawable(circle);
        drawing.addDrawable(triangle);

        drawing.scaleHalf();
        System.out.println(drawing.toString());


        System.out.println("With Ma Own Iterator !!!!");
        for (Object o : drawing) {
            System.out.println(o);
        }
    }
}
