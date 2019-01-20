package year1.javafundamentals.solutions.chapter10.exercise10.graphics;

/**
 * Created by JonathanSyntra on 22/01/2017.
 */
public class Drawing {
    private Shape[] shapes;
    private int size;

    public Drawing(){
        shapes = new Shape[100];
        size = 0;
    }

    public void addShape(Shape shape){
        boolean present = isPresent(shape);
        if(!present){
            int freeLocation = getFreeLocation();
            //if (freeLocation >= 0){
                shapes[freeLocation] = shape;
                size++;
            //}
        }
    }

    public void removeShape(Shape shape){
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] != null && shapes[i].equals(shape)){
                shapes[i] = null;
                size--;
                return;
            }
        }
    }

    public void clear(){
        shapes = new Shape[100];
        size = 0;
    }

    public int getSize(){
        return size;
    }

    private boolean isPresent(Shape shape){
        for (Shape shapeInArray : shapes) {
            if(shapeInArray != null && shapeInArray.equals(shape)){
                return true;
            }
        }
        return false;
    }

    private int getFreeLocation(){
        int maxIndex = shapes.length;
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] == null){
                return i;
            }
        }
        //return -1;
        expandShapesArray();
        return maxIndex;
    }

    private void expandShapesArray(){
        Shape[] shapesNew = new Shape[shapes.length + 100];
        for (int i = 0; i < shapes.length; i++) {
            shapesNew[i] = shapes[i];
        }
        shapes = shapesNew;
    }


}
