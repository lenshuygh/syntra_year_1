package recap.ex10p203;

public class PolyApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Rectangle(10,50,1,2);
        shapes[1] = new Rectangle(40,20);
        shapes[2] = new Square(8,2,9);
        shapes[3] = new Square(26);
        shapes[4] = new Circle(8);
        shapes[5] = new Circle(20,50,10);
        shapes[6] = new Triangle(8,10,20,5,7);
        shapes[7] = new Triangle(37,80,60);
        shapes[8] = new IsoScelesTriangle(72,16);
        shapes[9] = new IsoScelesTriangle(40,35,90,20);

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName());
            if (shape instanceof Rectangle){
                System.out.println(((Rectangle) shape).getWidth());
                System.out.println(((Rectangle) shape).getHeight());
            }else if (shape instanceof Square){
                System.out.println(((Square) shape).getSide());
            }else if (shape instanceof Triangle){
                System.out.println(((Triangle) shape).getPerpendicular());
            }else if(shape instanceof IsoScelesTriangle){
                System.out.println(((IsoScelesTriangle) shape).getPerpendicular());
                System.out.println(((IsoScelesTriangle) shape).getWidth());
            }else if(shape instanceof Circle){
                System.out.println(((Circle) shape).getRadius());
            }
            System.out.println("---------------------------------------------");
        }
    }
}
