package book_exercises.p341opdracht9;

import javafx.scene.canvas.GraphicsContext;

import java.util.*;

/**
 * Created by JonathanSyntra on 22/01/2017.
 */
public class Drawing implements Drawable, Iterable {
    //private Drawable[] drawables;
    private Collection<Drawable> drawables = new ArrayList<>();

    public Drawing(){
    }

    public void addDrawable(Drawable drawable){
        if(!drawables.contains(drawable)){
            drawables.add(drawable);
        }
    }

    public void removeDrawable(Drawable drawable){
        if(drawables.contains(drawable)) {
            drawables.remove(drawable);
        }
    }

    public void clear(){
        drawables.clear();
    }

    public int getSize(){
        return drawables.size();
    }

    @Override
    public void draw(GraphicsContext g) {
        for (Drawable drawable : drawables) {
            if(drawable != null){
                drawable.draw(g);
            }
        }
    }

    @Override
    public void scale(int s) throws NegativeSizeException {
        for (Drawable drawable : drawables) {
            if(drawable != null){
                drawable.scale(s);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Drawable drawable : drawables) {
            if(drawable != null){
                sb.append(drawable);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    @Override
    public Iterator iterator() {
        //return new DrawableIterator();
        return  drawables.iterator();
    }
}
