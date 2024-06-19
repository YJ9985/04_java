package afternoon.scanner;

import java.util.Scanner;

public class Scanner3Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first int: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second int: ");
        int num2 = scanner.nextInt();

        int sub = num1 - num2;
        System.out.println("Subtraction: " + sub);

        int mul = num1 * num2;
        System.out.println("Multiple: " + mul);
    }
}