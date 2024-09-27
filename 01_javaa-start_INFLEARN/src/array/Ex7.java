package array;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        double avg;

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 성적: ");
                scores[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += scores[i][j];
            }
            avg = (double) sum / 3;
            System.out.println((i + 1) + "번 학생의 총점: " + sum + ", 평균: " + avg);
        }
    }

}
