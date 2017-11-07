package Array.November_8_2017_Homework;

import java.util.Scanner;

public class ExerciseM_15_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] a = {2, 5, 1, 2, 3, 4, 3, 9, 6, 8, 9, 2, 3};
        int n = scanner.nextInt();
        int
                k = 1,
                s = n,
                t = 0;

        for (int i = 0; i < n -1; i++) {
            if (a[i] <= a[i+1] && k <= s) {
                k++;
                s = k;
            }
            if (a[i] <= a[i+1] && k >= t) {
                k++;
                t = k;
            }
            if (a[i] > a[i+1]) k = 1;
        }

        if (a[n-2] <= a[n-1] && k < s) {
            k++;
            s = k;
        }
        if (a[n-2] <= a[n-1] && k > t) {
            k++;
            t = k;
        }
        if (a[n-2] > a[n-1]) s = 1;

        System.out.println(s + " - самая короткая неуюывающая цепочка");
        System.out.println(t + " - самая длинная неубывающая цепочка");
    }
}
