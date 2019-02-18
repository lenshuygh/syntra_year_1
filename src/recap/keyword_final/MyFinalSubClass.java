package recap.keyword_final;

public final class MyFinalSubClass {
    public MyFinalSubClass() {
        System.out.println("constructed MyFinalSubClass");
        finalMethod();
    }

    private final void finalMethod() {
        System.out.println("finalMethod() called");
    }


}
