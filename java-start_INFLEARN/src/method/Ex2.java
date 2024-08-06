package method;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        repeatMsg("Hello, world!", 3);
        repeatMsg("Hello, java", 4);
    }

    public static void repeatMsg(String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }
}
