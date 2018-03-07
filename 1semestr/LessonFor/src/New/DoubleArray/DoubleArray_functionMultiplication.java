package New.DoubleArray; // 2 задача на массивы

import java.util.Random;
import java.util.Scanner;

public class DoubleArray_functionMultiplication {

    public static void Multiplication(int matrix1[][], int matrix2[][], int newmatrix[][]) {

        for (int k = 0; k < matrix1.length; k++) {
            for (int i = 0; i < matrix1.length; i++) {
                int h = 0;
                for (int j = 0; j < matrix1[i].length; j++) {
                    h += matrix1[i][j] * matrix2[j][k];
                }
                newmatrix[i][k] = h;
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

    public static void readMatrix(int matrix[][]) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int
                n = scanner.nextInt();

        int
                matrix1[][] = new int[n][n],
                matrix2[][] = new int[n][n],
                newmatrix[][] = new int[n][n];

        readMatrix(matrix1);

        showMatrix(matrix1);

        System.out.println(" ");

        readMatrix(matrix2);

        showMatrix(matrix2);

        System.out.println(" ");

        Multiplication(matrix1, matrix2, newmatrix);

        showMatrix(newmatrix);



    }
}
