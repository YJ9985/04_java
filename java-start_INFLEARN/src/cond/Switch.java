package cond;

public class Switch {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;

        //switch문은 값이 같은지 아닌지만 확인할 수 있는 연산자(숫자, 문자 모두 가능)
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급 받은 쿠폰: " + coupon);
    }
}
