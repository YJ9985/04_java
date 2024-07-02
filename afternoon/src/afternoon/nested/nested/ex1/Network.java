package afternoon.nested.nested.ex1;

import java.util.Random;

public class Network {
    private boolean networkCondition;

    public boolean checkNetworkCondition() {
        System.out.println("Checking network condition");
        Random random = new Random();
        networkCondition = random.nextBoolean();

        if (networkCondition) {
            System.out.println("Network condition passed");
            return true;
        } else {
            System.out.println("Network condition failed");
            return false;
        }


    }

    public void sendMsg(String msg) {
        NetworkMsg networkMsg = new NetworkMsg(msg);
        networkMsg.send();
    }
}
