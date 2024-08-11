package ref.ex;

import java.util.Scanner;

public class ProductMain3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int productCount = sc.nextInt();
        ProductOrder[] orders = new ProductOrder[productCount];
        sc.nextLine();

        for (int i = 0; i < productCount; i++) {
            System.out.println(i + 1 + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = sc.nextLine();
            System.out.print("가격: ");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            orders[i] = createProduct(productName, price, quantity);
        }

        printOrder(orders);
        getTotalAmount(orders);
    }

    static ProductOrder createProduct(String productName, int price, int quantity) {
        ProductOrder orders = new ProductOrder();
        orders.productName = productName;
        orders.price = price;
        orders.quantity = quantity;
        return orders;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static void getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount);
    }
}
