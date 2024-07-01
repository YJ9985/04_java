package afternoon.lang.math;

public class MathMain {
    public static void main(String[] args) {
        //기본연산: 최솟값, 최댓값 구하기
        System.out.println(Math.max(10,30));
        System.out.println(Math.min(10,30));

        //절대값
        System.out.println(Math.abs(-10));

        //소수점 연산: 올림, 내림, 반올림
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.floor(2.1));
        System.out.println(Math.round(2.1));

        //기타
        System.out.println(Math.sqrt(9)); //제곱근
        System.out.println(Math.random()); //random값: 0이상, 1이하
    }
}
