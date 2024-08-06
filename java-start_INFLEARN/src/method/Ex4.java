package method;

import java.util.Scanner;

public class Ex4 {
    static int balance = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.print("선택: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                deposit();
            }
            if (choice == 2) {
               withdraw();
            }
            if (choice == 3) {
                System.out.println("현재 잔액: " + balance);
            } else if (choice == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }

    public static void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("입금액을 입력하세요: ");
        int depositAmount = sc.nextInt();
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance);

    }

    public static void withdraw() {
        Scanner sc = new Scanner(System.in);

        System.out.print("출금액을 입력하세요: ");
        int withdrawAmount = sc.nextInt();

        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance);
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
    }
}
