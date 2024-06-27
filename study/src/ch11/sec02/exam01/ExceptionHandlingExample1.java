package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        try{
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("[마무리 실행]\n");
        }

        int result = data.length(); //12번째 줄에서 null을 전달하여 null.length가 실행되어 NullPointerException이 발생한다.
        System.out.println("문자 수: " + result);
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); // null을 printLength에 전달하여 에러 발생
        System.out.println("[프로그램 종료]");
    }
}
