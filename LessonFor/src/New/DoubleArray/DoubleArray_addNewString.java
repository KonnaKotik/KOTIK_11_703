package New.DoubleArray; // 1 задача

import java.util.Random;
import java.util.Scanner;

public class DoubleArray_addNewString {

    public static void readMatrix(int matrix[][]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length - 1; i++) {
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
        Random random = new Random();

        int
                n = scanner.nextInt(),
                m = scanner.nextInt(),
                add = 0,
                r = 0,
                t = 0;

        int
                matrix[][] = new int[n + 1][m],
                addstring[] = new int[m];

        boolean f = false;

        readMatrix(matrix);
        System.out.println(" ");
        showMatrix(matrix);
        System.out.println(" ");

        for (int j = 0; j < m; j++) {
            addstring[j] = scanner.nextInt();
            System.out.print(addstring[j] + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < n + 1 && !f; i++) {
            add = addstring[0];
            if (add <= matrix[i][0] && add >= matrix[i + 1][0]) {
                f = true;
                r = i;
            }
        }
        System.out.println(r);

        for (int i = n - 1; i > r; i--) {
            for (int j = 0; j < m; j++) {
                t = matrix[i+1][j];
                matrix[i+1][j] = matrix[i][j];
                matrix[i][j] = t;
            }
        }

        System.out.println(" ");
        showMatrix(matrix);
        System.out.println(" ");

        for (int j = 0; j < m; j++) {
            matrix[r+1][j] = addstring[j];
        }

        System.out.println(" ");
        showMatrix(matrix);


    }
}