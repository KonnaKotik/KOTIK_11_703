package New.DoubleArray; // 3 задача

import java.util.Scanner;

public class DoubleArray_findString {
    public static void showMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void readMatrix(int matrix[][]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int
                n = scanner.nextInt(),
                m = scanner.nextInt();

        boolean f = true, h = false;

        int
                matrix[][] = new int[n][m];

        readMatrix(matrix);
        System.out.println(" ");
        showMatrix(matrix);
        System.out.println(" ");

        for (int k = 0; k < n - 1 && !h; k++) {
            for (int i = k+1; i < n; i++) {
                for (int j = 0; j < m && f; j++) {
                    if (matrix[i][j] != matrix[k][j]) {
                        f = false;
                    }
                }
                h = f;
                f = true;
            }
        }

        if (h) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
