package Array.October_24_2017;

import java.util.Scanner;

public class ExerciseM_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] a = {45, 3, 5, 13, 23, 2, 32, 14};
        int k, min = a[1], max = a[1], p = 1, q = 1, s = 0;

        for ( int i = 0; i < n; i++ ) {
            if (a[i] < min) {
                min = a[i];
                p = i;
            }
            if (a[i] > max) {
                max = a[i];
                q = i;
            }
        }
        if (p < q) {
            for (int i = (p + 1); i < q; i++) {
                s += a[i];
            }
        }
        else {
            for (int i = (q + 1); i < p; i++) {
                s += a[i];
            }
        }
        System.out.println(s);
    }
}
