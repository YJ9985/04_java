package method;

public class Ex1 {
    public static void main(String[] args) {
        average(1, 2, 3);
        average(15, 25, 35);
    }

    public static double average (int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값: " + average);
        return average;
    }
}
