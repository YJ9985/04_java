package afternoon.exception.uncheck;

public class Client {
    //myuncheckexception은 이제 런타임에러이므로 extends exception을 빼먹어도 됨
    public void callException() {
        throw new MyUncheckException("Client.call 에서 에러발생");
    }
    public void callException2() throws MyCheckException {
        throw new MyCheckException("Client.call에서 에러 발생");
    }

}
