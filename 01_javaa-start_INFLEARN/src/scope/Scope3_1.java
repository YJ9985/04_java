package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; //if문 안에서만 사용하는 temp를 메인에서 선언해 비효율적으로 메모리를 사용한 예시
        if (m > 0) {
            temp = m*2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
