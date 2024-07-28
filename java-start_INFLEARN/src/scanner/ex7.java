package scanner;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.print("Write name(write exit to exit): ");
            String name = sc.nextLine();

            if (name.equals("exit")) {
                System.out.println("Program Terminated");
                break;
            }

            System.out.print("Write age(write exit to exit): ");
            String age = sc.nextLine();

            if (age.equals("exit")) {
                System.out.println("Program Terminated");
                break;
            }

            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

}
