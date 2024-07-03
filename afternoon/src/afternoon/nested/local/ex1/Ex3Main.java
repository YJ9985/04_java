package afternoon.nested.local.ex1;

import java.util.Random;

public class Ex3Main {
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

    public static void main(String[] args) {
        //빈 상태를 유지
        complicatedProgram(new DiceOnce());
        complicatedProgram(new DiceSum());
    }
}
