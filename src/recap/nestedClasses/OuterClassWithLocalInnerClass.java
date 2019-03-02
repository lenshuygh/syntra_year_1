package recap.nestedClasses;

public class OuterClassWithLocalInnerClass {
    public Object getInner(){
        int a = 5;

        class Inner {
            public String toString(){
                //a++;
                return "inner " + a;
            }
        }
        return new Inner();
    }
}
