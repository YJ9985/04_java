package operator.ex;

public class OperationEx1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3; //자바에서 int 끼리의 나눗셈은 자동으로 소숫점 이하를 버린다.

        System.out.println(sum);
        System.out.println(average);
    }
}
