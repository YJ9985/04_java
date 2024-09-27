package src.variable;

public class Var2 {
    public static void main(String[] args) {
        //1. 변수의 형식
        int a = 100; //정수형
        double b = 10.5; //실수형
        boolean c = true; //불리언
        char d = 'A'; //문자 하나
        String e = "Hello Java"; //문자열

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //2. 변수 타입
        //1)정수형
        byte f = 127; //-128~127
        short g = 32767; //-32,768~32,767
        int i = 2147483647; // 약 20억까지, 자주 사용
        long l = 9223372036854775807L; //자주 사용

        //2)실수형
        float h = 10.0f; //무조건 뒤에 f 붙어야 함
        double k = 10.0; //자주사용하는 타입

        //문자
        char j = 'A'; //문자 하나
        String m = "Hello Java"; // 문자열, 자주 사용
    }
}
