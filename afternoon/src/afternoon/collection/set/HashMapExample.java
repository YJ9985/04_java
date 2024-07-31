package afternoon.collection.set;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("Apple",10000);
        hm.put("Banana",4000);
        hm.put("Orange",3000);
        hm.put("Grapes",5000);

        System.out.println("hashmap = " + hm);

        //특정 키 값 가져오기
        int applePrice = hm.get("Apple");
        System.out.println("applePrice = " + applePrice);

        //키 존재 확인
        boolean hasBanana = hm.containsKey("Banana");
        System.out.println("hasBanana = " + hasBanana);

        //값이 존재하는지 확인
        boolean hasValue5000 = hm.containsValue(5000);
        System.out.println("hasValue5000 = " + hasValue5000);

        //삭제
        int removedValue = hm.remove("Apple");
        System.out.println("removedValue = " + removedValue);
        System.out.println("삭제 후 HashMap = " + hm);
        
        //Hashmap 크기 확인
        int size = hm.size();
        System.out.println("size = " + size);
    }
}
