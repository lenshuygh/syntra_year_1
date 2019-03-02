package playground.nestedClasses;

public class OuterClass {
    public String classId = "OuterClassId";
    private String classIdPrivate = "OuterClassIdPrivate";

    public String getClassIdPrivate() {
        return classIdPrivate;
    }

    class InnerClass{
        public String classId = "InnerClassId";
        private String classIdPrivate = "InnerClassIdPrivate";

        public String getClassIdPrivate() {
            return classIdPrivate;
        }
    }
}
