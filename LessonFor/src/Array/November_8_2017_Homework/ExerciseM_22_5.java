package Array.November_8_2017_Homework;

import java.util.Random;
import java.util.Scanner;

public class ExerciseM_22_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int t = 0;
        boolean f = true;

        Random r = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i] + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < n; i++) {
            f = true;
            for (int j = 0; j < n; j++) {
                if (i != j && a[i] == a[j])
                    f = false;
            }
            if (f == true)
                t++;
        }

        System.out.println(t);
    }
}
