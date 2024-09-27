package operator;

public class Operator2 {
    public static void main(String[] args) {
        //1. 문자열 더하기
        String result1 = "Hello" + "World";
        System.out.println(result1);

        //2. 문자열 더하기 (2)
        String s1 = "fisrt";
        String s2 = "second";
        String result2 = s1 + s2;
        System.out.println(result2);

        //3. 문자열과 숫자 더하기
        String result3 = "a + b = " + 10;
        System.out.println(result3); //여기서는 10이 문자열로 변환됨

        //4.문자열과 숫자 더하기 (2)
        int num = 10;
        String str = "a + b = ";
        String result4 = str + num; //str, num 모두 문자열로 변환됨
        System.out.println(result4);
    }
}
