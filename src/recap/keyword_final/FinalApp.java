package recap.keyword_final;

public class FinalApp extends MySubClassFinalMethod{
    public static void main(String[] args) {
        new FinalApp();
    }


    FinalApp() {
        new MyFinalSubClass();
        System.out.println("-------------");
        MySubClassFinalMethod mySubClassFinalMethod = new MySubClassFinalMethod();
        finalMethod();


    }

    /*
    @Override
    public void finalMethod(){

    }
    */
}
