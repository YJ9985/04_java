package scanner;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write number of multiplication table: ");
        int n = sc.nextInt();

        System.out.println(n + " multiplication table: ");

        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }

    }
}
