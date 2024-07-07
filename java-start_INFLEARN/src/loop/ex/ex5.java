package loop.ex;

public class ex5 {
    public static void main(String[] args) {

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                int sum = a * b;
                System.out.println(a + " * " + b + " = " + sum);
            }
        }
    }
}
