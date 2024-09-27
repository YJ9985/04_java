package loop;

public class Nested1 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("외부 for문, i =" + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("내부 for문, i = " + i + ", j = " + j);
            }
            System.out.println("외부 for문 종료 i = " + i);
            //줄바꿈용 입력
            System.out.println();
        }
    }
}
