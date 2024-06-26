package operator;

import java.security.spec.RSAOtherPrimeInfo;

public class Operator4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        //증감연산자 1
        a = a +1; //1
        System.out.println(a);


        //증감연사자 2 : 전위
        ++a; //2
        System.out.println(a);

        --a; //1
        System.out.println(a);

        b = ++a; //a의 값을 먼저 증가시키고 그 결과를 b에 대입
        System.out.println("a : " + a + ", b : " + b);


        //증감연사자 3 : 후위
        a = 1;
        b = 0;

        b = a++; //a의 현재값을 b에 먼저 대입하고 그 후에 a값을 증가시킴
        System.out.println("a : " + a + ", b : " + b);

    }
}
