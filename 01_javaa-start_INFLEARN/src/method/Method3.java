package method;

public class Method3 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);

        boolean result2 = even(2);
        System.out.println(result2);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean even(int i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
