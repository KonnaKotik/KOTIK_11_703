package DoubleArray.Homework_on_22_November_2017;

import java.util.Random;
import java.util.Scanner;

public class ExerciseA_38 {
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
        Random random = new Random();

        int
                n = scanner.nextInt(),
                t1 = 1,
                t2 = 1,
                k = 0,
                x = 0;

        int
                matrix[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        showMatrix(matrix);
        System.out.println(" ");

        for (int i = 1; i < n && k < n; i++) {
            t1 = matrix[i][k];
            t2 = matrix[k][k];
            if (t1 == 0) {
                t1 = 1;
            }
            if (t2 == 0) {
                t2 = 1;
            }
            for (int j = k; j < n; j++) {
                    matrix[i][j] *= t2;
                    matrix[k][j] *= t1;
                    matrix[i][j] -= matrix[k][j];
            }
            if (matrix[n - 1][k] == 0) {
                i = 1;
                k++;
                x++;
            }
        }

        showMatrix(matrix);
    }
}
