package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;

        //do 안의 내용들을 while문이 거짓이 될 때까지 실행한다.
        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        } while (i < 13);
    }
}
