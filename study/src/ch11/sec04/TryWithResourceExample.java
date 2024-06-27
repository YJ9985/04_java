package ch11.sec04;

public class TryWriteResourcExample {
    public static void main(String[] args) {
        MyResource res = new MyResource("A");
        String data = res.read1();
        int value = Integer.parseInt(data);

        System.out.println();
        MyResource res = new MyResource("A");
        String data = res.read2();
        int value = Integer.parseInt(data);
        System.out.println();
        
        MyResource res1 = new MyResource("A");
        MyResource res2 = new MyResource("B");
        String data1 = res1.read1();
        String data2 = res2.read1();
    }
}
