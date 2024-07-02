package afternoon.nested.nested;

public class Outer {
    private static String outerStatic = "outerStatic";
    private String outerInstance = "outerInstance";

    class Inner {
        private static String nestedStatic = "innerStatic";
        private String nestedInstance = "innerInstance";

        public void print() {
            //클래스 내부 static 값에 접근
            System.out.println("innerStatic = " + nestedStatic);
            System.out.println("outerStatic = " + outerStatic);

            //클래스 내부의 non=static 값에 접근
            System.out.println("innerInstance = " + nestedInstance);
            System.out.println("outerInstance = " + outerInstance);
        }
    }

    public static class OuterMain {
        public static void main(String[] args) {
            Outer outer = new Outer();
//            Inner inner = new Inner();

//            inner.print();
        }
    }
}
