package afternoon.nested.local;

//interface Print {
//    void printlocal();
//}

public class AnonymousOuter {
    private String outerInstance = "outerInstance";

    public void outerMethod(String methodParameter) {
        String methodString = "methodString";

        Print print = new Print() {
            String localInstance = "localInstance";


        @Override
        public void printlocal () {
            System.out.println("outerInstance  = " + outerInstance);
            System.out.println("methodString = " + methodString);
            System.out.println("methodParameter = " + methodParameter);
            System.out.println("localInstance = " + localInstance);
        }
    };

       print.printlocal();

}

public static void main(String[] args) {
    AnonymousOuter anonymousOuter = new AnonymousOuter();
    anonymousOuter.outerMethod("parameter");
}
}
