package scanner;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Write price of product(-1 means terminate the program): ");
            int price = scanner.nextInt();

            if (price == -1) {
                System.out.println("Program terminated");
                break;
            }

            System.out.print("Write quantity of product you want to buy: ");
            int quantity = scanner.nextInt();

            System.out.println("Total sum: " + price * quantity);

        }

    }
}
