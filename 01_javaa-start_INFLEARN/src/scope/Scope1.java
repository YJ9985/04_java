package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; //m 생존시작
        if (true) {
            int x = 20; //x 생존시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } //x 생존 종료
        System.out.println("main m = " + m);
        System.out.println("main x = " + "x 접근 불가능"); //오류발생
    } //m 생존종료
}
