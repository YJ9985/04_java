package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        //Break3 정리
        for (int i = 0; ; i++) {
            sum += i;
            if (sum > 10) {
                System.out.println("SUM is over 10. i: " + i + ", sum : " + sum);
                break;
            }
        }

    }
}
