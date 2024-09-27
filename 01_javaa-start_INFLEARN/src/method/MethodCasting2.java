package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int num1 = 100;
        printNumber(num1); //double형 변수에 int형 인수를 전달하는 데 문제없이 잘 작동한다
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}

