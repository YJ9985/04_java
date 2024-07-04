package exception.real;


import exception.real.exceptions.MyCheckException;
import exception.real.exceptions.MyUncheckException;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.callException();
            client.callException2();
        } catch (Exception e) {
            //모든 예외 처리를 하는 메서드를 사용
            exceptionHandler(e);
        }

        System.out.println("막았는가?");
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("시스템: 알수없는 오류 발생");
        System.out.println("===개발자만 보세요===");
        //에러 어디에서 발생했는지 위치 나타내기
        e.printStackTrace();

        //에러 타입에 따라 다르게 예외 처리
        if(e instanceof MyUncheckException) {
            System.out.println("MyCheckoutException에서 발생한 에러");
            //MyCheckoutException에서만 쓰는 메서드 활용을 위한 다운캐스팅
            MyCheckException CheckException = (MyCheckException) e;
            myCheckException.getMessage();
        } else if(e instanceof MyUncheckException){
            System.out.println("MyUncheckException에서 발생한 에러");
            //MyCheckoutException에서만 쓰는 메서드 활용을 위한 다운캐스팅
            MyUncheckException UnCheckException = (MyUnCheckException) e;
            myUnCheckException.getMessage();
        }
    }
}

