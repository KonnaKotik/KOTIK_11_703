package Array.October_24_2017;//-

import java.util.Random;
import java.util.Scanner;

public class ExerciseM_3 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        Random r = new Random();

        int n = scanner.nextInt();
        int [] a = new int[n];
        int k, max, s = 1;

        for ( int i = 0; i < n; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i] + " ");
        }
        max = a[1];
        k = 1;

        for ( int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                k = i;
            }
        }
        for ( int i = (k + 1); i < n; i++ ) {
            s *= a[i];    //проверка на нули
        }
        System.out.println(s);
    }
}
