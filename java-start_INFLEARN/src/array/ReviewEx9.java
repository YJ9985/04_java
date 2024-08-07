package array;

import java.util.Scanner;

public class ReviewEx9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxCount = 10;
        String[] productNames = new String[maxCount];
        int[] productPrice = new int[maxCount];
        int productCount = 0;


        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                if(productCount >= maxCount) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                }

                System.out.print("상품 이름을 입력하세요: ");
                    productNames[productCount] = sc.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                    productPrice[productCount] = sc.nextInt();


                productCount++;

            } else if (choice == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrice[i] + "원");
                }

            } else if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("올바른 메뉴를 선택해주세요.");
            }
        }
    }
}
