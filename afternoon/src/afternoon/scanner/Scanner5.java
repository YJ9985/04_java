package afternoon.scanner;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a String(Enter Exit to end): ");
            String input = sc.nextLine();
            if(input.equals("exit")) {
                System.out.println("End Program");
                break;
            }

            System.out.println("String: " + input);
        }
    }
}
