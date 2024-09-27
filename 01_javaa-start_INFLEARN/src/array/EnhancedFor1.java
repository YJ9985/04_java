package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("일반 for문");
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        //위 코드와 동일한 결과. numbers 배열의 값이 하나씩 끝까지 돌면서 number 변수에 저장되어 실행
        //단축키: iter
        System.out.println("향상된 for문");
        for (int number : numbers) {
            System.out.println(number);
        }

        //증가하는 index값이 필요한 경우: for-each 사용 불가능
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는 " + numbers[i]);
        }
    }
}
