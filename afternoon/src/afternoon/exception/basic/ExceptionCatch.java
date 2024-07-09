package afternoon.exception.basic;

public class ExceptionCatch {
    public static void main(String[] args) {
        try{
            //예외가 발생할 것 같은 코드 작성
            int[] arr = {1,2,3,4,5};
            System.out.println("arr[5]");
        } catch (Exception e){
            e.printStackTrace();
        }
        //try catch 구문에서 error 잡아서 "나오나요?"가 출력 가능
        System.out.println("나오나요?");
    }
}
