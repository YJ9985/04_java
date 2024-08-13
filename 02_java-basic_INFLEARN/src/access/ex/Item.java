package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        int totalPrice = price * quantity;
        return totalPrice;
    }

    public String getIName() {
        return name;
    }
}
