package afternoon.nested.local.ex1;

import java.util.Random;

public class Ex2Main {
    public static void complicatedProgram(Dice dice) {
        System.out.println("복잡한 과정 시작");
        System.out.println("복잡한 과정 종료 후, 원하는 기능 실행");

        //코드 조각 시작

        //여기서 원하는 프로그램 실행
        dice.run();

        //코드 조각 종료
        System.out.println("복잡한 과정 다시 시작");
        System.out.println("복잡한 과정 종료 후, 원하는 기능 실행");
    }

    static class DiceOnce implements Dice {
        @Override
        public void run() {
            int rand = new Random().nextInt(6) + 1;
            System.out.println("첫 번째 던진 주사위: " + rand);
        }
    }

    static class DiceSum implements Dice {
        @Override
        public void run() {
            int rand1 = new Random().nextInt(6) + 1;
            int rand2 = new Random().nextInt(6) + 1;
            int sum = rand1 + rand2;

            System.out.println("주사위 두 번 굴린 값의 합: " + sum);
        }
    }

    public static void main(String[] args) {
        //빈 상태를 유지
        complicatedProgram(new DiceOnce());
        complicatedProgram(new DiceSum());
    }
}
