package exception.basic;

public class ExceptionWithout {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int idx = 5;

        //예외가 발생할 수 있는 상황을 아예 피해버림.
        if (idx < arr.length) {
            System.out.println(arr[idx]);
        } else{
            System.out.println("나오나요?");
        }

    }
}
