package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number1 = 1.5;
        printNumber((int)number1); // ㅁ명시적 형 변화을 사용해 double을 int형으로 변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
