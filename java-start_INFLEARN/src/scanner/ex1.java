package scanner;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write your name: ");
        String name = sc.nextLine();

        System.out.print("Write your age: ");
        int age = sc.nextInt();

        System.out.println("Your name is " + name + " and your age is " + age);
    }
}
