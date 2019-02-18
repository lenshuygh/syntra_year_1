package recap.ex10p203;

public class Drawing {
    private Shape[] shapes = new Shape[100];
    private int size;

    public Drawing(){

    }

    public void add(Shape newShape){
        boolean addShape = true;
        for (Shape shape : shapes) {
            if(shape.equals(newShape)){

            }
        }

    }

    public void remove(Shape shape){

    }
}
