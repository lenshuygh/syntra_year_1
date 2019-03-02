package recap.nestedClasses.p241ex04;

import javafx.scene.canvas.GraphicsContext;

import java.util.Iterator;

/**
 * Created by JonathanSyntra on 22/01/2017.
 */
public class Drawing implements Drawable,Iterable {
    private Shape[] shapes;
    private Drawable[] drawables;
    private int size;

    public Drawing() {
        shapes = new Shape[100];
        drawables = new Drawable[100];
        size = 0;
    }

    public void addDrawable(Drawable d) {
        boolean present = isPresent(d);
        if (!present) {
            int freeLocation = getFreeLocation();
            drawables[freeLocation] = d;
        }
    }

    public void removeShape(Drawable d) {
        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] != null && drawables[i].equals(d)) {
                drawables[i] = null;
                size--;
                return;
            }
        }
    }

    public void clear() {
        drawables = new Drawable[100];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    private boolean isPresent(Drawable d) {
        for (Drawable drawable : drawables) {
            if (drawable != null && drawable.equals(d)) {
                return true;
            }
        }
        return false;
    }

    private int getFreeLocation() {
        int maxIndex = drawables.length;
        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] == null) {
                return i;
            }
        }
        expandDrawablesArray();
        return maxIndex;
    }

    private void expandDrawablesArray() {
        Drawable[] drawablesNew = new Drawable[drawables.length + 100];
        for (int i = 0; i < drawables.length; i++) {
            drawablesNew[i] = drawables[i];
        }
        drawables = drawablesNew;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Drawable drawable : drawables) {
            if (drawable != null) {
                sb.append(drawable);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    @Override
    public void draw(GraphicsContext g) {
        for (Drawable drawable : drawables) {
            if (drawable != null) {
                drawable.draw(g);
            }
        }
    }

    @Override
    public void scale(int s) {
        for (Drawable drawable : drawables) {
            if (drawable != null) {
                drawable.scale(s);
            }
        }
    }

    @Override
    public Iterator iterator() {
        return new DrawableIterator();
    }

    class DrawableIterator implements Iterator {
        private int currentIndex;

        public DrawableIterator() {
            currentIndex = 0;
        }


        @Override
        public boolean hasNext() {
            return currentIndex < drawables.length;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return drawables[currentIndex++];
            }
            return null;
        }
    }
}
