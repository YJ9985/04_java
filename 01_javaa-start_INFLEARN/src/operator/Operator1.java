package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b: " + sum);

        int diff = a - b;
        System.out.println("a - b: " + diff);

        int multi = a * b;
        System.out.println("a * b: " + multi);

        int div = a / b; //나누기는 0으로 할 수 없다
        System.out.println("a / b: " + div);

        //나머지
        int mod = a % b;
        System.out.println( "a % b: " + mod);
    }
}
