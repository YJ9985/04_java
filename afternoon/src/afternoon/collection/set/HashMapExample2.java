package afternoon.collection.set;

import java.util.HashMap;
import java.util.Random;

public class HashMapExample2 {
    public static void main(String[] args) {

        //1. 길이가 10인 배열 생성
        //2. 1~10 사이의 랜덤한 정수가 배열에 들어감

        Random rand = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
        }

        //3. Map을 이용해서 특정 값이 몇 번나왔는지 기록
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            hashMap.put(i, 0);
        }
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            hashMap.put(num, hashMap.get(num) + 1);
        }

        System.out.println("hashMap = " + hashMap);
    }
}
