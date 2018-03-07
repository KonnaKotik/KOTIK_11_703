package October_18_2017;//+

import java.util.Random;
import java.util.Scanner;

public class ExerciseM2_22_g {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        Random r = new Random();

        int n = scanner.nextInt(), q, k = 0, p = 0;
        int [] a = new int[n];

        for ( int i = 0; i < n; i++) {
            a[i] = r.nextInt(10);
            q = a[i];
            System.out.print(a[i] + " ");
            for (int j = 2; j < (q +1); j++) {
                if ( (q % j == 0) & (q != 0) ) k++;
            }
            if (k < 2) {
                p++;
                k = 0;
            }
        }
        System.out.println(" ");
        System.out.println(p);
    }
}
