package exception.check;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.callRandException();
            client.callException();
        } catch (MyCheckException | MyCheckException2 e) {
            e.printStackTrace();
        }
    }
}

