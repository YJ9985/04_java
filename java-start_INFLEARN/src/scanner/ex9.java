package scanner;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double average = 0;
        int number = 0;

        System.out.println("Write number(write -1 to stop): ");
/*        while (true) {
            int number = sc.nextInt();
            if (number == -1) {
                break;
            }

            sum += number;
            count ++;

        }

 */
        //축약 버전
        while ((number = sc.nextInt()) != -1) {
            sum += number;
            count++;
        }

        average = (double) sum / count;
        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
