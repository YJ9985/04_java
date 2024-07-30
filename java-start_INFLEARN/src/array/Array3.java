package array;

public class Array3 {
    public static void main(String[] args) {
        //배열 생성과 초기화
        int[] students = new int[]{90, 80, 70, 60, 50};

        for (int i = 0; i < students.length; i++) {
            System.out.println("students" + (i+1) + " score: " + students[i]);
        }
    }
}
