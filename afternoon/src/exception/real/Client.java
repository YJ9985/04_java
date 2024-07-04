package exception.real;

import exception.real.exceptions.MyCheckException;
import exception.real.exceptions.MyUncheckException;

public class Client {
    //myuncheckexception은 이제 런타임에러이므로 extends exception을 빼먹어도 됨
    public void callException() {
        throw new MyCheckException("MyCheckException");
    }

    public void callException2() throws MyCheckException {
        throw new MyUncheckException("MyUncheckException");
    }
}
