package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 10.5;
        int intValue = 1;

        //intValue = doubleValue : 컴파일 오류 발생
        intValue = (int) doubleValue; //소숫점 버림. doubleValue 안의 값은 여전히 10.5, intValue만 10
        System.out.println("intValue = " + intValue);
        System.out.println("doubleValue = " + doubleValue);
    }
}
