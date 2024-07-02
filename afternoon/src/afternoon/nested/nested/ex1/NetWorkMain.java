package afternoon.nested.nested.ex1;

public class NetWorkMain {
    public static void main(String[] args) {
        Network network = new Network();
        if (network.checkNetworkCondition()) network.sendMsg("Is tomorrow Raining?");
    }
}
