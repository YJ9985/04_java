package afternoon.collection.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        //삭제추가가 빈번하면 Linked List
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("list = " + list);

        //list가 유리한 케이스
        list.addFirst(6);
        System.out.println("list = " + list);

        //list와 array가 동일한 케이스
        list.addLast(7);
        System.out.println("list = " + list);

        //list가 불리한 케이스
        list.add(/*index*/3, /*element*/ 22);
        System.out.println("list = " + list);

        //검색
        int firstElement = list.getFirst();
        int lastElement = list.getLast();
        int midElement = list.get(4);

        System.out.println("firstElement = " + firstElement);
        System.out.println("lastElement = " + lastElement);
        System.out.println("midElement = " + midElement);

    }
}
