package recap.nestedClasses;

public class AnonymousInnerClasses {
    public void myMethod(){
        SuperClassForAnonInnerClass superClass = new SuperClassForAnonInnerClass(){

            public void prnt(){
                System.out.println(this);
            }

            @Override
            public void identify() {
                //super.identify();
                System.out.println("identification : " +this.getClass().getSimpleName());
            }


        };

    }
}
