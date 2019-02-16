package year1.javafoundations.solutions.chapter13.exercise2.graphics;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by JonathanSyntra on 22/01/2017.
 */
public class Drawing implements Drawable{
    private Drawable[] drawables;
    private int size;

    public Drawing(){
        drawables = new Drawable[100];
        size = 0;
    }

    public void addDrawable(Drawable drawable){
        boolean present = isPresent(drawable);
        if(!present){
            int freeLocation = getFreeLocation();
            //if (freeLocation >= 0){
                drawables[freeLocation] = drawable;
                size++;
            //}
        }
    }

    public void removeDrawable(Drawable drawable){
        for (int i = 0; i < drawables.length; i++) {
            if(drawables[i] != null && drawables[i].equals(drawable)){
                drawables[i] = null;
                size--;
                return;
            }
        }
    }

    public void clear(){
        drawables = new Drawable[100];
        size = 0;
    }

    public int getSize(){
        return size;
    }

    private boolean isPresent(Drawable drawable){
        for (Drawable drawableInArray : drawables) {
            if(drawableInArray != null && drawableInArray.equals(drawable)){
                return true;
            }
        }
        return false;
    }

    private int getFreeLocation(){
        int maxIndex = drawables.length;
        for (int i = 0; i < drawables.length; i++) {
            if(drawables[i] == null){
                return i;
            }
        }
        //return -1;
        expandDrawablesArray();
        return maxIndex;
    }

    private void expandDrawablesArray(){
        Drawable[] drawablesNew = new Drawable[drawables.length + 100];
        for (int i = 0; i < drawables.length; i++) {
            drawablesNew[i] = drawables[i];
        }
        drawables = drawablesNew;
    }




    @Override
    public void scale(int s) {
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
    public void draw(GraphicsContext g) {
        for (Drawable drawable : drawables) {
            if(drawable != null){
                drawable.draw(g);
            }
        }
    }
}
