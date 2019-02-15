package recap.CountingConstructors;

public abstract class Shape {
    static int count;

    {
        count++;
    }

    public Shape(){

    }

    public static int getCount() {
        return count;
    }
}
