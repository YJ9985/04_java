package afternoon.nested.local.ex1;

import java.util.Random;

public class DiceSum implements Dice{
    @Override
    public void run() {
        int rand1 = new Random().nextInt(6) + 1;
        int rand2 = new Random().nextInt(6) + 1;
        int sum = rand1 + rand2;

        System.out.println("주사위 두 번 굴린 값의 합: " + sum);
    }
}
