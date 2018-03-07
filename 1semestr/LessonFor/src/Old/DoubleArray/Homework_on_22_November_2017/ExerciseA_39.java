package DoubleArray.Homework_on_22_November_2017;

import java.util.Random;
import java.util.Scanner;

public class ExerciseA_39 {
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
                p = scanner.nextInt(),
                m = scanner.nextInt(),
                q = 0,
                w = 0,
                k = 100;

        int
                matrix[][] = new int[m][n];
        int
                [] array = new int[p],
                indexarray = new int[k];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < p; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        showMatrix(matrix);
        System.out.println(" ");

        for (int x = 0; x < p; x++) {
            while (array[x] != matrix[q][w]) {


            }
        }
    }
}
