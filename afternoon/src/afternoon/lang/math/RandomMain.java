package afternoon.lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt()); //int 범위의 -+ 정수만큼 나옴
        System.out.println(random.nextDouble()); //0~1사이의 소수
        System.out.println(random.nextBoolean()); //T or F
        System.out.println(random.nextInt(100)); // 0~99

    }
}
