package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        //for는 조건식이 없으면 무한반복한다
        for (; ; ) {
            sum += i;
            if (sum > 10) {
                System.out.println("Finish when sum is over 10: i = " + i + " , sum = " + sum);
                break;
            }
            i++;
        }
    }
}
