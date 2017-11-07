package Array.November_1_2017_ClassWork;

import java.util.Scanner;

public class ExerciseM_13_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] a = {2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 7};
        int n = scanner.nextInt();
        int k = 1, d = 0;
        int[] u = new int[n];

        for (int i = 1; i < n; i++) {
            if (a[i] == a[i-1]) k++;
            if (a[i] != a[i-1]) {
                u[d] = k;
                k = 1;
                d++;
            }
        }
        if (a[n-1] == a[n-2]) u[d] = k;
        if (a[n-1] != a[n-2]) u[d] = k;

        for (int i = 0; i < n; i++) {
            System.out.print(u[i] + " ");
        }
    }

}
