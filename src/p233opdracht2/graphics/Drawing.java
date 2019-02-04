package p233opdracht2.graphics;

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

    public void addShape(Drawable shape){
        boolean present = isPresent(shape);
        if(!present){
            int freeLocation = getFreeLocation();
            //if (freeLocation >= 0){
                drawables[freeLocation] = shape;
                size++;
            //}
        }
    }

    public void removeShape(Drawable shape){
        for (int i = 0; i < drawables.length; i++) {
            if(drawables[i] != null && drawables[i].equals(shape)){
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

    private boolean isPresent(Drawable shape){
        for (Drawable shapeInArray : drawables) {
            if(shapeInArray != null && shapeInArray.equals(shape)){
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
        expanddrawablesArray();
        return maxIndex;
    }

    private void expanddrawablesArray(){
        Drawable[] drawablesNew = new Drawable[drawables.length + 100];
        for (int i = 0; i < drawables.length; i++) {
            drawablesNew[i] = drawables[i];
        }
        drawables = drawablesNew;
    }


    @Override
    public void draw(GraphicsContext g) {
        for (Drawable drawable : drawables) {
            if(drawable != null) {
                drawable.draw(g);
            }
        }
    }

    @Override
    public void scale(int s) {
        for (Drawable drawable : drawables) {
            if(drawable != null) {
                drawable.scale(s);
            }
        }
    }
    // todo: this !!!
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Drawable drawable: drawables){
            if(drawable != null){
                //sb.append()
            }
        }
        return sb.toString();
    }
}
