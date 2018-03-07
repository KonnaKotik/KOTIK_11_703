package DoubleArray;

import java.util.Scanner;

public class Matrix1 {
    public static void readMatrix(int matrix[][]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void showMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int matrix[][] = new int[n][m];

        readMatrix(matrix);
        showMatrix(matrix);


        for (int i = 0; i < n; i++) {
            int min = matrix[0][i];
            for (int j = 0; j < m; j++) {
                if (matrix[j][i] < min) min = matrix[j][i];
            }
            System.out.println(min);
        }
    }
}
