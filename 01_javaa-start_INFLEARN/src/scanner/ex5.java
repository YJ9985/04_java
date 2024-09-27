package scanner;

public class ex5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        System.out.println("original a: " + a + ", b: " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("exchange a: " + a + ", b: " + b);
    }
}
