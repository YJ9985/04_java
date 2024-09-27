package scanner;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Food: ");
        String foodName = sc.nextLine();

        System.out.print("Food Price: ");
        int foodPrice = sc.nextInt();

        System.out.print("Quantity: ");
        int foodQuantity = sc.nextInt();

        int totalPrice = foodPrice * foodQuantity;
        System.out.println("You ordered " + foodQuantity + " " + foodName + ". Total price is: " + totalPrice);
    }
}
