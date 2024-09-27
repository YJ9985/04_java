package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Write String(exit: close program): ");
            String str = sc.nextLine();

            if (str.equals("exit")) {
                System.out.println("Program terminated");
                break;
            }

            System.out.println("String: " + str);
        }
    }
}
