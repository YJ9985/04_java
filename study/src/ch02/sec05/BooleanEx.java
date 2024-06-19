package ch02.sec05;

public class BooleanEx {
    public static void main(String[] args) {
        boolean stop = true;
        if(stop) {
            System.out.println("STOP!!");
        } else {
            System.out.println("START!!");
        }
        int x = 10;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
