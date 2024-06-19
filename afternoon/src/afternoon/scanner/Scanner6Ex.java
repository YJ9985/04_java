package afternoon.scanner;

import java.util.Scanner;

public class Scanner6Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = (int)(Math.random()*100);

        while(true) {
            System.out.print("랜덤 숫자를 입력하세요: ");
            int number = sc.nextInt();

            if(answer == number) {
                System.out.println("정답입니다! 랜덤 숫자는 :" + answer);
                break;
            }else if (answer > number) {
                System.out.println("Up");
            }else {
                System.out.println("Down");
            }
        }
    }
}
