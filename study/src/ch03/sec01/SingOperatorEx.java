package ch03.sec01;

public class SingOperatorEx {
    public static void main(String[] args) {
        int x = - 100;
        x = -x;
        System.out.println("x:" +x);

        byte b = 100;
        int y = -b;
        System.out.println("y:" + y);
    }
}
