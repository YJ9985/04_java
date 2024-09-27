package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Write number(write 0 to terminate program): ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }
        System.out.println("Total sum: " + sum);
        System.out.println("Program Terminated");
    }
}
