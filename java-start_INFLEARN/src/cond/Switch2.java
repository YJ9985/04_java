package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            //이 떄는 break가 없어서 case 2에도 3000 coupon이 됨
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급 받은 쿠폰: " + coupon);
    }
}
