package access.ex;

public class ShopingCartMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);
        Item item3 = new Item("상추", 3000, 4);
        Item item4 = new Item("상추", 3000, 4);
        Item item5 = new Item("상추", 3000, 4);
        Item item6 = new Item("상추", 3000, 4);
        Item item7 = new Item("상추", 3000, 4);
        Item item8 = new Item("상추", 3000, 4);
        Item item9 = new Item("상추", 3000, 4);
        Item item10 = new Item("상추", 3000, 4);
        Item item11 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);
        cart.addItem(item6);
        cart.addItem(item7);
        cart.addItem(item8);
        cart.addItem(item9);
        cart.addItem(item10);
        cart.addItem(item11);
        System.out.println();

        cart.removeItem(item10);
        cart.removeItem(item9);
        cart.removeItem(item8);
        cart.removeItem(item7);
        cart.removeItem(item6);
        cart.removeItem(item5);
        cart.removeItem(item4);
        cart.removeItem(item3);
        cart.removeItem(item2);
        cart.removeItem(item1);
        cart.removeItem(item1);
        System.out.println();

        cart.displayItems();
    }
}
