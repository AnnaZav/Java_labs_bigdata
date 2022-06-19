package lab2;

import java.util.Date;
import java.util.Scanner;

public class Lab2_p3p4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -n + (int) (Math.random() * (2 * n + 1));
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[][] matrix_rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix_rotated[i][j] = matrix[j][n - 1 - i];
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix_rotated[i][j] + " ");
            }
            System.out.println();
        }

        int determinant,x,y,z;
        x = (matrix[0][0] * (matrix[1][1] * matrix[2][2]
                - matrix[1][2] * matrix[2][1]));
        y = (matrix[0][1] * (matrix[1][0] * matrix[2][2]
                - matrix[1][2] * matrix[2][0]));
        z = (matrix[0][2] * (matrix[1][0] * matrix[2][1]
                - matrix[1][1] * matrix[2][0]));
        determinant = x - y + z;
        System.out.println("Определитель матрицы: " + determinant);

        System.out.println("Завьялова Анна Павловна");
        Date date = new Date();
        System.out.println(date.toString());
    }
}