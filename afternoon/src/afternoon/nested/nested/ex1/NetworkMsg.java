package afternoon.nested.nested.ex1;

public class NetworkMsg {
    private String msg;

    public NetworkMsg(String msg) {
        this.msg = msg;
    }

    public void send(){
        System.out.println("Sending Network Message.");
        System.out.println(msg);
        System.out.println("Stop sending Network Message");
    }


}


