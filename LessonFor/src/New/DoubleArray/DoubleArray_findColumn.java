package New.DoubleArray;

import java.util.Scanner;

public class DoubleArray_findColumn {
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
                n = scanner.nextInt();

        boolean f = true, h = false;

        int
                matrix[][] = new int[n][n];

        readMatrix(matrix);
        System.out.println(" ");
        showMatrix(matrix);
        System.out.println(" ");

        for (int k = 0; k < n && !h; k++) {
            for (int i = 0; i < n && !h; i++) {
                for (int j = 0; j < n && f; j++) {
                    if ((i!=j) && (matrix[i][j] != matrix[j][k])) {
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
