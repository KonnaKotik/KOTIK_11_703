package Array.November_1_2017_ClassWork;

import java.util.Scanner;

public class ExersiceM_13_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] a = {2,2,3,4,4,4,5,5,6,6,6,6,7};
        int n = scanner.nextInt();
        int [] w = new int[n];

        for(int i = 1; i < n - 1; i++) {
            if (a[i] != a[i-1] && a[i] != a[i+1]) {
                w[i] = a[i];
            }
        }

        if (a[0] != a[1]) w[0] = a[0];
        if (a[n-1] != a[n-2]) w[n-1] = a[n-1];

        for (int i = 0; i < n; i++) {
            System.out.print(w[i] + " ");
        }
    }
}
