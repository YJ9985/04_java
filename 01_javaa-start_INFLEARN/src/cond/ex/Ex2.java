package cond.ex;

public class Ex2 {
    public static void main(String[] args) {
        int distance = 200;
        String vehicle;

        if (distance < 1) {
            vehicle = "도보";
        } else if (distance < 10) {
            vehicle = "자전거";
        } else if (distance < 100) {
            vehicle = "자동차";
        } else {
            vehicle = "비행기";
        }

        System.out.println("distance = " + distance);
        System.out.println("출력: " + vehicle + "을 이용하세요");
    }
}
