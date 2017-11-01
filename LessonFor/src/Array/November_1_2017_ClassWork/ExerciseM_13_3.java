package Array.November_1_2017_ClassWork;

import java.util.Scanner;

public class ExerciseM_13_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] a = {2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7};
        int n = scanner.nextInt();
        int k = 1;
        int[] v = new int[n];

        for (int i = 0; i < (n-1); i++) {
            if (a[i] == a[i+1]) k++;
            if (a[i] != a[i+1]){
                v[k-1]++;
                k = 1;
            }
        }

        v[k-1]++;

        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
