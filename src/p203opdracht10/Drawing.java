package p203opdracht10;

import p200opdracht8.graphics.Shape;

public class Drawing {
    private Shape[] shapes = new Shape[100];
    private int size = 0;

    public void add(Shape shape){
        if(shape != null) {
            if(!shapeAlreadyPresent(shape)) {
                for (int i = 0; i < shapes.length; i++) {
                    if (shapes[i] == null) {
                        shapes[i] = shape;
                        size++;
                        break;
                    }
                }
            }
        }
    }

    private boolean shapeAlreadyPresent(Shape shape) {
        for (int i = 0; i < shapes.length; i++) {
            if (shape.equals(shapes[i])) {
                return true;
            }
        }
        return false;
    }

    public void remove (Shape shape){
        for (int i = 0; i < shapes.length; i++) {
            if(shape.equals(shapes[i])){
                shapes[i] = null;
                size--;
            }
        }
    }

    public void clear(){
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = null;
        }
    }

    public int getSize(){
        return size;
    }


}
