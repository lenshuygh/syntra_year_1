package recap.CountingConstructors;

public class ExtendingTheExtendingClass extends ExtendingClass{
    private static int count = 0;
    {
        count++;
    }

    public ExtendingTheExtendingClass() {
    }

    public static int getCount() {
        return count;
    }
}
