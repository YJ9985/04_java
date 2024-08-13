package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }

    public void removeItem(Item item) {
        if (item != null) {
            boolean found = false;
            for (int i = 0; i < itemCount; i++) {
                if (items[i].equals(item)) {
                    System.out.println(items[i].getIName() + " 상품이 삭제되었습니다.");

                    found = true;
                    items[i] = null;
                    itemCount--;
                }
            }
            if (!found) {
                System.out.println("일치하는 아이템이 없습니다.");
            }

        } else {
            System.out.println("등록된 아이템이 없습니다.");
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명: " + items[i].getIName() + ", 합계: " + items[i].getTotalPrice());
            totalPrice += items[i].getTotalPrice();
        }
        System.out.println("전체 가격 합: " + totalPrice);
    }
}
