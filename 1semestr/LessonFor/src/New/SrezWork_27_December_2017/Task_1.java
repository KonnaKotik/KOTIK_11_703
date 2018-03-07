package New.SrezWork_27_December_2017;

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
        Random random = new Random();

        int
                n = scanner.nextInt(),
                m = scanner.nextInt(),
                min = 0,
                mini = 0,
                minj = 0,
                max = 0,
                maxi = 0,
                maxj = 0,
                matrix[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        showMatrix(matrix);

        for (int i = 0; i < n; i++) {
            min = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minj = j;
                    mini = i;
                }
                if (i==0) {
                    max = min;
                    maxi = mini;
                    maxj = minj;
                }
                if (i != 0 && min > max) {
                    max = min;
                    maxi = mini;
                    maxj = minj;
                }
            }
        }

        for (int j = 0; j < matrix.length; j++) {
            System.out.print(matrix[maxi][j] + " " );
        }

        System.out.println(maxj);
    }


}
