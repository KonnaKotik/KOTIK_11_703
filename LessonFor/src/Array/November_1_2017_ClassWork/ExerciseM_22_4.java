package Array.November_1_2017_ClassWork;

import java.util.Random;
import java.util.Scanner;

public class ExerciseM_22_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        boolean f = false;

        Random r = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(50);
            System.out.print(a[i] + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < (n/2) & !f; i++) {
            for (int j = 0; j < n & !f; j++) {
                if (i != j && a[i] == a[j])
                    f = true;
            }
        }
        if (f)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
