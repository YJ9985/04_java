package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        //while문 안의 if문이 참이면 continue를 실행해야해서 sout 출력되지 않는다.
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
