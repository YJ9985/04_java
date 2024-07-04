package exception.basic;

public class ExceptionLetitgo {
    public static void main(String[] args) {
        //예외 상황 발생시키기 1. 배열접근
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[4]);
        //arr[5]는 작동하지 않는다(오류) : 배열은 0부터 시작하기 때문에 5번째 배열값은 존재하지 않기 때문이다.
        //따라서 오류가 발생하면 아래 "나오나요?"는 출력될 수 없다.
        System.out.println("나오나요?");
    }
}
