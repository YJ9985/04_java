package afternoon.operator;

public class Op2 {
    public static void main(String[] args) {
//        문자열 비교는 equals로 한다.
        String str1 = "abc";
        String str2 = "def";
        String str3 = "abc";

        boolean result1 = !str1.equals("abc");
        boolean result2 = !"abc".equals(str3);
        boolean result3 = !str1.equals(str3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("abc" == "abc");
        System.out.println("abc" == "def");
        System.out.println("abc" == new String("abc")); //new는 새로운 주소가 부여되기 때문에 false 결과가 나온다.

        int score = 90;
        boolean result = score >= 80 && score <= 100;
        System.out.println(result);

    }
}
