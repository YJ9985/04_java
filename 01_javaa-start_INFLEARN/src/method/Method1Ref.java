package method;

public class Method1Ref {
    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 연산수행");
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int sum1 = add(1, 2);
        System.out.println("sum1 = " + sum1);

        int sum2 = add(10, 20);
        System.out.println("sum2 = " + sum2);
    }
}

