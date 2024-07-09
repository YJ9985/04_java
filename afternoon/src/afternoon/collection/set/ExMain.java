package afternoon.collection.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ExMain {
    public static void main(String[] args) {

        //1. 길이가 10인 배열을 생성
        //2. 배열은 값으로 1~10 사이의 랜덤한 정수 입력
        Random rand = new Random();
        int[] Array = new int[10];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = rand.nextInt(10) + 1;
        }

        //3. Set을 이용해서 발생한 배열에 중복 값이 있으면 "중복이다!" 출력
        //4. 중복이 없을 경우에는 "중보기 아니다!!" 출력
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < Array.length; i++) {
            boolean isNotDuplicated = set.add(Array[i]); //중복값
            if (!isNotDuplicated) {
                System.out.println("중복이 아니다!");
            } else {
                System.out.println("중복이다!");
            }
        }
    }
}
