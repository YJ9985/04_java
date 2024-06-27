package afternoon.memory;

public class MemoryMain {
    public static void main(String[] args) {
        System.out.println("Main Method Start");
        method1();
        System.out.println("Main Method End");
    }

    static void method1() {
        System.out.println("Method 1 Start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("Method 2 End");
    }

    static void method2(Data data) {
        System.out.println("Method 2 Start");
        System.out.println("Return of data's value: " + data.getValue());
        System.out.println("Method 2 End");
    }
}
