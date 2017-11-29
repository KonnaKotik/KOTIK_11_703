package Array.November_1_2017_ClassWork;

import java.util.Random;
import java.util.Scanner;

public class TheTaskArray_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        boolean f = true;

        Random r = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(2);
            System.out.print(a[i] + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < n & f; i++) {
            if (a[i] != 0)
                f = false;
        }

        if (f)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
