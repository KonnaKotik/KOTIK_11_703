package October_18_2017;

import java.util.Scanner;

public class ExerciseM2_22_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt(), q = 0;
         int [] a = new int[n];

         for ( int i = 0; i < n; i++) {
             a[i] = (int) Math.round(Math.random() * 100 - 30);
             System.out.print(a[i] + " ");
         }
         System.out.println(" ");
         for ( int i = 0; i < (n-1); i++) {
             if (a[i]*a[i+1] < 0) q++;
         }
         System.out.println(q);

    }
}
