package afternoon.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        //중복 데이터 추가 시도
        boolean isAdded = set.add(30);
        System.out.println("30 추가 시도: " + isAdded); //set은 중복 요소 추가가 불가능하다
        System.out.println("set = " + set); //set은 순서가 보장되어 있지 않다

        //데이터 검색
        boolean contains30 = set.contains(30);
        System.out.println("contain 30 = " + contains30);
        boolean contains60 = set.contains(60);
        System.out.println("contain 60 = " + contains60);

        //데이터 삭제
        boolean isRemoved = set.remove(30);
        System.out.println("isRemoved 30 = " + isRemoved);
        System.out.println("30 삭제 이후 set = " + set);

        //set의 크기 확인
        int size = set.size();
        System.out.println("set size = " + size);

    }
}
