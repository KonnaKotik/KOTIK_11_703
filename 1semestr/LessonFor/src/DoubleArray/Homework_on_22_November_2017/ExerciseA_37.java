package DoubleArray.Homework_on_22_November_2017;

import java.util.Random;
import java.util.Scanner;

public class ExerciseA_37 {

    public static void showMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int
                n = scanner.nextInt();
        int
                matrix[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        showMatrix(matrix);
        System.out.println(" ");

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n-1-i; j++){
                matrix[i][j] = 0;
            }
        }

        for (int i = n-1; i >= 0; i--){
            for (int j = i-1; j > n-i-1; j--){
                matrix[i][j] = 0;
            }
        }

        showMatrix(matrix);
    }
}
