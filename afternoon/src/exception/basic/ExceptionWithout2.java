package exception.basic;

import afternoon.extendss.superrr.Parent;

public class ExceptionWithout2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        if (accessArr(arr, 5)) {
            System.out.println("배열 접근 가능");
            System.out.println("하던 작업 이어가기");

            Object obj = null;

            if(accessNull(obj)){
                System.out.println("객체가 null이 아닙니다");
                System.out.println("원하던 작업을 이어갑니다");
            } else{
                System.out.println("객체가 비어있음. 에러 발생");
            }
        } else {
            System.out.println("배열 접근 불가능");
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
