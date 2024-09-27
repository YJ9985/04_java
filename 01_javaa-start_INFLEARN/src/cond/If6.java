package cond;

public class If6 {
    public static void main(String[] args) {
        //if와 else if 비교
        int price = 10000;
        int age = 8;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("discount: " + discount);
            System.out.println("10000원 이상 구매 시 1000원 할인");

        } else if (age <= 10) {
            discount += 1000;
            System.out.println("discount: " + discount);
            System.out.println("10세 이하 1000원 할인");
        }

        System.out.println("총 할인 금액: " + discount);
    }
}
