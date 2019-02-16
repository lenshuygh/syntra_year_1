package recap.CountingConstructors;

public class ExtendingClass extends Shape{
    private static int count;
    {
        count++;
    }

    public ExtendingClass(){

    }

    public static int getCount(){
        return count;
    }
}
