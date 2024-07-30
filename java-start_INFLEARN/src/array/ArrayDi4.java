package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        int i = 1;
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                System.out.print(arr[row][colum] + " ");
            }
            System.out.println();
        }
    }
}
