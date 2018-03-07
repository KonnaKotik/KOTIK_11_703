package DoubleArray.November_15_2017_Homework;

import java.util.Random;
import java.util.Scanner;

public class Task_1 {

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
        Random r = new Random();

        int
                n = scanner.nextInt(),
                m = scanner.nextInt(),
                t = 0,
                matrix[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(30);
            }
        }
        showMatrix(matrix);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix[i].length - 1; k++) {
                    if (matrix[j][k] < matrix[j][k+1]) {
                        t = matrix[j][k];
                        matrix[j][k] = matrix[j][k+1];
                        matrix[j][k+1] = t;
                    }
                }
            }
        }

        System.out.println(" ");

        showMatrix(matrix);
    }
}
