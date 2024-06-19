package afternoon.scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println() = System.out.print("\n")
        System.out.print("Input String: "); // println: print 하고 다음줄로 이동, ln 없애면 바로 옆에 커서 옆에서 반짝임
        String str = scanner.nextLine();
        System.out.println("Return String: " + str);

        System.out.print("Input int:");
        int number = scanner.nextInt();
        System.out.println("Return Number: " + number);

        System.out.print("Input double: ");
        double number2 = scanner.nextDouble();
        System.out.println("Return double: " + number2);
    }
}
