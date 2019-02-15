package recap.keyword_final;

public  class MySubClassFinalMethod {
    public MySubClassFinalMethod() {
        System.out.println("constructed MySubClassFinalMethod");
        finalMethod();
    }

    public final void finalMethod() {
        System.out.println("finalMethod() called");
    }


}
