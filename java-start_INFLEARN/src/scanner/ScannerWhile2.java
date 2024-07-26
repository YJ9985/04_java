package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Write 0 twice to exit program");
            System.out.print("First number: ");
            int num1 = sc.nextInt();

            System.out.print("Second number: ");
            int num2 = sc.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("Program Terminated");
                break;
            }

            int sum = num1 + num2;
            System.out.println("The sum is " + sum);
        }
    }
}
