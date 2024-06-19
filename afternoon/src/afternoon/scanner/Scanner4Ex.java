package afternoon.scanner;

import java.util.Scanner;

public class Scanner4Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시작 정수를 입력하세요: ");
        int startnum = sc.nextInt();

        System.out.print("종료 정수를 입력하세요: ");
        int endnum = sc.nextInt();

        if(startnum > endnum) {
            System.out.println("시작 정수가 종료 정수보다 큽니다!");
            return;
        }
            int sum = 0;
                for (int i = startnum; i <= endnum; i++) {
                    sum += i;
                }
                System.out.println("시작 수부터 종료 수 까지의 합은 : " + sum);
            }
        }



