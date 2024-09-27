package loop.ex;

public class ex2 {
    public static void main(String[] args) {
        for (int num = 1; num <= 20; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        System.out.println();

        int num = 2;
        while (num <= 20) {
            System.out.println(num);
            num += 2;
        }
    }
}

