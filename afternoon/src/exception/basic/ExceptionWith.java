package exception.basic;

public class ExceptionWith {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            accessArr(arr, 5);
            System.out.println("예외 발생하지 않음");
            System.out.println("작업 재개");

            Object obj = null;

            accessNull(obj);
            System.out.println("객체가 null이 아님");
            System.out.println("작업 재개");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean accessArr (int[] arr, int idx){
        if (idx < arr.length) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean accessNull(Object obj) {
        if (obj == null) {
            return true;
        } else {
            return false;
        }
    }
}
