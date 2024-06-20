package src.variable;

public class Var1 {
    public static void main(String[] args) {
        //1. 10 출력하기 (1)
        System.out.println(10);

        //2. 10 출력하기 (2)
        int a; //변수 선언
        a = 10; //변수 초기화
        System.out.println(a);

        //3. 변수 값 변경
        int b;
        b = 10;
        System.out.println(b);
        b = 50; //변수 값 변경
        System.out.println(b);

        //4. 변수 선언방법
        int c,d; //변수는 한 번에 여러개 선언 가능하다.

        //5.변수 선언과 초기화를 동시에
        int e = 10;
        System.out.println(e);
    }
}
