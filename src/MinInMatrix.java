import java.util.Scanner;

public class MinInMatrix {
    public static void main(String[] args) {
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        row = sc.nextInt();
        System.out.println("Enter the column: ");
        col = sc.nextInt();
        int[][] matrix = new int[row][col];

        //Nhập phần tử cho mảng
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }
        //tim min
        int min = matrix[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("The smallest element in the matrix is: " + min);
    }
}
