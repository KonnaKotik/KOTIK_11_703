package Array.November_8_2017_Homework;

import java.util.Scanner;

public class ExerciseM_15_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] a = {2, 5, 1, 2, 3, 4, 3, 9, 6, 8, 9, 2};
        int
                n = scanner.nextInt(),   //странное задание размерности. Одно объяснение: вы хотите варьировать входной массив, да?
                k = 1;
        int[] u = new int[n];

        for (int i = 0; i < n - 1; i++) {
            if (a[i] <= a[i + 1]) k++;
            if (a[i] > a[i + 1]) {            //почему это независимые проверки?
                u[k-1]++;
                k = 1;
            }
        }
        if (a[n - 2] <= a[n - 1]) u[k-1]++;
        if (a[n - 2] > a[n - 1]) u[k-1]++;        

        for (int i = 0; i < n; i++) {
            System.out.print(u[i] + " ");
        }
    }
}
