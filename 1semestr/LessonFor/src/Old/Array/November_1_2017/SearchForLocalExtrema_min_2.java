package Array.November_1_2017;

import java.util.Random;
import java.util.Scanner;

public class SearchForLocalExtrema_min_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();

        int
                n = scanner.nextInt(),
                min = 0,
                r = 0,
                b = 0;
        int
                [] a = new int[n];


        for (int i = 0; i < n; i++) {
            a[i] = ran.nextInt(10);
            System.out.print(a[i] + " ");
        }

        System.out.println(" ");


        for (int i = (n - 1); i >= 0; i--) {
            min = a[i];
            r = i;
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] <= min) {
                    min = a[j];
                    r = j;
                }
            }
            b = a[i];
            a[i] = a[r];
            a[r] = b;
        }

        for (int i = 0; i < n; i++)

        {
            System.out.print(a[i] + " ");
        }
    }
}
