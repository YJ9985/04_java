package afternoon.nested.local;

interface Print {
    void printlocal();
}

public class LocalOuter2 {
    private String outerInstance = "outerInstance";

    public void outerMethod(String methodParameter) {
        String methodString = "methodString";

        class LocalInner implements Print {
            String localInstance = "localInstance";

            @Override
            public void printlocal() {
                System.out.println("outerInstance  = " + outerInstance);
                System.out.println("methodString = " + methodString);
                System.out.println("methodParameter = " + methodParameter);
                System.out.println("localInstance = " + localInstance);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.printlocal();

    }

    public static void main(String[] args) {
        LocalOuter2 localOuter = new LocalOuter2();
        localOuter.outerMethod("parameter");
    }
}
