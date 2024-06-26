package cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 10;
        //()괄호한의 조건이 참이면 왼쪽, 거짓이면 오른쪽 값이 대입됨
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age: " + age + " status: " + status);
    }
}
