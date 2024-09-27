package cond.ex;

public class Ex4 {
    public static void main(String[] args) {
        double rating = 7.1;

        // 여러개를 출력되게 하려면 if 문을 여러개 입력.
        //else if 사용하면 안 됨.
        if (rating <= 9) {
            System.out.println("\'어바웃타임\'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("\'토이스토리\'를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("\'고질라\'를 추천합니다.");
        }
    }
}
