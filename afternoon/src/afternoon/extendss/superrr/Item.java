package afternoon.extendss.superrr;

public class Item {
    private String name;
    private int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print(){
        System.out.println("Item name: " + this.name);
        System.out.println("Item price: " + this.price);
    }
}
