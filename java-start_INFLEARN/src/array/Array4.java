package array;

public class Array4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50, 40, 30};

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student" +(i+1) + " Score: " + students[i]);
        }
    }
}
