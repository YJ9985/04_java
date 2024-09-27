package loop;

public class While3_2 {
    public static void main(String[] args) {
        //같은 내용 while문 사용하기

        int i = 1;
        int sum = 0;
        int endNum = 10;

        while (i <= endNum) {
            sum += i;
            System.out.println("i : " + i + " sum: " + sum);
            i++;
        }
    }
}

